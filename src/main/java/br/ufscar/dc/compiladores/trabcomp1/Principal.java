package br.ufscar.dc.compiladores.trabcomp1;

import java.io.PrintWriter;
import java.io.IOException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

/*
 *  
 *  Alain Gauthier N. Djamba
 *  R.A 725921
 *  Trabalho 1 - Compiladores
 *
 */

public class Principal {

    public static void main(String args[]) throws IOException {
         CharStream cs = CharStreams.fromFileName(args[0]);
         AlgumaLexer lex = new AlgumaLexer(cs);
         
         try ( PrintWriter myWriter = new PrintWriter(args[1])) {
             /* armazenamento dos tokens lidos */
             Token t = null;
             
             /* string que auxilia na impressão da saída (lexema + classe) */
             String nameOfToken = new String(); 
             
             while ((t = lex.nextToken()).getType() != Token.EOF) {
                 String classe = AlgumaLexer.VOCABULARY.getSymbolicName(t.getType());
                 
                 /* identificacão das classes dos tokens */
                 if (classe.equals("PALAVRA_CHAVE") || 
                     classe.equals("DELIM") || 
                     classe.equals("OPERADORES")) {
                     nameOfToken += "<\'" + t.getText() + "\',\'" + t.getText() + "\'>";
                 } else if (classe.equals("IDENT") || 
                            classe.equals("CADEIA") || 
                            classe.equals("NUM_INT") || 
                            classe.equals("NUM_REAL")) {
                    nameOfToken += "<\'" + t.getText() + "\'," + classe + ">";
                } else {
                    // caso nenhum padrão seja conhecido, existe erro no arquivo_entrada (símbolo desconhecido, 
                    // comentário não fechado, cadeia não fechada ou erro desconhecido
                    if (classe.equals("ERRO_SIMBOLO")) {
                        nameOfToken += "Linha " + t.getLine() + ": " + t.getText()
                                + " - simbolo nao identificado";
                    } else if (classe.equals("COMENTARIO_ERRO")) {
                        
                        nameOfToken += "Linha " + t.getLine() + ": comentario nao fechado";
                    } else if (classe.equals("CADEIA_ERRO")) {
                        nameOfToken += "Linha " + t.getLine() + ": cadeia literal nao fechada";
                    } else {
                        nameOfToken += "Erro nao identificado!";
                    }
                    break;
                 }
                 
                 /* Impressão da saída */
                 myWriter.println(nameOfToken);
                 
                 /* o array é restaurado antes de cada nova iteration */
                 nameOfToken = "";
             
             }
         }
        
    }
    
}
