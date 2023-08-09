import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;


class Aluno implements Comparable<Aluno>{
    public int matricula;
    public String nome;

    public Aluno(int m, String n) {
        this.matricula = m;
        this.nome = n;
    }

    @Override
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

    @Override
    public int compareTo(Aluno a) {
        if (this.matricula == a.matricula) {
            return 0;
        } else if (this.matricula < a.matricula) {
            return -1;
        }
        return 1;
    }
}

public class ArvoreHash {
    public static void main(String[] a) {
        // TreeSet<Integer> arvoreInteiros = new TreeSet<Integer>();
        // Random gerador = new Random();
    
        // for (int i = 0; i < 10; i++) {
        //     arvoreInteiros.add(gerador.nextInt(100));
        // }

        // for (Integer i : arvoreInteiros) {
        //     System.out.println(i);
        // }

        // System.out.println("mostra");
        // System.out.println(arvoreInteiros.ceiling(50));

        TreeSet<Aluno> arvoreAlunos = new TreeSet<>();

        for (int i = 1; i < 10; i++) {
            arvoreAlunos.add(new Aluno(i,"Nome"+i));
        }

        for (Aluno i : arvoreAlunos) {
            System.out.println(i);
        }

        Aluno alunoPesquisa = new Aluno(4,"Pedro");
        System.out.println(arvoreAlunos.contains(alunoPesquisa));
    }
}