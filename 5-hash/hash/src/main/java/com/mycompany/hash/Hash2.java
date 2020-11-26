package com.mycompany.hash;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alexandrezamberlan
 */
public class Hash2 {
    public static void main(String a[]) {
        HashSet<String> listaComControleDuplicidade = new HashSet<>();
        
        String nome;
        while (true) {
            nome = JOptionPane.showInputDialog(null,"Informe um nome: ");
            if ( nome.equals("sair") )
                break;
            System.out.println("Hash do nome: " + nome.hashCode());
            if (listaComControleDuplicidade.add(nome)){
                System.out.println("Nome inserido com sucesso");
            } else {
                System.out.println("Nome já existente na estrutura");
            }
            
        }
        
        System.out.println(listaComControleDuplicidade);
    }
    
}
