package app.controller;

import java.util.ArrayList;
import java.util.List;

import app.model.ProcessoService;
import app.model.Processo;
import app.view.ProcessoView;

public class ProcessoController {

    private final ProcessoService service;
    private final ProcessoView view;
    private final List<Processo> listaDeProcessos;

    public ProcessoController(ProcessoService service, ProcessoView view) {
        this.service = service;
        this.view = view;
        this.listaDeProcessos = new ArrayList<>();
    }

    public void iniciarSistema() {
        // 1. Executa a regra de negócio para gerar dados
        service.popular(listaDeProcessos, 4);
        
        // 2. Comanda a View para exibir o estado inicial
        view.exibirLista("Exibindo a lista original", listaDeProcessos);

        // 3. Executa a regra de negócio de ordenação
        service.ordenarBolha(listaDeProcessos);

        // 4. Comanda a View para exibir o resultado final
        view.exibirLista("Exibindo a lista ordenada pelo id", listaDeProcessos);
    }

}
