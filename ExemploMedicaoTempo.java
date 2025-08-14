import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class Utilidades {
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
                lista.add( gerador.nextInt(inicio, fim) );
            }
        }

        if (!aleatorio) {
            for (long i = inicio; i < quantidadeNumeros; i++) {
                lista.add( (int)i );
            }
        }
    }

    public static void exibrLista(List<Integer> lista, String frase) {
        System.out.println(frase);
        for (Object item : lista) {
            System.out.println(item);
        }
        System.out.println("--------------------------");
        System.out.println("Total de registros: " + lista.size());
    }
}


public class ExemploMedicaoTempo {
    public static void main(String[] args) {
        long tempoInicio, tempoFim;  
        List<Integer> listaAleatoria = new ArrayList<>();
        List<Integer> listaSequencial = new ArrayList<>();

        tempoInicio = System.nanoTime();
        // rotina1 - popular uma lista com 100000 aleatorios na faixa 100 a 100000
        Utilidades.popularLista(listaAleatoria, 100000, 100, 100000, true);
        // Utilidades.exibrLista(listaAleatoria, "Lista aleatoria");
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) rotina 1: " + (tempoFim - tempoInicio)/1000000);

        tempoInicio = System.nanoTime();
        // rotina2 - popular uma lista com 100000 de forma crescente 0 na posição 0, 1 na posição 1, e assim por diante
        Utilidades.popularLista(listaSequencial, 100000, 1, 100000, false);
        // Utilidades.exibrLista(listaSequencial, "Lista sequencial");
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) rotina 2: " + (tempoFim - tempoInicio)/1000000);
    }
}
