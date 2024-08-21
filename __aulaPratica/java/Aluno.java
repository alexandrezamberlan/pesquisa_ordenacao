/**
 * Classe aluno para gerar objetos com nome e idade
 */
public class Aluno {
    String nome;
    int idade;
      
    /**
     * Construtor
     * @param nome
     * @param idade
     */
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }  

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + "]";
    }    
}
