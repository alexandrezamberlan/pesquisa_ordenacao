package projeto.view;

import java.util.List;

public class ExibicaoView {

    public static void exibirLista(List<Integer> lista, String frase) {
        System.out.println(frase);
        for (Object item : lista) {
            System.out.println(item);
        }
        System.out.println("--------------------------");
        System.out.println("Total de registros: " + lista.size());
    }

    public static void exibirTempoExecucao(int rotina, long tempoMs) {
        System.out.println("Tempo (ms) rotina " + rotina + ": " + tempoMs);
    }
}