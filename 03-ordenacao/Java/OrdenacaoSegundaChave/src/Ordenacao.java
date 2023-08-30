
import java.util.ArrayList;


public class Ordenacao {
    public static void agitacao(ArrayList<Integer> lista) {
        int tmp;
        boolean houveTroca;
        int ini = 0;
        int fim = lista.size() - 1;
        
        do {
            houveTroca = false;
            //bolha da esquerda para direita -> levando o maior
            for (int i = ini; i < fim; i++) {
                if (lista.get(i) > lista.get(i + 1)){
                    tmp = lista.get(i);                     //tmp = lista[i]
                    lista.set(i, lista.get(i+1));    //lista[i] = lista[i+1]
                    lista.set(i+1, tmp);                  //lista[i+1] = tmp
                    houveTroca = true;
                }
            }
            fim--;
            if (!houveTroca) break;
            
            //bolha da direita para esquerda -> levando o menor
            houveTroca = false;
            for (int i = fim; i > ini; i--) {
                if (lista.get(i) < lista.get(i - 1)){
                    tmp = lista.get(i);                     //tmp = lista[i]
                    lista.set(i, lista.get(i-1));    //lista[i] = lista[i-1]
                    lista.set(i-1, tmp);                  //lista[i-1] = tmp
                    houveTroca = true;
                }
            }    
            ini++;
        } while (houveTroca);
    }
    
     public static void pente(ArrayList<Integer> lista) {
        int tmp;
        boolean houveTroca;
        int distancia = lista.size();
        
        do {
            distancia = (int)(distancia / 1.3);
            if (distancia < 1) distancia = 1;
            
            houveTroca = false;
            //bolha da esquerda para direita -> levando o maior
            for (int i = 0; i+distancia < lista.size(); i++) {
                if (lista.get(i) > lista.get(i + distancia)){
                    tmp = lista.get(i);                     //tmp = lista[i]
                    lista.set(i, lista.get(i+distancia));    //lista[i] = lista[i+distancia]
                    lista.set(i+distancia, tmp);                  //lista[i+distancia] = tmp
                    houveTroca = true;
                }
            }            
        } while (houveTroca);
    }
}
