import java.util.ArrayList;

public class MetodosOrdenacao {
    
    public static void bolha(ArrayList<Integer> lista) {
        boolean houveTroca;
        int tmp;
        int i;

        do {
            houveTroca = false;
            for (i = 0; i < lista.size()-1; i++) {
                if (lista.get(i) > lista.get(i+1)) {
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i,lista.get(i+1));
                    lista.set(i+1, tmp);  
                }
            }
        } while (houveTroca);
    }

    public static void selecao(ArrayList<Integer> lista) {
        int posMenor, i, j;
        int tmp;
    
        for (i = 0; i < lista.size()-1; i++) {
            posMenor = i;
            for (j = i + 1; j < lista.size(); j++ ) {
                if (lista.get(j) < lista.get(posMenor)) {
                    posMenor = j;
                }
            }
            if (i != posMenor) { 
                tmp = lista.get(i);
                lista.set(i, lista.get(posMenor));
                lista.set(posMenor, tmp);
            }
        }
    }

    public static void insercao(ArrayList<Integer> lista) {
        int i, j, tmp;
    
        for (i = 1; i < lista.size(); i++) {
            tmp = lista.get(i);
            for (j = i - 1; j >= 0; j--) {
                if (tmp < lista.get(j)) {
                    lista.set(j + 1, lista.get(j));
                } else break;
            }
            lista.set(j + 1, tmp);
        }
    }

    public static void agitacao(ArrayList<Integer> lista) {
        boolean houveTroca;
        int tmp, ini = 0, fim = lista.size()-1;
        int i;

        do {
            houveTroca = false;
            for (i = ini; i < fim; i++) {
                if (lista.get(i) > lista.get(i+1)) {
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i,lista.get(i+1));
                    lista.set(i+1, tmp);  
                }
            }
            fim--;

            if (!houveTroca) break;
            houveTroca = false;
            for (i = fim; i > ini; i--) {
                if (lista.get(i) < lista.get(i-1)) {
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i,lista.get(i-1));
                    lista.set(i-1, tmp);  
                }
            }
            ini++;
        } while (houveTroca && ini <= fim);
    }
}
