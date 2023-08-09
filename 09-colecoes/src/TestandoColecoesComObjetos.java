
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JOptionPane;


public class TestandoColecoesComObjetos {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAL = new ArrayList<>();
        LinkedList<Aluno> listaLL = new LinkedList<>();
        HashSet<Aluno> listaHS = new HashSet<>();
        
        Random gerador = new Random();
        int matricula;
        String nome;
        do {         
            nome = JOptionPane.showInputDialog(null,"Informe nome");
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            matricula = gerador.nextInt(10);
            listaAL.add(new Aluno(matricula, nome));
            listaLL.add(new Aluno(matricula, nome));
            listaHS.add(new Aluno(matricula, nome));
            
        } while (true);
        
        System.out.println("Exibindo o AL");
        for (int i = 0; i < listaAL.size(); i++) {
            System.out.println(listaAL.get(i));
        }     
        
        System.out.println("Exibindo o LL");
        for (int i = 0; i < listaLL.size(); i++) {
            System.out.println(listaLL.get(i));
        }
        
        System.out.println("Exibindo o HS");
        for (Iterator<Aluno> i = listaHS.iterator(); i.hasNext();) {
            System.out.println(i.next());
        } 
    }
}
