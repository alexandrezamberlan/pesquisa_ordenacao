import java.util.Collections;
import java.util.ArrayList;

public class Principal {
    public static void main(String a[]) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add(new Aluno(46,"Alexandre Zamberlan"));
        listaAlunos.add(new Aluno(20,"Alexandre Zeni"));
        listaAlunos.add(new Aluno(19,"Meani"));
        listaAlunos.add(new Aluno(19,"Ana"));
        listaAlunos.add(new Aluno(5,"Dante"));
        listaAlunos.add(new Aluno(19,"Bia"));

        Collections.sort(listaAlunos);

        System.out.println("Lista de alunos ordenados por idade");
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println(listaAlunos.get(i));
        }
    }
}
