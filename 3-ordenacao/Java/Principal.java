import java.util.LinkedList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Principal {

    public static void popular(int quantidade, LinkedList<Integer> lista) {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++) {
            lista.add(gerador.nextInt(100));
        }
    }

    public static void exibir(LinkedList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    public static void main(String a[]) {
        LinkedList<Integer> listaBolha = new LinkedList<Integer>();
        LinkedList<Integer> listaSelecao = new LinkedList<Integer>();
        long tempoInicio;  
        
        int quantidade = 5000; //Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos números quer gerar? "));

        //popular(quantidade, listaBolha);
        popular(quantidade, listaSelecao);
        System.out.println("Total de números: " + quantidade);

        //bolha
        //tempoInicio = System.nanoTime();
        //MetodosOrdenacao.bolha(listaBolha);
        //System.out.println("Tempo (ms) bolha: " + (System.nanoTime() - tempoInicio)/1000000);
        
        //selecao
        tempoInicio = System.nanoTime();
        MetodosOrdenacao.selecao(listaSelecao);
        System.out.println("Tempo (ms) seleção: " + (System.nanoTime() - tempoInicio)/1000000);
        
        
        //exibir(listaSelecao);
        
        System.exit(0);
    }
}