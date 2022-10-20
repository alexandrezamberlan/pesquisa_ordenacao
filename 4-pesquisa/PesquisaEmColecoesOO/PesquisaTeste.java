import java.util.LinkedList;

class Aluno {
    public int matricula;
    public String nome;

    public Aluno(int m, String n) {
        this.matricula = m;
        this.nome = n;
    }

    public String toString() {
        return "Nome: " + this.nome + ". Matrícula: " + this.matricula;
    }

    @Override
    public boolean equals(Object o) {
       if (o instanceof Aluno) {
           Aluno e = (Aluno) o;
           return this.matricula == e.matricula;
       }
       return false;
   }
}

public class PesquisaTeste {
    public static void main(String a[]) {
        LinkedList<Aluno> lista = new LinkedList<Aluno>();
        Aluno aluno;
        for (int i = 1; i < 10; i++) {
            aluno = new Aluno(i, "Nome"+i);
            lista.add(aluno);
        }

        for (Aluno i : lista) {
            System.out.println(i);
        }

        Aluno alunoPesquisa = new Aluno(1,"Nomex");

        System.out.println(lista.index(alunoPesquisa));

    }
}