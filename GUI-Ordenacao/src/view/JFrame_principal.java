/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Ordenacao;

/**
 *
 * @author alexandrezamberlan
 */
public class JFrame_principal extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_principal
     */
    public JFrame_principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_listaNumeros = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_numerosOrdenados = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_metodoUtilizado = new javax.swing.JTextField();
        jTextField_tempoProcessamento = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_file = new javax.swing.JMenu();
        jMenuItem_abrirArquivo = new javax.swing.JMenuItem();
        jMenu_selecionarMetodos = new javax.swing.JMenu();
        jMenuItem_combsort = new javax.swing.JMenuItem();
        jMenuItem_quicksort = new javax.swing.JMenuItem();
        jMenuItem_mostrarHistorico = new javax.swing.JMenuItem();
        jMenu_about = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea_listaNumeros.setEditable(false);
        jTextArea_listaNumeros.setColumns(20);
        jTextArea_listaNumeros.setRows(5);
        jTextArea_listaNumeros.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea_listaNumeros);

        jTextArea_numerosOrdenados.setEditable(false);
        jTextArea_numerosOrdenados.setColumns(20);
        jTextArea_numerosOrdenados.setRows(5);
        jTextArea_numerosOrdenados.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea_numerosOrdenados);

        jLabel1.setText("Método utilizado: ");

        jLabel2.setText("Tempo de processamento (ms): ");

        jTextField_metodoUtilizado.setEditable(false);
        jTextField_metodoUtilizado.setFocusable(false);

        jTextField_tempoProcessamento.setEditable(false);
        jTextField_tempoProcessamento.setFocusable(false);

        jMenu_file.setText("Arquivo");

        jMenuItem_abrirArquivo.setText("Abrir arquivo");
        jMenuItem_abrirArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_abrirArquivoActionPerformed(evt);
            }
        });
        jMenu_file.add(jMenuItem_abrirArquivo);

        jMenu_selecionarMetodos.setText("Selecionar métodos");

        jMenuItem_combsort.setText("Combsort");
        jMenuItem_combsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_combsortActionPerformed(evt);
            }
        });
        jMenu_selecionarMetodos.add(jMenuItem_combsort);

        jMenuItem_quicksort.setText("Quicksort");
        jMenuItem_quicksort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_quicksortActionPerformed(evt);
            }
        });
        jMenu_selecionarMetodos.add(jMenuItem_quicksort);

        jMenu_file.add(jMenu_selecionarMetodos);

        jMenuItem_mostrarHistorico.setText("Histórico de testes");
        jMenu_file.add(jMenuItem_mostrarHistorico);

        jMenuBar1.add(jMenu_file);

        jMenu_about.setText("Sobre");
        jMenu_about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_aboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_about);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_metodoUtilizado)
                    .addComponent(jTextField_tempoProcessamento, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_metodoUtilizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_tempoProcessamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_abrirArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_abrirArquivoActionPerformed
        
        lista.clear();
        jTextArea_listaNumeros.setText("");
        jTextArea_numerosOrdenados.setText("");
        jTextField_metodoUtilizado.setText("");
        jTextField_tempoProcessamento.setText("");
        
        int numero;
        
        /*
        caixaSelecionaArquivo.setCurrentDirectory(new java.io.File("caminho/diretorio");
        */
        
        JFileChooser caixaSelecionaArquivo = new JFileChooser();
        
        FileNameExtensionFilter filtroExtensao = new FileNameExtensionFilter("Text files", "txt");
        caixaSelecionaArquivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        caixaSelecionaArquivo.addChoosableFileFilter(filtroExtensao);
        caixaSelecionaArquivo.setFileFilter(filtroExtensao);
        
      
        if (caixaSelecionaArquivo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            File caminhoArquivo = new File(caixaSelecionaArquivo.getSelectedFile().toString());
            //percorrer o procuradorArquivo, copiar o texto (números) e appendar na textArea
            try {
                Scanner leitorArquivo = new Scanner(caminhoArquivo);
                
                while (leitorArquivo.hasNextLine()) {
                    numero = Integer.parseInt(leitorArquivo.nextLine());
                    lista.add(numero);
                    jTextArea_listaNumeros.append(numero + "\n");
                }
                
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this,"Problemas para abrir o arquivo");
            }
        }
    }//GEN-LAST:event_jMenuItem_abrirArquivoActionPerformed

    private void inserirAreaTextoOrdenada(ArrayList<Integer> lista) {
        jTextArea_numerosOrdenados.setText("");
        for (Iterator<Integer> i = lista.iterator(); i.hasNext();) {
            jTextArea_numerosOrdenados.append(i.next() + "\n");
        }
    }
    
    private void jMenu_aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_aboutMouseClicked
        
        StringBuffer texto = new StringBuffer();
        texto.append("Sistema construído na disciplina de Pesquisa e Ordenação\n");
        texto.append("Alunos: Gabriel, Augusto, Zeni, Regis, Lucas Thiago, Meani e João\n");
        
        JOptionPane.showMessageDialog(this, texto.toString());
    }//GEN-LAST:event_jMenu_aboutMouseClicked

    private void jMenuItem_combsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_combsortActionPerformed
        // TODO add your handling code here:
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this,"É preciso abrir um arquivo com números.");
            return;
        }
        
        listaTemporaria.clear();
        listaTemporaria.addAll(lista); //clonando
        
        jTextField_metodoUtilizado.setText("COMBSORT");
        jTextArea_numerosOrdenados.setText("");
        
        long tempoInicio = System.nanoTime();
        Ordenacao.pente(listaTemporaria);
        jTextField_tempoProcessamento.setText("" + (System.nanoTime() - tempoInicio)/1000000);
        
        inserirAreaTextoOrdenada(listaTemporaria);
        //gravarArquivoLog
        //data - hora - metodo - tempo - qtosNumeros
    }//GEN-LAST:event_jMenuItem_combsortActionPerformed

    private void jMenuItem_quicksortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_quicksortActionPerformed
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this,"É preciso abrir um arquivo com números.");
            return;
        }
        
        listaTemporaria.clear();
        listaTemporaria.addAll(lista); //clonando
        
        jTextField_metodoUtilizado.setText("QUICKSORT");
        jTextArea_numerosOrdenados.setText("");
        
        long tempoInicio = System.nanoTime();
        Ordenacao.quickSort(listaTemporaria,0,listaTemporaria.size()-1);
        jTextField_tempoProcessamento.setText("" + (System.nanoTime() - tempoInicio)/1000000);
        
        inserirAreaTextoOrdenada(listaTemporaria);
        
        //gravarArquivoLog
        //data - hora - metodo - tempo - qtosNumeros
        
    }//GEN-LAST:event_jMenuItem_quicksortActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_principal().setVisible(true);
            }
        });
    }
    
    ArrayList<Integer> lista = new ArrayList<>();
    ArrayList<Integer> listaTemporaria = new ArrayList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem_abrirArquivo;
    private javax.swing.JMenuItem jMenuItem_combsort;
    private javax.swing.JMenuItem jMenuItem_mostrarHistorico;
    private javax.swing.JMenuItem jMenuItem_quicksort;
    private javax.swing.JMenu jMenu_about;
    private javax.swing.JMenu jMenu_file;
    private javax.swing.JMenu jMenu_selecionarMetodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_listaNumeros;
    private javax.swing.JTextArea jTextArea_numerosOrdenados;
    private javax.swing.JTextField jTextField_metodoUtilizado;
    private javax.swing.JTextField jTextField_tempoProcessamento;
    // End of variables declaration//GEN-END:variables
}
