
public class Aluno implements Comparable<Aluno> {

    int matricula;
    String nome;

    public Aluno(int m, String n) {
        this.matricula = m;
        this.nome = n;
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
    public int hashCode() {
        return ("" + this.matricula).hashCode();
    }

    @Override
    public int compareTo(Aluno aluno) {
        if (this.matricula < aluno.matricula) {
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + '}';
    }
    
    
}
