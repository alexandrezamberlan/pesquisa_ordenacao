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
        printf("\n\n");
    }
    
    ArrayList<Integer> pesquisaSequencialRetornaTodasAsOcorrencias(int numero, ArrayList<Integer> lista) {
        int i;
        boolean achou = false;
        ArrayList<Integer> lista_ocorrencias = new ArrayList<>();
        
        for (i = 0; i < lista.size(); i++) {
            if (numero == lista.get(i)) {
                lista_ocorrencias.add(i);
                achou = true;
            }
        }
        return lista_ocorrencias;
    }
}
    