package utilidades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import model.Sessao;

public class Util {

    public static String carregarArquivoEmHashMap(String nomeArquivo, HashMap<String, Sessao> sessoes, StringBuilder dadosSessoes) {
        try {
            Path caminho = Paths.get(nomeArquivo);

            // 1. Lê todas as linhas do arquivo de uma vez só (Java 8+)
            List<String> linhas = Files.readAllLines(caminho);

            // 2. Alimenta o StringBuilder e o HashMap em um único fluxo
            for (String linha : linhas) {

                // Adiciona a linha ao StringBuilder (mantendo a quebra de linha original)
                dadosSessoes.append(linha).append(System.lineSeparator());

                // Remove espaços e processa se não estiver vazia
                if (!linha.trim().isEmpty()) {
                    String[] dadosLinha = linha.split(";");

                    if (dadosLinha.length >= 2) {
                        Sessao sessao = new Sessao(dadosLinha[0], dadosLinha[1]);
                        sessoes.put(sessao.getNumeroCelular(), sessao);
                    }
                }
            }
            return "";
        } catch (IOException e) {
            //System.err.println();
            return "Erro ao processar o arquivo: " + e.getMessage();
        }
    }
}