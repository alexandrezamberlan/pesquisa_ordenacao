import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //gerar n numeros de range m
        
        //gerar n palavras de tamanho m
        ArrayList<String> listaPalavras = new ArrayList<>();
        Util.gerarPalavrasLista(listaPalavras, 10, 8);
        Util.exibir(listaPalavras, "Lista de palavras...");
    }
}


