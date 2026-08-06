package projeto.controller;

import projeto.model.Utilidades;
import projeto.view.ExibicaoView;

import java.util.ArrayList;
import java.util.List;

public class ListaController {

    public void executarProcessamento() {
        long tempoInicio, tempoFim;  
        List<Integer> listaAleatoria = new ArrayList<>();
        List<Integer> listaSequencial = new ArrayList<>();

        // Rotina 1: Aleatória
        tempoInicio = System.nanoTime();
        Utilidades.popularLista(listaAleatoria, 100000, 100, 100000, true);
        tempoFim = System.nanoTime();
        ExibicaoView.exibirTempoExecucao(1, (tempoFim - tempoInicio) / 1000000);

        // Rotina 2: Sequencial
        tempoInicio = System.nanoTime();
        Utilidades.popularLista(listaSequencial, 100000, 1, 100000, false);
        tempoFim = System.nanoTime();
        ExibicaoView.exibirTempoExecucao(2, (tempoFim - tempoInicio) / 1000000);
        
        // Descomente se quiser exibir as listas:
        // ExibicaoView.exibirLista(listaAleatoria, "Lista Aleatória:");
    }
}