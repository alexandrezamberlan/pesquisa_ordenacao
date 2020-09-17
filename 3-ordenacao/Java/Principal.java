import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Collections;

public class Principal {

    public static void popular(int quantidade, ArrayList<Integer> lista) {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++) {
            lista.add(gerador.nextInt(100));
        }
    }

    public static void exibir(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    public static void main(String a[]) {
        ArrayList<Integer> listaBolha = new ArrayList<Integer>();
        ArrayList<Integer> listaSelecao = new ArrayList<Integer>();
        ArrayList<Integer> listaInsercao = new ArrayList<Integer>();
        ArrayList<Integer> listaAgitacao = new ArrayList<Integer>();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        long tempoInicio;  
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos números quer gerar? "));

        popular(quantidade, listaBolha);
        popular(quantidade, listaSelecao);
        popular(quantidade, listaInsercao);
        popular(quantidade, listaAgitacao);
        popular(quantidade, lista);
        System.out.println("Total de números: " + quantidade);

        //bolha
        tempoInicio = System.nanoTime();
        MetodosOrdenacao.bolha(listaBolha);
        System.out.println("Tempo (ms) bolha: " + (System.nanoTime() - tempoInicio)/1000000);
        
        //selecao
        tempoInicio = System.nanoTime();
        MetodosOrdenacao.selecao(listaSelecao);
        System.out.println("Tempo (ms) seleção: " + (System.nanoTime() - tempoInicio)/1000000);
        
        //insercao
        tempoInicio = System.nanoTime();
        MetodosOrdenacao.insercao(listaInsercao);
        System.out.println("Tempo (ms) inserção: " + (System.nanoTime() - tempoInicio)/1000000);

        //agitacao
        tempoInicio = System.nanoTime();
        MetodosOrdenacao.agitacao(listaAgitacao);
        System.out.println("Tempo (ms) agitação: " + (System.nanoTime() - tempoInicio)/1000000);
        
        //usando o próprio Java para ordenar
        tempoInicio = System.nanoTime();
        Collections.sort(lista);
        System.out.println("Tempo (ms) do método do Java: " + (System.nanoTime() - tempoInicio)/1000000);

        //exibir(listaAgitacao);
        
        System.exit(0);
    }
}