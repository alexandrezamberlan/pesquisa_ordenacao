package app.view;

import java.util.List;
import app.model.Processo;

public class ProcessoView {
    public void exibirLista(String mensagem, List<Processo> lista) {
        System.out.println("\n--- " + mensagem + " ---");
        for (Processo item : lista) {
            System.out.println(item);
        }
    }
}
