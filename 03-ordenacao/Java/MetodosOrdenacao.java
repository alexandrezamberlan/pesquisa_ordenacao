import java.util.ArrayList;
import java.util.Random;

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

    
    
    public static void pente(ArrayList<Integer> lista) {
        boolean houveTroca;
        int tmp;
        int i;
        int distancia = lista.size();
        
        do {
            distancia = (int)((float)distancia / 1.3);
            if (distancia < 1) distancia = 1;
    
            houveTroca = false;
            for (i = 0; i < lista.size() - distancia; i++) {
                if (lista.get(i) > lista.get(i+distancia)) {
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i+distancia));
                    lista.set(i+distancia, tmp);
                }
            }
        } while (distancia > 1 || houveTroca);
    }
}
