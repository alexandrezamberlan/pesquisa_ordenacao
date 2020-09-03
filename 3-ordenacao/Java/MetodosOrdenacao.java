import java.util.LinkedList;

public class MetodosOrdenacao {
    
    public static void bolha(LinkedList<Integer> lista) {
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

    public static void selecao(LinkedList<Integer> lista) {
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
}
