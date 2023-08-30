
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//clay	rian	alex	pedro	ana	sofia	alex	alex
//18	17	17	20	18	15	48	18


public class PrincipalPessoas {
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList();
        lista.add(new Pessoa("clay", 18));
        lista.add(new Pessoa("rian", 17));
        lista.add(new Pessoa("alex", 17));
        lista.add(new Pessoa("pedro", 20));
        lista.add(new Pessoa("ana", 18));
        lista.add(new Pessoa("sofia", 15));
        lista.add(new Pessoa("alex", 48));
        lista.add(new Pessoa("alex", 18));
        
        
        //usado ate o java7
//        Collections.sort(lista, new Comparator<Pessoa>() {            
//            public int compare(Pessoa p1, Pessoa p2) {
//                int resultado = p1.nome.compareTo(p2.nome);
//                if (resultado != 0) {
//                    return resultado;
//                }
//                return Integer.valueOf(p1.idade).compareTo(p2.idade);
//            }
//        });
//        
//         Collections.sort(lista, new Comparator<Pessoa>() {            
//            public int compare(Pessoa p1, Pessoa p2) {
//                int resultado = Integer.valueOf(p1.idade).compareTo(p2.idade);                        
//                if (resultado != 0) {
//                    return resultado;
//                }
//                return p1.nome.compareTo(p2.nome);
//            }
//        });     
         
        //usado a partir do java7 - Uso de lambda
        lista.sort((p1, p2) -> {
            int resultado = p1.nome.compareTo(p2.nome);
            if (resultado != 0) {
                return resultado;
            }
            return Integer.valueOf(p1.idade).compareTo(p2.idade);
        });
        System.out.println(lista);
    }
}
