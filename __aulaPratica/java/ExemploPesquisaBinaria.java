
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

//Ordenação - check
//Pesquisa
    //Sequencial 
        //- contains
        //- indexOf
class Util {
    public static void preencherOrdenado(ArrayList<Integer> lista, int n) {
        for (int i = 0; i < n; i++) {
            lista.add(i);
        }
    }
    
    public static void preencherDesordenado(ArrayList<Integer> lista, int n) {
        Random gerador = new Random();
        for (int i = 0; i < n; i++) {
            lista.add(gerador.nextInt(100000));
        }
    }
    
    public static void preencherArvore(TreeSet<Integer> arvore, int n) {
        Random gerador = new Random();
        for (int i = 0; i < n; i++) {
            arvore.add(gerador.nextInt(10));
        }
    }
    
    public static int pesquisaBinariaContains(int valor, ArrayList<Integer> lista) {
        int ini = 0;
        int fim = lista.size() - 1;
        int meio;
        while (ini <= fim) {
            meio = (int)((ini+fim)/2);
            if (valor == lista.get(meio)) {
                return meio;
            }
            if (valor < lista.get(meio)) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }
        return -1;
    }
}


public class ExemploPesquisaBinaria {
    public static void main(String[] args) {
        ArrayList<Integer> listaDesordenada = new ArrayList<Integer>();
        Util.preencherDesordenado(listaDesordenada, 20000000);
        ArrayList<Integer> listaOrdenada = new ArrayList<Integer>();
        Util.preencherOrdenado(listaOrdenada, 20000000);
        TreeSet<Integer> arvore = new TreeSet<>();
        Util.preencherArvore(arvore, 10);
        System.out.println(arvore);
        
//        long tempoInicio = System.nanoTime();
//        System.out.println("Iniciou pesquisa....");
//        System.out.println(listaOrdenada.contains(20000000-1));
//        System.out.println("Tempo (ms) contains ordenada: " + (System.nanoTime() - tempoInicio)/1000000);
//        
//        tempoInicio = System.nanoTime();
//        System.out.println("Iniciou pesquisa....");
//        System.out.println(listaDesordenada.contains(20000000-1));
//        System.out.println("Tempo (ms) contains desordenado: " + (System.nanoTime() - tempoInicio)/1000000);
//        
//        tempoInicio = System.nanoTime();
//        System.out.println("Iniciou pesquisa....");
//        System.out.println(Util.pesquisaBinariaContains(20000000-1, listaOrdenada));
//        System.out.println("Tempo (ms) contains binaria: " + (System.nanoTime() - tempoInicio)/1000000);
        
        long tempoInicio = System.nanoTime();
        System.out.println("Iniciou pesquisa....");
        System.out.println(arvore.contains(5));
        System.out.println("Tempo (ms) contains tree: " + (System.nanoTime() - tempoInicio)/1000000);
    }
    
    
}
