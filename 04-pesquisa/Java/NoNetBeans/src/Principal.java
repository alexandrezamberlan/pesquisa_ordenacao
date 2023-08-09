import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

public class Principal {

    public static void popular(int quantidade, ArrayList<Integer> lista) {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++) {
            lista.add(gerador.nextInt(100));
        }
    }

    public static void exibir(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i));
        }
    }
    public static void main(String a[]) {
        ArrayList<Integer> listaSequencial = new ArrayList<>();
        ArrayList<Integer> listaBinaria = new ArrayList<>();
        ArrayList<Integer> lista = new ArrayList<>();
        long tempoInicio;  
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos números quer gerar? "));

        popular(quantidade, listaSequencial);
        
        popular(quantidade, listaBinaria);
       
        
        popular(quantidade, lista);
        Collections.sort(lista);
        
        System.out.println("Total de números: " + quantidade);
        System.out.println("Números da lista sequencial");
        
        //exibir(listaBinaria);
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual número deseja pesquisar?"));

//         //sequencial primeira ocorrencia
//         tempoInicio = System.nanoTime();
//         System.out.println(numero + " foi localizado em: \n" + MetodosPesquisa.pesquisaSequencialRetornaPrimeiraOcorrencia(numero, listaSequencial));
//         // System.out.println("Tempo (ms): " + (System.nanoTime() - tempoInicio)/1000000);

        // //sequencial mostra todas as ocorrencias
        // tempoInicio = System.nanoTime();
        // System.out.println("\n\n" + numero + " foi localizado nas posições: ");
        // MetodosPesquisa.pesquisaSequencialMostraTodasAsPosicoes(numero, listaSequencial);
        // // System.out.println("Tempo (ms): " + (System.nanoTime() - tempoInicio)/1000000);

//        //sequencial retorna todas as ocorrencias
//        tempoInicio = System.nanoTime();
//        ArrayList<Integer> ocorrencias = MetodosPesquisa.pesquisaSequencialRetornaTodasAsOcorrencias(numero, listaSequencial);
//        // System.out.println("Tempo (ms): " + (System.nanoTime() - tempoInicio)/1000000);
//        System.out.println("\n\n"+ numero + " foi localizado nas posições: " + ocorrencias);
//        
//        
//        //usando o próprio Java para ordenar
//        tempoInicio = System.nanoTime();
//        System.out.println(numero + " está na lista na posição " + listaSequencial.indexOf(a));
        
        
        tempoInicio = System.nanoTime();
        System.out.println(numero + " foi localizado na posição " + MetodosPesquisa.pesquisaSequencialRetornaPrimeiraOcorrencia(numero, listaBinaria));
        System.out.println("Tempo (ms) pesquisaSequencial: " + (System.nanoTime() - tempoInicio)/1000000);

        Collections.sort(listaBinaria);
        tempoInicio = System.nanoTime();
        System.out.println(numero + " foi localizado na posição " + MetodosPesquisa.pesquisaBinaria(numero, listaBinaria));
        System.out.println("Tempo (ms) pesquisaBinaria: " + (System.nanoTime() - tempoInicio)/1000000);
        
        
        
        System.exit(0);
    }
}