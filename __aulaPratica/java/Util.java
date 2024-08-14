package java;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Util {
    
    /**
     * Método estático que gera uma palavra aleatória a partir de um tamanho
     * @param tamanho - quantidade de caracteres da palavra
     * @return uma palavra aleatória
     */
    public static String gerarPalavra(int tamanho) {
        StringBuilder letras = new StringBuilder("abcdefghijklmnopqrstuvwxyz ");
        Random gerador = new Random();
        StringBuilder palavra = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            palavra.append( letras.charAt( gerador.nextInt( letras.length() ) ) );
        }

        return palavra.toString();
    }

    /**
     * Método estático que popula um lista com palavras aleatórias
     * @param lista - contém as palavras geradas
     * @param quantidade - quantas palavras se deseja gerar
     * @param tamanho - quantidade de caracteres da palavra a ser gerada
     */
    public static void gerarPalavrasLista(ArrayList<String> lista, int quantidade, 
                                          int tamanho) {
        for (int i = 0; i < quantidade; i++) {
            lista.add( Util.gerarPalavra(tamanho) );
        }
    }

    /**
     * Método estático que popula um lista com números aleatórios
     * @param lista - contém os números gerados
     * @param quantidade - quantas palavras se deseja gerar
     * @param tamanho - quantidade de caracteres da palavra a ser gerada
     */
    public static void gerarNumerosLista(ArrayList<Integer> lista, int quantidade, 
                                          int tamanho) {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++) {
            lista.add( gerador.nextInt(tamanho) );
        }
    }

    /**
     * Método estático que exibe elemento de qualquer lista
     * @param lista - contém números ou palavras
     * @param frase - título a ser exibido pelo método
     */
    public static void exibir(ArrayList lista, String frase) {
        System.out.println(frase);
        for (Object item : lista) {
            System.out.println(item);
        }
    }
}
