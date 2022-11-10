package javaapplication1;
import java.util.Objects;

public class Peca implements Comparable<Peca> {
    String codigo;
    String descricao;
    String categoria;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Peca(String codigo, String descricao, String categoria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public Peca() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.codigo);
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
        final Peca other = (Peca) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "Peca{" + "codigo=" + codigo + ", descricao=" + descricao + ", categoria=" + categoria + '}';
    }

    @Override
    public int compareTo(Peca p) { //sort, contains de arvore
        if (Integer.parseInt(this.codigo) == Integer.parseInt(p.codigo))
            return 0;
        
        if (Integer.parseInt(this.codigo) < Integer.parseInt(p.codigo)) {
            return -1;
        }
        return 1;
    }    
}
