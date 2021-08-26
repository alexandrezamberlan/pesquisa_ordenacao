import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Collections;

public class Principal {

    public static void main(String a[]) {
        ArrayList<Integer> listaBolha = new ArrayList<Integer>();
        long tempoInicio, tempoFim;  
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos números quer gerar? "));

        Util.popular(quantidade, listaBolha);
        //Util.exibir(listaBolha);

        //bolha
        tempoInicio = System.nanoTime();
        MetodosOrdenacao.bolha(listaBolha);
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) bolha: " + (tempoFim - tempoInicio)/1000000);
               
        System.exit(0);
    }
}