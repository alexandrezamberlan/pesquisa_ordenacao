package servidor.model;

import java.util.HashMap;

/**
 * classe para sessoes de telefonia
 * @author laboratorio
 */
public class TabelaHash {
    /**
     * sessoes é um HashMap com chave celular e conteúdo sendo dados da sessão
     */
    public HashMap<String, Sessao> sessoes;
     
    
    public TabelaHash() {
        sessoes = new HashMap<>();         
    }
}
