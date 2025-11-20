package com.mycompany.compilador;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class MarteErrorListener extends BaseErrorListener {
    
    // Variável estática para sabermos no Main se houve erro
    public static boolean temErro = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, 
                            Object offendingSymbol, 
                            int line, 
                            int charPositionInLine, 
                            String msg, 
                            RecognitionException e) {
        
        temErro = true;
        
        // Formatação amigável da mensagem de erro em Português
        System.err.println(">>> Erro Sintático na linha " + line + ":" + charPositionInLine);
        System.err.println("    Detalhe: " + msg);
        System.err.println("------------------------------------------------");
    }
}