
package Arvore1;

import com.sun.source.tree.Tree;
import java.util.TreeMap;

public class Arvore1 {
    public static void main(String[] args) {
        TreeMap minhaArvore = new TreeMap();
        
        minhaArvore.put(100, "Lucas");
        minhaArvore.put(50, "Alexandre");
        minhaArvore.put(30, "Pedro");
        minhaArvore.put(80, "Outro Pedro");
        minhaArvore.put(100, "Meani");
        
        if ( minhaArvore.containsValue("jose") ) {
            System.out.println("Localizou");
        } else System.out.println("Não localizou");
        
        System.out.println(minhaArvore);
        
        System.out.println(minhaArvore.firstEntry());
        System.out.println(minhaArvore.tailMap(50));
    }
    
}
