/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CompraRealizadaControl;

import tableModel.ListarCompraTM;

/**
 *
 * @author Aluno
 */
public class CompraRealizadaView extends javax.swing.JFrame {
    ListarCompraTM modelo;
    
    public void loadTable(){
        //modelo = ListarCompraTM(CompraRealizadaControl.getCompras());
        modelo = new ListarCompraTM(CompraRealizadaControl.getCompras());
        jtb_Compras.setModel(modelo);
        jtb_Compras.getColumnModel().getColumn(0).setPreferredWidth(50);
        jtb_Compras.getColumnModel().getColumn(1).setPreferredWidth(100);
        jtb_Compras.getColumnModel().getColumn(2).setPreferredWidth(150);
        jtb_Compras.getColumnModel().getColumn(3).setPreferredWidth(150);
        jtb_Compras.getColumnModel().getColumn(4).setPreferredWidth(150);
        
    } 
    /**
     * Creates new form CompraRealizadaControl
     */
    public CompraRealizadaView() {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_Compras = new javax.swing.JTable();
        jbt_Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtb_Compras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_ComprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_Compras);

        jbt_Voltar.setText("Voltar");
        jbt_Voltar.setToolTipText("");
        jbt_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jbt_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jbt_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtb_ComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_ComprasMouseClicked
//        //TODO add your handling code here:
//        int index = jtb_Compras.getSelectedRow();
//        if(index >= 0 && index<modelo.getRowCount()){
//            String temp[] = modelo.getAluno(index);
//            if(temp[4].equals("Pendente"))
//            {
//                jStatus.setSelected(false);
//            }
//            else
//            {
//                jStatus.setSelected(true);
//            }
//            //jtf_Id.setText(temp[0]);
//            //jTxt.setText(temp[1]);
//            //jtf_Senha.setText(temp[2]);
//        }
//        //        Botoes(true, true, true, true, false);
    }//GEN-LAST:event_jtb_ComprasMouseClicked

    private void jbt_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_VoltarActionPerformed
        // TODO add your handling code here:
        MenuAdministradorView MAw = new MenuAdministradorView();
        MAw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbt_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(CompraRealizadaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraRealizadaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraRealizadaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraRealizadaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraRealizadaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_Voltar;
    private javax.swing.JTable jtb_Compras;
    // End of variables declaration//GEN-END:variables
}
