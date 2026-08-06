package projeto.model;

import java.util.List;
import java.util.Random;

public class Utilidades {
    /**
     * método de classe que popula lista ou com números aleatorios e de forma sequencial dentro de uma faixa
     * @param lista
     * @param quantidadeNumeros
     * @param inicio
     * @param fim
     * @param aleatorio - se true os números devem ser aleatórios
     */
    public static void popularLista(List<Integer> lista, long quantidadeNumeros, int inicio, int fim, boolean aleatorio) {
        Random gerador = new Random();
        
        if (aleatorio) {
            for (long i = 0; i < quantidadeNumeros; i++) {
                lista.add(gerador.nextInt(inicio, fim));
            }
        } else {
            for (long i = 0; i < quantidadeNumeros; i++) {
                lista.add((int) (inicio + i));
            }
        }
    }
}