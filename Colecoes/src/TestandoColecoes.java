
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class TestandoColecoes {
    public static void main(String[] args) {
        ArrayList<Integer> listaAL = new ArrayList<>();
        LinkedList<Integer> listaLL = new LinkedList<>();
        HashSet<Integer> listaHS = new HashSet<>();
        
        int qtdNumeros = 1000000;
        int numero;
        Random gerador = new Random();
        for (int i = 0; i < qtdNumeros; i++) {
            numero = gerador.nextInt(100);
            listaAL.add(numero);
            listaLL.add(numero); 
            listaHS.add(numero);//o hashset nao coloca os numeros de forma sequencial
        }
        
        //Collections.sort(listaAL);
        //Collections.sort(listaLL);
        //Collections.sort(listaHS); com hashset a ordenação padrão não funciona
        
//        System.out.println("Exibindo o AL");
//        for (int i = 0; i < listaAL.size(); i++) {
//            System.out.println(listaAL.get(i));
//        }
//        
        
//        System.out.println("Exibindo o LL");
//        for (int i = 0; i < listaLL.size(); i++) {
//            System.out.println(listaLL.get(i));
//        }
//        
//        System.out.println("Exibindo o HS");
//        for (Iterator<Integer> i = listaHS.iterator(); i.hasNext();) {
//            System.out.println(i.next());
//        }
//        

        int numeroPesquisa = -100;
        long inicio, fim, duracao;
        
        inicio = System.nanoTime();
        if (listaAL.contains(numeroPesquisa)) {
            //
        }
        fim = System.nanoTime();
        duracao = fim - inicio;
        System.out.println("Duração ArrayList:  " + duracao/1000000);
        
        inicio = System.nanoTime();
        if (listaLL.contains(numeroPesquisa)) {
            //
        }
        fim = System.nanoTime();
        duracao = fim - inicio;
        System.out.println("Duração LinkedList:  " + duracao/1000000);
        
        inicio = System.nanoTime();
        if (listaHS.contains(numeroPesquisa)) {
            //
        }
        fim = System.nanoTime();
        duracao = fim - inicio;
        System.out.println("Duração HashSet:  " + duracao/1000000);
    }
}
