import java.util.ArrayList;

import javax.swing.JOptionPane;
import java.util.Collections;

public class Principal {

    public static void main(String a[]) {
        ArrayList<Integer> listaBolha = new ArrayList<Integer>();
        ArrayList<Integer> listaSelecao = new ArrayList<Integer>();
        ArrayList<Integer> listaPente = new ArrayList<Integer>();
        long tempoInicio, tempoFim;  
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos números quer gerar? "));

        Util.popular(quantidade, listaBolha);
        listaSelecao.addAll(listaBolha);
        listaPente.addAll(listaBolha);

        

        // //bolha
        // tempoInicio = System.nanoTime();
        // MetodosOrdenacao.bolha(listaBolha);
        // tempoFim = System.nanoTime();
        // System.out.println("Tempo (ms) bolha: " + (tempoFim - tempoInicio)/1000000);

        // //selecao
        // tempoInicio = System.nanoTime();
        // MetodosOrdenacao.selecao(listaSelecao);
        // tempoFim = System.nanoTime();
        // System.out.println("Tempo (ms) seleção: " + (tempoFim - tempoInicio)/1000000);


        
        //pente
        tempoInicio = System.nanoTime();
        MetodosOrdenacao.pente(listaPente);
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) pente: " + (tempoFim - tempoInicio)/1000000);
        // Util.exibir(listaPente);
               
        System.exit(0);
    }
}