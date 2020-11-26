
package com.mycompany.hash;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alexandrezamberlan
 */
public class Hash3 {
    public static void main(String a[]) {
        List<Aluno> listaSemControleDuplicidade = new LinkedList<>();
        
        String nome;
        int matricula;
        Aluno aluno;
        while (true) {
            nome = JOptionPane.showInputDialog(null,"Informe um nome: ");
            if ( nome.equals("sair") )
                break;
            matricula = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a matrícula: "));
            
            
            aluno = new Aluno(matricula,nome);
            
            if (!listaSemControleDuplicidade.contains(aluno)) {
                listaSemControleDuplicidade.add(aluno);
            } else {
                System.out.println("Aluno já existente");
            }
        }
        
        System.out.println(listaSemControleDuplicidade);
    }
    
}
