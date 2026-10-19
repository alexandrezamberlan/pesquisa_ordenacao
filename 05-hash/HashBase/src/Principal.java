
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

class TabelaHash {
    
    public static int calcularEndereco(String nome, int n) {
        return nome.length() % n;
    }
    
    public static void inicializar(List[] tabela, int n){
        for (int i = 0; i < n; i++) {
            tabela[i] = new ArrayList<String>();
        }        
    }
    
    public static void inserir(String nome, List[] tabela) {
        int endereco = calcularEndereco(nome, tabela.length);
        tabela[endereco].add(nome);
        System.out.println(nome + " inserido na tabela no endereco " + endereco);        
    }
    
    public static void exibir(List[] tabela) {
        for (int i = 0; i < tabela.length; i++) {
            for (Object object : tabela[i]) {
                System.out.println(object);                
            }
        }        
    }
    
    public static int pesquisar(String nome, List[] tabela) {
        int endereco = calcularEndereco(nome, tabela.length);
        
        if (tabela[endereco].contains(nome)) {
            return endereco;
        }
        return -1;
    }
}

public class Principal {
    public static void main(String[] args) {
        final int TAMANHO = 10;               
        List[] tabelaHash = new List[TAMANHO];
        TabelaHash.inicializar(tabelaHash, TAMANHO);
        String nome;
        
        do {
            nome = JOptionPane.showInputDialog(null,"Informe um nome!");
            if (nome.equalsIgnoreCase("SAIR")) {
                break;
            }
            TabelaHash.inserir(nome, tabelaHash);            
        } while (true);
        
        TabelaHash.exibir(tabelaHash);
        
        do {
            nome = JOptionPane.showInputDialog(null,"Informe um nome para pesquisa");
            if (nome.equalsIgnoreCase("SAIR")) {
                break;
            }
            int endereco = TabelaHash.pesquisar(nome, tabelaHash);
            if (endereco != -1) {
                JOptionPane.showMessageDialog(null, "Nome localizado no endereco " + endereco);
            } else {
                JOptionPane.showMessageDialog(null,"Nome nao localizado");
            }            
        } while (true);
        
        
    }
    
}
