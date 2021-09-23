
import java.util.ArrayList;


/**
 *
 * @author alexandrezamberlan
 */
public class Ordenacao {
    
    public static void penteMatricula(ArrayList<Aluno> lista) {
        boolean houveTroca;
        Aluno tmp;
        int distancia = lista.size();

        do {
            distancia = (int) (distancia / 1.3);
            if (distancia <= 0) {
                distancia = 1;
            }
            houveTroca = false;
            for (int i = 0; i < lista.size() - distancia; i++) {
                if (lista.get(i).matricula > lista.get(i + distancia).matricula) {
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i + distancia));
                    lista.set(i + distancia, tmp);
                    houveTroca = true;
                }
            }
        } while (distancia > 1 || houveTroca);
    }
    
    
    public static void bolhaMatricula(ArrayList<Aluno> lista) {
        boolean houveTroca;
        Aluno tmp;

        do {
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i).matricula > lista.get(i + 1).matricula) {
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, tmp);
                    houveTroca = true;
                }
            }
        } while (houveTroca);
    }
    
    public static void bolhaNome(ArrayList<Aluno> lista) {
       boolean houveTroca;
        Aluno tmp;

        do {
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i).nome.compareToIgnoreCase(lista.get(i + 1).nome) > 0) {
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, tmp);
                    houveTroca = true;
                }
            }
        } while (houveTroca);
    }
}
