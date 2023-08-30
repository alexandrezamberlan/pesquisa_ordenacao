
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> listaAgitacao = new ArrayList();
        ArrayList<Integer> listaPente = new ArrayList();
        ArrayList<Integer> lista = new ArrayList();
        
        int qtdNumeros = 100000;
        Random gerador = new Random();
        int numero;
        //rotina para popular numeros
        for (int i = 0; i < qtdNumeros; i++) {
            numero = gerador.nextInt(100);
            listaAgitacao.add(numero);
            listaPente.add(numero);
            lista.add(numero);
        }
        long tempoInicio, tempoFim;                
        
        //sort
        tempoInicio = System.nanoTime();
        //Collections.sort(lista); //usado ate java7
        
        //usado a partir do java7
        lista.sort((n1, n2) -> {            
            return n1.compareTo(n2);
        });
        
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) sort: " + (tempoFim - tempoInicio)/1000000);
        
        //pente
        tempoInicio = System.nanoTime();
        Ordenacao.pente(listaPente);
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) pente: " + (tempoFim - tempoInicio)/1000000);
        
        //agitacao
        tempoInicio = System.nanoTime();
        Ordenacao.agitacao(listaAgitacao);
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) agitacao: " + (tempoFim - tempoInicio)/1000000);
        
//        System.out.println(listaAgitacao);
//        System.out.println(listaPente);
        
    }
}
