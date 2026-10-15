
package model;

import java.util.Objects;


public class Sessao {
    String numeroCelular;
    String dadosSessao;

    public Sessao(String numeroCelular, String dadosSessao) {
        this.numeroCelular = numeroCelular;
        this.dadosSessao = dadosSessao;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getDadosSessao() {
        return dadosSessao;
    }

    public void setDadosSessao(String dadosSessao) {
        this.dadosSessao = dadosSessao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.numeroCelular);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sessao other = (Sessao) obj;
        return Objects.equals(this.numeroCelular, other.numeroCelular);
    }

    @Override
    public String toString() {
        return "Sessao{" + "numeroCelular=" + numeroCelular + ", dadosSessao=" + dadosSessao + '}';
    }
    
    
}
