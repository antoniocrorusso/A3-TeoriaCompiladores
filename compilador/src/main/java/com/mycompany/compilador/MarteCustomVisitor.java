package com.mycompany.compilador;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MarteCustomVisitor extends MarteBaseVisitor<String> {

    // StringBuilder para montar o código Java final
    StringBuilder codigoJava = new StringBuilder();

    @Override
    public String visitProgram(MarteParser.ProgramContext ctx) {
        // Estrutura básica de uma classe Java
        codigoJava.append("import java.util.Scanner;\n");
        codigoJava.append("public class Resultado {\n");
        codigoJava.append("    public static void main(String[] args) {\n");
        codigoJava.append("        Scanner scanner = new Scanner(System.in);\n");
        
        // Visita todos os filhos (declarações e statements)
        visitChildren(ctx);
        
        codigoJava.append("        scanner.close();\n");
        codigoJava.append("    }\n");
        codigoJava.append("}\n");
        
        return codigoJava.toString();
    }

    @Override
    public String visitDeclaration(MarteParser.DeclarationContext ctx) {
        String tipo = ctx.type().getText();
        String id = ctx.ID().getText();
        
        // Tradução de tipos Marte -> Java
        switch(tipo) {
            case "int": tipo = "int"; break;
            case "float": tipo = "double"; break; // Java usa double preferencialmente
            case "bool": tipo = "boolean"; break;
        }

        codigoJava.append("        ").append(tipo).append(" ").append(id);

        if (ctx.expr() != null) {
            codigoJava.append(" = ").append(visit(ctx.expr()));
        }
        
        codigoJava.append(";\n");
        return null;
    }

    @Override
    public String visitAssignStmt(MarteParser.AssignStmtContext ctx) {
        String id = ctx.ID().getText();
        String expr = visit(ctx.expr());
        codigoJava.append("        ").append(id).append(" = ").append(expr).append(";\n");
        return null;
    }

    @Override
    public String visitPrintfStmt(MarteParser.PrintfStmtContext ctx) {
        String conteudo = visit(ctx.expr());
        codigoJava.append("        System.out.println(").append(conteudo).append(");\n");
        return null;
    }

    @Override
    public String visitScanfStmt(MarteParser.ScanfStmtContext ctx) {
        String id = ctx.ID().getText();
        // Simplificação: assumindo leitura de int/double baseada no contexto seria ideal,
        // mas aqui vamos usar um helper genérico ou next() simples.
        // Para fins didáticos, vamos assumir que o usuário sabe o que está lendo,
        // mas num compilador real precisaríamos de uma Tabela de Símbolos.
        
        // Truque: Vamos tentar ler baseado no que vier, mas o ideal é checar o tipo da variável
        codigoJava.append("        // Lendo valor para ").append(id).append("\n");
        codigoJava.append("        if(scanner.hasNextInt()) ").append(id).append(" = scanner.nextInt();\n");
        codigoJava.append("        else if(scanner.hasNextDouble()) ").append(id).append(" = scanner.nextDouble();\n");
        codigoJava.append("        else if(scanner.hasNextBoolean()) ").append(id).append(" = scanner.nextBoolean();\n");
        return null;
    }

    @Override
    public String visitIfStmtNoElse(MarteParser.IfStmtNoElseContext ctx) {
        String condicao = visit(ctx.expr());
        codigoJava.append("        if (").append(condicao).append(") ");
        visit(ctx.statement());
        return null;
    }

    @Override
    public String visitIfStmtWithElse(MarteParser.IfStmtWithElseContext ctx) {
        String condicao = visit(ctx.expr());
        codigoJava.append("        if (").append(condicao).append(") ");
        visit(ctx.statement(0)); // bloco if
        codigoJava.append("        else ");
        visit(ctx.statement(1)); // bloco else
        return null;
    }

    @Override
    public String visitWhileStmt(MarteParser.WhileStmtContext ctx) {
        String condicao = visit(ctx.expr());
        codigoJava.append("        while (").append(condicao).append(") ");
        visit(ctx.statement());
        return null;
    }
    
    @Override
    public String visitBlock(MarteParser.BlockContext ctx) {
        codigoJava.append("{\n");
        visitChildren(ctx); // Visita o conteúdo do bloco
        codigoJava.append("        }\n");
        return null;
    }

    // --- Expressões ---
    // Como as expressões retornam valores (strings) para serem montadas,
    // nós sobrescrevemos os métodos para retornar a string da expressão.

    @Override
    public String visitExpr(MarteParser.ExprContext ctx) {
        return visit(ctx.orExpr());
    }

    @Override
    public String visitOrExpr(MarteParser.OrExprContext ctx) {
        String esq = visit(ctx.andExpr(0));
        for (int i = 1; i < ctx.andExpr().size(); i++) {
            String dir = visit(ctx.andExpr(i));
            esq += " || " + dir;
        }
        return esq;
    }

    @Override
    public String visitAndExpr(MarteParser.AndExprContext ctx) {
        String esq = visit(ctx.eqExpr(0));
        for (int i = 1; i < ctx.eqExpr().size(); i++) {
            String dir = visit(ctx.eqExpr(i));
            esq += " && " + dir;
        }
        return esq;
    }

    @Override
    public String visitEqExpr(MarteParser.EqExprContext ctx) {
        String esq = visit(ctx.relExpr(0));
        for (int i = 1; i < ctx.relExpr().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText(); // Pega o operador (== ou !=)
            String dir = visit(ctx.relExpr(i));
            esq += " " + op + " " + dir;
        }
        return esq;
    }

    @Override
    public String visitRelExpr(MarteParser.RelExprContext ctx) {
        String esq = visit(ctx.addExpr(0));
        for (int i = 1; i < ctx.addExpr().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText(); // <, >, <=, >=
            String dir = visit(ctx.addExpr(i));
            esq += " " + op + " " + dir;
        }
        return esq;
    }

    @Override
    public String visitAddExpr(MarteParser.AddExprContext ctx) {
        String esq = visit(ctx.mulExpr(0));
        for (int i = 1; i < ctx.mulExpr().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText(); // + ou -
            String dir = visit(ctx.mulExpr(i));
            esq += " " + op + " " + dir;
        }
        return esq;
    }

    @Override
    public String visitMulExpr(MarteParser.MulExprContext ctx) {
        String esq = visit(ctx.unary(0));
        for (int i = 1; i < ctx.unary().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText(); // *, / ou %
            String dir = visit(ctx.unary(i));
            esq += " " + op + " " + dir;
        }
        return esq;
    }

    @Override
    public String visitUnary(MarteParser.UnaryContext ctx) {
        if (ctx.primary() != null) {
            return visit(ctx.primary());
        }
        // Caso seja ! ou -
        return ctx.getChild(0).getText() + visit(ctx.unary());
    }

    @Override
    public String visitPrimary(MarteParser.PrimaryContext ctx) {
        if (ctx.expr() != null) {
            return "(" + visit(ctx.expr()) + ")";
        }
        return ctx.getText(); // ID ou Literal
    }
}