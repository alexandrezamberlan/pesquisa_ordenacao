
package com.mycompany.hash;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alexandrezamberlan
 */
public class Hash1 {
    public static void main(String a[]) {
        List<String> listaSemControleDuplicidade = new LinkedList<>();
        
        String nome;
        while (true) {
            nome = JOptionPane.showInputDialog(null,"Informe um nome: ");
            if ( nome.equals("sair") )
                break;
            if (!listaSemControleDuplicidade.contains(nome)) {
                listaSemControleDuplicidade.add(nome);
            }
        }
        
        System.out.println(listaSemControleDuplicidade);
    }
    
}
