import java.util.ArrayList;
import java.util.Random;

public class MetodosPesquisa {
    public static int pesquisaSequencialRetornaPrimeiraOcorrencia(int numero, ArrayList<Integer> lista) {
        int i;
        
        for (i = 0; i < lista.size(); i++) {
            if (numero == lista.get(i)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void pesquisaSequencialMostraTodasAsPosicoes(int numero, ArrayList<Integer> lista) {
        int i;
        boolean achou = false;
        for (i = 0; i < lista.size(); i++) {
            if (numero == lista.get(i)) {
                System.out.println(i);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("... não localizado");
        }
        System.out.println();
    }
    
    public static ArrayList<Integer> pesquisaSequencialRetornaTodasAsOcorrencias(int numero, ArrayList<Integer> lista) {
        int i;

        ArrayList<Integer> lista_ocorrencias = new ArrayList<>();
        
        for (i = 0; i < lista.size(); i++) {
            if (numero == lista.get(i)) {
                lista_ocorrencias.add(i);
            }
        }
        return lista_ocorrencias;
    }
    
    public static int pesquisaBinaria(int numero, ArrayList<Integer> lista) {
        int ini = 0;
        int fim = lista.size()-1;
        int meio;
        int qtdComparacoes = 0;
        
        while (ini <= fim) {
            qtdComparacoes++;
            meio = (int)(ini+fim)/2;
            if (numero == lista.get(meio)) {
                System.out.println("foram realizadas " + qtdComparacoes + "comparações");
                return meio;
            } else if (numero < lista.get(meio)) { //ir para esquerda
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }
        System.out.println("foram realizadas " + qtdComparacoes + "comparações");
        return -1;
        
    }
}
    