import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Util {
    public static void gravarNoArquivo() {
        String nomeArquivo, frase;
        try {
            FileWriter fw;
            //fw = new FileWriter("nomesjava.txt"); // Reescreve o arquivo arq.txt
            nomeArquivo = JOptionPane.showInputDialog(null, "Nome do arquivo");
            fw = new FileWriter(nomeArquivo, true); // Não reescreve o arquivo arq.txt (adiciona ao arquivo)
            do {
                frase = JOptionPane.showInputDialog(null, "Digite o que deseja inserir no arquivo ou a palavra 'fim' para encerrar: ");
                if (frase.equalsIgnoreCase("fim")){  // ignora se o caractere é maiúsculo ou minúsculo ("fim" ou "FIM")
                    break;
                }
                fw.write(frase + "\n"); // Escreve a string na linha    
            } while(true);
            fw.close();
        }catch (Exception e){
            System.out.println("Erro "+ e.getMessage());
        }
    }

    public static void lerArquivo() {
        String nomeArquivo;
        try {
            nomeArquivo = JOptionPane.showInputDialog(null, "Nome do arquivo");
            FileReader fr;
            fr = new FileReader(nomeArquivo);
            BufferedReader bf = new BufferedReader(fr);
            String linha;
            do {
                linha = bf.readLine();
                if (linha == null) {
                    break;
                }
                System.out.println(linha);
            } while(true);
            bf.close();
        }catch (Exception e){
            System.out.println("Erro "+ e.getMessage());
        }
    }    
}
