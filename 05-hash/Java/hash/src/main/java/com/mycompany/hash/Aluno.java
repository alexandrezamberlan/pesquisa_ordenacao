
package com.mycompany.hash;

/**
 *
 * @author alexandrezamberlan
 */
public class Aluno implements Comparable <Aluno>{
    public int matricula;
    public String nome;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    
    public Aluno(int matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.matricula;
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
        final Aluno other = (Aluno) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
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

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + '}';
    }
}
