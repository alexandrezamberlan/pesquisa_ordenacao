package exemploSemMVC;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

class Processo implements Comparable<Processo> {
    int id;
    String descricao;

    public Processo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Processo [id=" + id + ", descricao=" + descricao + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Processo other = (Processo) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int compareTo(Processo outro) {
        if (outro == null) {
            return 1; // Coloca objetos nulos no final da ordenação
        }
        return Integer.compare(this.id, outro.id);
    }
}   

class Ordenacao {
    public static void bolha(List<Processo> lista) {
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
}

class Util {
    public static void popular(List<Processo> lista, int quantidade) {
        Random gerador = new Random();
        
        for (int i = 0; i < quantidade; i++) {
            lista.add(new Processo(gerador.nextInt(100,500), "gerando uma string " + gerador.nextInt(quantidade)));
        }
    }
}

public class OrdenaListaObjetos {
    public static void main(String[] args) {
        //lista de processos
        List<Processo> lista = new ArrayList<>();
        
        //popular a lista de processos (valores totalmente aleatorios)
        Util.popular(lista, 4);
        
        System.out.println("Exibindo a lista original");
        for (Processo item : lista) {
            System.out.println(item);
        }

        //ordenar a lista de processos usando uma chave de ordenacao 

        Ordenacao.bolha(lista);

        System.out.println("Exibindo a lista ordenada pelo id");
        for (Processo item : lista) {
            System.out.println(item);
        }
    }
}