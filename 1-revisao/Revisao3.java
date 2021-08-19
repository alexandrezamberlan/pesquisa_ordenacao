import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Integer;

public class Revisao3 {
    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList<>();

        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos números quer gerar? "));
        long tempoInicio, tempoFim;
        
        tempoInicio = System.nanoTime();
        popular(vetor, quantidade);
        exibir(vetor);
        tempoFim = System.nanoTime();
        System.out.println("Tempo de processamento: " + (tempoFim - tempoInicio)/1000000 + " ms");
    }

    public static void popular(ArrayList<Integer> v, int n) {
        Random gerador = new Random();
        for (int i = 0; i < n; i++) {
            v.add(gerador.nextInt(100));
        }
    }

    public static void exibir(ArrayList<Integer> v) {
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
    }
}