import java.util.LinkedList;
import java.util.Random;

public class Principal {

    public static void popular(int quantidade, LinkedList<Integer> lista) {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++) {
            lista.add(gerador.nextInt(100));
        }
    }

    public static void exibir(LinkedList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    public static void main(String a[]) {
        LinkedList<Integer> lista = new LinkedList<Integer>();
        popular(100, lista);
        // tempoInicio = pegaClock();
        MetodosOrdenacao.bolha(lista);
        // tempoFim = pegaClock();
        exibir(lista);
    }
}