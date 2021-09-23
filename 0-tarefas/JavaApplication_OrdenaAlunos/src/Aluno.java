
/**
 *
 * @author alexandrezamberlan
 */
public class Aluno implements Comparable<Aluno> {
    public int matricula;
    public String nome;
    public String curso;

    public Aluno(int matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }
    
    @Override
    public int compareTo(Aluno aluno) {
        if (this.matricula < aluno.matricula) {
            return -1;
        }
        return 1;
    }

    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Aluno) {
            Aluno a = (Aluno)o;
            return this.matricula == a.matricula;
        }
        return false;
    }
}
