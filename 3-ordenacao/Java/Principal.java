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
        long tempoInicio, tempoFim;  
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos números quer gerar? "));

        popular(quantidade, listaBolha);
        //exibir(listaBolha);

        //bolha
        tempoInicio = System.nanoTime();
        MetodosOrdenacao.bolha(listaBolha);
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) bolha: " + (tempoFim - tempoInicio)/1000000);
               
        System.exit(0);
    }
}