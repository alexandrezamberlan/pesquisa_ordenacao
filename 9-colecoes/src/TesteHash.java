
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class TesteHash {
    public static void main(String[] args) {
        String frase;
        HashSet<String> lista = new HashSet<>();
        
        do {         
            frase = JOptionPane.showInputDialog(null,"Informe frase");
            if (frase.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.println("Frase inserida na posição " + frase.hashCode());
            lista.add(frase);
        } while (true);
        
        System.out.println("Exibindo as frases da lista");
        for (Iterator<String> i = lista.iterator(); i.hasNext();) {
            System.out.println(i.next() + "  na posição " + i.toString());
        }
        
        String frasePesquisa = "teste";
        
        System.out.println(frasePesquisa + " está na estrutura " + lista.contains(frasePesquisa));
    }
}
