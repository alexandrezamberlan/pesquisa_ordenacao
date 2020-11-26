/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hash;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author alexandrezamberlan
 */
public class Hash4 {

    public static void main(String[] args) {
        HashSet<Aluno> listaComControleDuplicidade = new HashSet<>();

        String nome;
        int matricula;
        Aluno aluno;
        while (true) {
            nome = JOptionPane.showInputDialog(null, "Informe um nome: ");
            if (nome.equals("sair")) {
                break;
            }
            matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matrícula: "));

            aluno = new Aluno(matricula, nome);

            if (listaComControleDuplicidade.add(aluno)) {
                System.out.println("Inserção com sucesso");
            } else {
                System.out.println("Aluno já existente");
            }
        }

        for (Iterator<Aluno> p = listaComControleDuplicidade.iterator(); p.hasNext();) {
            System.out.println(p.next());
        }
        
        int m = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe matricula de pesquisa: "));
        aluno = new Aluno(m);
        
        if (listaComControleDuplicidade.contains(aluno)) {
            System.out.println(aluno.matricula + "  encontrado");
        }
    }
}
