package java;
import java.util.ArrayList;
public class Ordenacao {
    public static void bolha(ArrayList<Integer> lista) {
        int aux;
        boolean houveTroca;
        int i;
        do {
            houveTroca = false;
            for (i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i) > lista.get(i + 1)) {
                    houveTroca = true;
                    aux = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, aux);
                }
            }
        } while (houveTroca);
    }

    public static void bolhaPalavra(ArrayList<String> lista) {
        String aux;
        boolean houveTroca;
        int i;
        do {
            houveTroca = false;
            for (i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i).compareTo(lista.get(i + 1)) > 0) {
                    houveTroca = true;
                    aux = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, aux);
                }
            }
        } while (houveTroca);
    }

    public void selecao(ArrayList<Integer> lista) {
        int i, j, posMenor, aux;
        
        for (i = 0; i < lista.size(); i++) {
            posMenor = i;
            for (j = i+1; j < lista.size(); j++) {
                if (lista.get(j) < lista.get(posMenor)) {
                    posMenor = j;
                }
            }
        }
        if (posMenor != i) {
            aux = lista.get(i);
            lista.set(i, lista.get(posMenor);
            lista.set(posMenor, aux);
        }
    }

    public void selecaoPalavra(ArrayList<String> lista) {
        int i, j, posMenor;
        String aux;
        
        for (i = 0; i < lista.size(); i++) {
            posMenor = i;
            for (j = i+1; j < lista.size(); j++) {
                if ((lista.get(i).compareTo(lista.get(posMenor)) > 0)) {
                    posMenor = j;
                }
            }
        }
        if (posMenor != i) {
            aux = lista.get(i);
            lista.set(i, lista.get(posMenor);
            lista.set(posMenor, aux);
        }
    }

    public static void insercao(ArrayList<Integer> lista) {
        int i, j, aux;

        for (i = 1; i < lista.size(); i++) {
            aux = lista.get(i);
            for (j = i-1; j > 0 && aux < lista.get(j); j--) {
                lista.set(j+1, lista.get(j));
            }
            lista.set(j+1, aux);
        }
    }

    public static void insercaoPalavra(ArrayList<String> lista) {
        int i, j;
        String aux;

        for (i = 1; i < lista.size(); i++) {
            aux = lista.get(i);
            for (j = i-1; j > 0 && aux.compareTo(lista.get(j)) > 0; j--) {
                lista.set(j+1, lista.get(j));
            }
            lista.set(j+1, aux);
        }
    }
}
