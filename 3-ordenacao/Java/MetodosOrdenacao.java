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
}
