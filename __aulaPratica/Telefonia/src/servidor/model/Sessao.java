package servidor.model;


public class Sessao {
    public String numeroCelular;
    public String dadosSessao;

    public Sessao(String numeroCelular, String dadosSessao) {
        this.numeroCelular = numeroCelular;
        this.dadosSessao = dadosSessao;
    }

    @Override
    public String toString() {
        return "Sessao [numeroCelular=" + numeroCelular + ", dadosSessao=" + dadosSessao + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroCelular == null) ? 0 : numeroCelular.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Sessao other = (Sessao) obj;
        if (numeroCelular == null) {
            if (other.numeroCelular != null)
                return false;
        } else if (!numeroCelular.equals(other.numeroCelular))
            return false;
        return true;
    }
}