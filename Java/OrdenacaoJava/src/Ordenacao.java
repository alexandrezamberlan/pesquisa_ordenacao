
import java.util.ArrayList;
import java.util.Random;

public class Ordenacao {

    static void popula(int quantidade, ArrayList vetor) {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++) {
            vetor.add(gerador.nextInt(1000));
        }
    }
    
    static void clona(ArrayList vetorOrigem, ArrayList vetorDestino) {
        for (int i = 0; i < vetorOrigem.size(); i++) {
            vetorDestino.add(vetorOrigem.get(i));
        }
    }

    static void exibe(ArrayList vetor) {
        for (int i = 0; i < vetor.size(); i++) {
            System.out.println(vetor.get(i));
        }
    }

    static void selecao(ArrayList<Integer> vetor) {
        int i, j, posMenor;
        int aux;

        for (i = 0; i < vetor.size() - 1; i++) {
            posMenor = i;
            for (j = i + 1; j < vetor.size(); j++) {
                if (vetor.get(j) < vetor.get(posMenor)) {
                    posMenor = j;
                }
            }
            if (i != posMenor) {
                aux = vetor.get(i);
                vetor.set(i, vetor.get(posMenor));
                vetor.set(posMenor, aux);
            }
        }
    }
    
    static void insercao(ArrayList<Integer> vetor) {
        int i, j;
        int aux;

        for (i = 1; i < vetor.size(); i++) {
            aux = vetor.get(i);
            for (j = i - 1; j >= 0 && aux < vetor.get(j); j--) {
                vetor.set(j + 1, vetor.get(j));
            }
            vetor.set(j+1, aux);
        }
    }
    
    static void bolha(ArrayList<Integer> vetor) {
        int i;
        boolean houveTroca;
        int aux;

        do {
            houveTroca = false;
        
            for (i = 0; i < vetor.size() - 1; i++) {
                if (vetor.get(i) > vetor.get(i + 1)) {
                    houveTroca = true;
                    aux = vetor.get(i);
                    vetor.set(i,vetor.get(i + 1));
                    vetor.set(i + 1, aux);
                }
            }                
        } while (houveTroca);
    }
    
    static void agitacao(ArrayList<Integer> vetor) {
        int i;
        int ini = 0;
        int fim = vetor.size() - 1;
        boolean houveTroca;
        int aux;

        do {
            houveTroca = false;
        
            for (i = ini; i < fim; i++) {
                if (vetor.get(i) > vetor.get(i + 1)) {
                    houveTroca = true;
                    aux = vetor.get(i);
                    vetor.set(i,vetor.get(i + 1));
                    vetor.set(i + 1, aux);
                }
            }                
            fim--;
            if (!houveTroca){
                break;
            } 
            
            houveTroca = false;
            for (i = fim; i > 0; i--) {
                if (vetor.get(i) < vetor.get(i - 1)) {
                    houveTroca = true;
                    aux = vetor.get(i);
                    vetor.set(i,vetor.get(i - 1));
                    vetor.set(i - 1, aux);
                }
            }            
            ini++;
        } while (houveTroca && ini < fim);
    }
    
    
}
