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
        LinkedList<Integer> lista = new LinkedList<Integer>();
        long tempoInicio;  
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos números quer gerar? "));

        popular(quantidade, lista);
        tempoInicio = System.nanoTime();
        MetodosOrdenacao.bolha(lista);
        JOptionPane.showMessageDialog(null,"Tempo (ms): " + (System.nanoTime() - tempoInicio)/1000000);
        
        //exibir(lista);
        System.exit(0);
    }
}