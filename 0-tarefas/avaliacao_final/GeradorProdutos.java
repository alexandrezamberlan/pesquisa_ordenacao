import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/**
 * Gera arquivos de produtos para o trabalho prático de Pesquisa e Ordenação.
 *
 * Formato (uma linha por produto, separado por ponto e vírgula):
 *   id;nome;categoria;preco;estoque
 *
 * Uso:
 *   java GeradorProdutos.java                  -> gera 1000, 10000 e 50000 registros
 *   java GeradorProdutos.java 2000 30000       -> gera apenas os tamanhos informados
 *
 * A semente é fixa, então os arquivos gerados são sempre iguais.
 */
public class GeradorProdutos {

    private static final long SEMENTE = 20261011L;

    // categoria -> produtos-base (o nome final recebe uma variação para não repetir demais)
    private static final String[][] CATALOGO = {
        {"Informática", "Teclado Mecânico", "Mouse Óptico", "Monitor", "Webcam", "Headset", "Pen Drive", "SSD Externo", "Roteador"},
        {"Eletrodomésticos", "Liquidificador", "Cafeteira", "Ventilador", "Aspirador de Pó", "Fritadeira Elétrica", "Micro-ondas", "Batedeira"},
        {"Papelaria", "Caderno", "Caneta Esferográfica", "Lápis de Cor", "Marcador de Texto", "Agenda", "Pasta Arquivo", "Grampeador"},
        {"Esportes", "Bola de Futebol", "Raquete de Tênis", "Bola de Vôlei", "Corda de Pular", "Luva de Treino", "Bicicleta Ergométrica", "Halter"},
        {"Brinquedos", "Quebra-Cabeça", "Carrinho de Controle Remoto", "Boneca", "Jogo de Tabuleiro", "Blocos de Montar", "Pelúcia"},
        {"Livros", "Romance", "Livro Técnico", "Biografia", "Livro Infantil", "Guia de Viagem", "Livro de Receitas"},
        {"Vestuário", "Camiseta", "Calça Jeans", "Jaqueta", "Meia Esportiva", "Boné", "Moletom", "Bermuda"},
        {"Beleza", "Shampoo", "Condicionador", "Perfume", "Hidratante", "Protetor Solar", "Esmalte"},
        {"Ferramentas", "Furadeira", "Chave de Fenda", "Martelo", "Trena", "Serra Manual", "Alicate", "Nível a Laser"},
        {"Jardinagem", "Mangueira", "Vaso de Cerâmica", "Tesoura de Poda", "Regador", "Adubo Orgânico", "Pá de Jardim"},
        {"Automotivo", "Óleo de Motor", "Filtro de Ar", "Palheta de Para-brisa", "Capa de Banco", "Carregador Veicular", "Aditivo"},
        {"Alimentos", "Café Torrado", "Azeite Extra Virgem", "Chocolate Amargo", "Granola", "Mel Puro", "Biscoito Integral"},
    };

    private static final String[] VARIACOES = {
        "Pro", "Plus", "Max", "Lite", "Compacto", "Premium", "Básico", "Turbo",
        "Classic", "Smart", "Ultra", "Eco", "Família", "Profissional", "Mini"
    };

    public static void main(String[] args) throws IOException {
        int[] tamanhos = {1000, 10000, 50000};
        if (args.length > 0) {
            tamanhos = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                tamanhos[i] = Integer.parseInt(args[i]);
            }
        }
        for (int n : tamanhos) {
            gerar(n);
        }
    }

    private static void gerar(int quantidade) throws IOException {
        Random rnd = new Random(SEMENTE + quantidade);

        // ids únicos e fora de ordem: sorteia valores sem repetição dentro de uma faixa maior
        List<Integer> ids = new ArrayList<>(quantidade);
        for (int i = 0; i < quantidade; i++) {
            ids.add(1000 + i);
        }
        Collections.shuffle(ids, rnd);

        String arquivo = "produtos_" + quantidade + ".txt";
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(arquivo), StandardCharsets.UTF_8)) {
            bw.write("id;nome;categoria;preco;estoque");
            bw.newLine();
            for (int i = 0; i < quantidade; i++) {
                String[] grupo = CATALOGO[rnd.nextInt(CATALOGO.length)];
                String categoria = grupo[0];
                String base = grupo[1 + rnd.nextInt(grupo.length - 1)];
                String nome = base + " " + VARIACOES[rnd.nextInt(VARIACOES.length)]
                        + " " + (100 + rnd.nextInt(900));

                // preço entre 5,00 e 3000,00 com duas casas decimais (ponto como separador)
                double preco = 5 + rnd.nextDouble() * 2995;
                int estoque = rnd.nextInt(501);

                bw.write(String.format(Locale.US, "%d;%s;%s;%.2f;%d",
                        ids.get(i), nome, categoria, preco, estoque));
                bw.newLine();
            }
        }
        System.out.println("Gerado: " + arquivo + " (" + quantidade + " produtos)");
    }
}
