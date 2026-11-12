
package model;

import java.util.HashMap;

public class TabelaHash {
    //chave é o hash, enquanto o conteúdo é o link original
    public HashMap<String,String> links;

    public TabelaHash() {
        links = new HashMap<>();
    }
}