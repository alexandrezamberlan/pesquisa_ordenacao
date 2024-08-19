import java.util.ArrayList;
import java.util.Random;
import java.io.FileReader;
import java.io.FileWriter;

public class Util {

    /**
     * Método estático que copia as palavras contidas em um arquivo texto para uma lista
     * @param lista - nome da lista que conterá as palavras vindas do arquivo
     * @param nomeArquivo - arquivo fonte com as palavras
     */
    public static void popularPalavrasListaDeArquivo(ArrayList<String> lista, String nomeArquivo){
        try {
            FileReader fr;
            fr = new FileReader(nomeArquivo);
            BufferedReader bf = new BufferedReader(fr);
            String linha;
            do {
                linha = bf.readLine();
                if (linha == null) {
                    break;
                }
                lista.add(linha);
            } while(true);
            bf.close();
        }catch (Exception e){
            System.out.println("Erro "+ e.getMessage());
        }
    }    

    /**
     * Método estático que popula um arquivo com palavras aleatórias
     * @param nomeArquivo - nome do arquivo destino para as palavras geradas
     * @param quantidade - quantas palavras se deseja gerar
     * @param tamanho - quantidade de caracteres da palavra a ser gerada
     */
    public static void gerarPalavrasArquivo(String nomeArquivo, int quantidade, int tamanho) {
        try {
            FileWriter fw;
            //fw = new FileWriter(nomeArquivo, true); // Não reescreve o arquivo arq.txt (adiciona ao arquivo)
            fw = new FileWriter(nomeArquivo);
            
            for (int i = 0; i < quantidade; i++) {
                fw.write(Util.gerarPalavra(tamanho) + "\n"); 
            }
            fw.close();
        } catch (Exception e){
            System.out.println("Erro "+ e.getMessage());
        }
    }
    
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
