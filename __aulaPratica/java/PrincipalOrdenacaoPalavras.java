//package java;
import java.util.ArrayList;
import java.util.Collections;
public class PrincipalOrdenacaoPalavras {
    public static void main(String[] args) {
        ArrayList<String> listaBolha = new ArrayList<>();
        ArrayList<String> listaSelecao = new ArrayList<>();
        ArrayList<String> listaInsercao = new ArrayList<>();
        ArrayList<String> lista = new ArrayList<>();
        int quantidade = 60000;
        Util.gerarPalavrasLista(listaBolha, quantidade, 10);
        Util.gerarPalavrasLista(listaSelecao, quantidade, 10);
        Util.gerarPalavrasLista(listaInsercao, quantidade, 10);
        Util.gerarPalavrasLista(lista, quantidade, 10);

        //aplicar ordenacao na lista: temporizar e contar esforço (comparações e trocas)
        
        new Thread() {
            public void run() {
                Ordenacao.bolhaPalavra(listaBolha);
                System.out.println("Feitooooo.... bolha");
                //Util.exibir(listaBolha, "Bolha palavras...");
            }
        }.start();

        new Thread() {
            public void run() {
                Ordenacao.selecaoPalavra(listaSelecao);
                System.out.println("Feitooooo.... selecao");
                //Util.exibir(listaSelecao, "Selecao palavras...");
            }
        }.start();

        new Thread() {
            public void run() {
                Ordenacao.insercaoPalavra(listaInsercao);
                System.out.println("Feitooooo.... insercao");
                //Util.exibir(listaInsercao, "Insercao palavras...");
            }
        }.start();
        
        new Thread() {
            public void run() {
                Collections.sort(lista);
                System.out.println("Feitooooo.... sort java");
            }
        }.start();
    }
}
