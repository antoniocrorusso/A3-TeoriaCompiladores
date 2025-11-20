package com.mycompany.compilador;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.PrintWriter;
import java.io.IOException; // Import necessário para execução de processos

public class CompiladorMarte {
    public static void main(String[] args) {
        try {
            String arquivoFonte = "teste.mar";
            CharStream input = CharStreams.fromFileName(arquivoFonte);

            // 1. Lexer
            MarteLexer lexer = new MarteLexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new MarteErrorListener());
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 2. Parser
            MarteParser parser = new MarteParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new MarteErrorListener());
            
            // Reseta flag de erro
            MarteErrorListener.temErro = false;

            // 3. Parse
            ParseTree tree = parser.program();

            if (MarteErrorListener.temErro) {
                System.err.println("Compilação cancelada devido a erros sintáticos.");
                return;
            }

            // 4. Visitor (Geração de Código)
            MarteCustomVisitor visitor = new MarteCustomVisitor();
            String codigoGerado = visitor.visit(tree);

            // 5. Salvar arquivo Java
            try (PrintWriter out = new PrintWriter("Resultado.java")) {
                out.println(codigoGerado);
            }
            
            System.out.println("--- Código Java gerado com sucesso. ---");

            // ============================================================
            // 6. AUTOMATIZAÇÃO: Compilar e Executar o código gerado
            // ============================================================
            
            // Passo A: Chamar o 'javac Resultado.java'
            System.out.println("Compilando o arquivo Resultado.java...");
            ProcessBuilder compileProcess = new ProcessBuilder("javac", "Resultado.java");
            
            // inheritIO faz com que a saída do comando apareça no console do NetBeans
            compileProcess.inheritIO(); 
            Process pCompile = compileProcess.start();
            int compileResult = pCompile.waitFor(); // Espera terminar

            if (compileResult != 0) {
                System.err.println("Erro: O código Java gerado contém erros e não pôde ser compilado.");
                return;
            }

            // Passo B: Chamar o 'java Resultado'
            System.out.println("Executando o programa Marte...");
            System.out.println("----------------------------------");
            
            ProcessBuilder runProcess = new ProcessBuilder("java", "Resultado");
            runProcess.inheritIO(); // Permite que você interaja (digite input) no console
            Process pRun = runProcess.start();
            pRun.waitFor(); // Espera o programa terminar

            System.out.println("\n----------------------------------");
            System.out.println("Execução finalizada.");

        } catch (RuntimeException e) {
            System.err.println("Erro Semântico: " + e.getMessage());
        } catch (IOException | InterruptedException e) {
            System.err.println("Erro ao tentar executar o compilador Java: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}