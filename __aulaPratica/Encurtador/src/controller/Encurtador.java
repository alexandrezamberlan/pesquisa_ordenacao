
package controller;

import model.TabelaHash;


public class Encurtador {
        
    public static String encurtar(String linkOriginal, TabelaHash tabela) {
        String DOMINIO = "localhost";
        
        String hashGerado = "" + (linkOriginal.hashCode() & 0x7fffffff);
        
        tabela.links.put(hashGerado, linkOriginal);
        
        return "https://" + DOMINIO + "/" + hashGerado;
    }
    
    public static String buscarLinkEncurtado(String linkEncurtado, TabelaHash tabela) {
        String dadosLink[];
        dadosLink = linkEncurtado.split("/");
        String hashObtido = dadosLink[ dadosLink.length - 1 ];
        
        String resposta = tabela.links.get(hashObtido);
        
        if (resposta == null) {
            resposta = "Link encurtado não encontrado!";
        }
        return resposta;
    }    
}
