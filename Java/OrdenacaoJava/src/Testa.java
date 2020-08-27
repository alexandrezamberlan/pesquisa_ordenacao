
import java.util.ArrayList;

public class Testa {
    public static void main(String[] args) {
        ArrayList<Integer> vetorSelecao = new ArrayList<>();
        ArrayList<Integer> vetorInsercao = new ArrayList<>();
        ArrayList<Integer> vetorBolha = new ArrayList<>();
        ArrayList<Integer> vetorAgitacao = new ArrayList<>();
        long tempoInicio;        
        
        Ordenacao.popula(50000, vetorSelecao);
        Ordenacao.clona(vetorSelecao,vetorInsercao);
        Ordenacao.clona(vetorSelecao,vetorBolha);
        Ordenacao.clona(vetorSelecao,vetorAgitacao);
        
        
        System.out.println("Seleção:");                
        tempoInicio = System.nanoTime();
        Ordenacao.selecao(vetorSelecao);
        System.out.println("Tempo (ms): " + (System.nanoTime() - tempoInicio)/1000000);
        //Ordenacao.exibe(vetorSelecao);
        
        System.out.println("Inserção:");                
        tempoInicio = System.nanoTime();
        Ordenacao.insercao(vetorInsercao);
        System.out.println("Tempo (ms): " + (System.nanoTime() - tempoInicio)/1000000);
        //Ordenacao.exibe(vetorInsercao);
        
        System.out.println("Bolha:");
        tempoInicio = System.nanoTime();
        Ordenacao.bolha(vetorBolha);
        System.out.println("Tempo (ms): " + (System.nanoTime() - tempoInicio)/1000000);
        //Ordenacao.exibe(vetorBolha);
        
        System.out.println("Agitação:");
        tempoInicio = System.nanoTime();
        Ordenacao.bolha(vetorAgitacao);
        System.out.println("Tempo (ms): " + (System.nanoTime() - tempoInicio)/1000000);
        Ordenacao.exibe(vetorAgitacao);
        
    }
}
