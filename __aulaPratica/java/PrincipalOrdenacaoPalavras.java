package java;
import java.util.ArrayList;
import java.util.Collections;
public class PrincipalOrdenacaoPalavras {
    public static void main(String[] args) {
        ArrayList<String> listaBolha = new ArrayList<>();
        ArrayList<String> lista = new ArrayList<>();
        Util.gerarPalavrasLista(listaBolha, 10000, 10);
        Util.gerarPalavrasLista(lista, 10000, 10);

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
                Collections.sort(lista);
                System.out.println("Feitooooo.... sort java");
            }
        }.start();
    }
}
