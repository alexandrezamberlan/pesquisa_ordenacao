package java;
import java.util.ArrayList;
import java.util.Collections;

public class PrincipalOrdenacao {
    public static void main(String[] args) {
        //gerar numeros em lista
        ArrayList<Integer> listaBolha = new ArrayList<>();
        ArrayList<Integer> lista = new ArrayList<>();
        Util.gerarNumerosLista(listaBolha, 1000000, 20000);
        Util.gerarNumerosLista(lista, 1000000, 20000);

        //aplicar ordenacao na lista: temporizar e contar esforço (comparações e trocas)
        
        new Thread() {
            public void run() {
                Ordenacao.bolha(listaBolha);
                System.out.println("Feitooooo.... bolha");
            }
        }.start();
        
        new Thread() {
            public void run() {
                Collections.sort(lista);
                System.out.println("Feitooooo.... sort java");
            }
        }.start();
        //exibir lista
        //Util.exibir(listaInteiros, "Ordenado por bolha");
    }
}
