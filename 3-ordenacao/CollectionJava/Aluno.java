public class Aluno implements Comparable<Aluno> {
    public int idade;
    public String nome;

    public Aluno(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    @Override
     public boolean equals(Object o) {
        if (o instanceof Aluno) {
            Aluno e = (Aluno) o;
            return this.idade == e.idade && this.nome.equals(e.nome);
        }
        return false;
    }
    
    @Override
    public int compareTo(Aluno a) {
        if (this.idade < a.idade) {
            return -1;
        } 
        if (this.idade == a.idade) {
            if (this.nome.compareTo(a.nome) < 0) {
                 return -1;
            }
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Nome: "+ this.nome + ". Idade: " + this.idade; 
    }
}