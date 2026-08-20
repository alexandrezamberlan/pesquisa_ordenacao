package app.model;

import java.util.List;
import java.util.Random;

public class ProcessoService {

    public void ordenarBolha(List<Processo> lista) {
        Processo tmp;
        boolean houveTroca;
        do {
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                if (((Processo) lista.get(i)).compareTo((Processo) lista.get(i + 1)) > 0) {
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, tmp);
                }
            }
        } while (houveTroca);
    }

    public void popular(List<Processo> lista, int quantidade) {
        Random gerador = new Random();
        
        for (int i = 0; i < quantidade; i++) {
            lista.add(new Processo(gerador.nextInt(100,500), "gerando uma string " + gerador.nextInt(quantidade)));
        }
    }
}
