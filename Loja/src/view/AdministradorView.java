/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.AdministradorControl;
import controller.ProdutoControl;
import model.Administrador;
import tableModel.AdministradorTM;
import tableModel.ClienteTM;
import java.awt.ScrollPane;
import javax.swing.JOptionPane;
/**
 *
 * @author Philipe
 */
public class AdministradorView extends javax.swing.JFrame {
     AdministradorTM modelo; 
    public void loadTable(){
       modelo = new AdministradorTM(AdministradorControl.getAdmins());
       jtb_Admin.setModel(modelo);

        jtb_Admin.getColumnModel().getColumn(0).setPreferredWidth(10);
        jtb_Admin.getColumnModel().getColumn(1).setPreferredWidth(100);
        jtb_Admin.getColumnModel().getColumn(2).setPreferredWidth(150);
       
    } 
    /**
     * Creates new form AdministradorView
     */
    public AdministradorView() {
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
        jtb_Admin = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtf_Id = new javax.swing.JTextField();
        jtf_Nome = new javax.swing.JTextField();
        jtf_Senha = new javax.swing.JTextField();
        jbt_Salvar = new javax.swing.JButton();
        jbt_Excluir = new javax.swing.JButton();
        jbt_Voltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jtb_Admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_AdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_Admin);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Senha");

        jtf_Id.setEditable(false);

        jbt_Salvar.setText("Salvar");
        jbt_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_SalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbt_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_Nome)
                        .addComponent(jtf_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jbt_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jbt_Excluir.setText("Excluir");
        jbt_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_ExcluirActionPerformed(evt);
            }
        });

        jbt_Voltar.setText("Voltar");
        jbt_Voltar.setToolTipText("");
        jbt_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_VoltarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel4.setText("Lista de Administradores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(180, 180, 180))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbt_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbt_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbt_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbt_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public void Botoes(boolean N, boolean E, boolean R, boolean S, boolean C){
        //jbt_Novo.setEnabled(N);
        //jbt_Editar.setEnabled(E);
        jbt_Excluir.setEnabled(R);
        jbt_Salvar.setEnabled(S);
        //jbt_Cancelar.setEnabled(C);        
    }
     
     public void novoDados(){
        jtf_Id.setText(Integer.toString(AdministradorControl.novoId()+1));
        jtf_Nome.setText("");
        jtf_Senha.setText("");
       
     }
     
    private void jbt_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_SalvarActionPerformed
        // TODO add your handling code here:
        int i = jtb_Admin.getSelectedRow();
        int ver = 0;
       if(jtb_Admin.isRowSelected(i))
       {
           AdministradorControl.salvarAdmins(jtb_Admin.getSelectedRow(),jtf_Id.getText(),jtf_Nome.getText(),jtf_Senha.getText());
       }
       else
       {
           ver = AdministradorControl.salvarAdmins(jtb_Admin.getSelectedRow(),String.valueOf(AdministradorControl.novoId()+1),jtf_Nome.getText(),jtf_Senha.getText());
       }
        
        if(ver==1)
        {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
        else if(ver==0)
        {
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            jtf_Id.setText("");
            jtf_Nome.setText("");
            jtf_Senha.setText("");
        }
        //Botoes(true, false, false, true, true);
        this.loadTable();

    }//GEN-LAST:event_jbt_SalvarActionPerformed
   
    private void jtb_AdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_AdminMouseClicked
         //TODO add your handling code here:
        int index = jtb_Admin.getSelectedRow();
        if(index >= 0 && index<modelo.getRowCount()){
            String temp[] = modelo.getAluno(index);
            jtf_Id.setText(temp[0]);
            jtf_Nome.setText(temp[1]);
            jtf_Senha.setText(temp[2]);
        }    
        //Botoes(true, true, true, false, false);
    }//GEN-LAST:event_jtb_AdminMouseClicked

    private void jbt_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_ExcluirActionPerformed
        // TODO add your handling code here:
        AdministradorControl.excluirAdmin(jtb_Admin.getSelectedRow());
        jtf_Id.setText("");
            jtf_Nome.setText("");
            jtf_Senha.setText("");
        this.loadTable();
    }//GEN-LAST:event_jbt_ExcluirActionPerformed

    private void jbt_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_VoltarActionPerformed
        dispose();
        MenuAdministradorView menu = new MenuAdministradorView();
        menu.setVisible(true);
    }//GEN-LAST:event_jbt_VoltarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        String asd = jtf_Id.getText();
        if(asd.equals(""))
        {
            //System.out.println("Limpo");
            
        }else{   
            //System.out.println("nao Limpo");
            jtb_Admin.clearSelection();
            jtf_Id.setText("");
            jtf_Nome.setText("");
            jtf_Senha.setText("");
        }
            
        
    }//GEN-LAST:event_formMouseClicked
    
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
            java.util.logging.Logger.getLogger(AdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_Excluir;
    private javax.swing.JButton jbt_Salvar;
    private javax.swing.JButton jbt_Voltar;
    private javax.swing.JTable jtb_Admin;
    private javax.swing.JTextField jtf_Id;
    private javax.swing.JTextField jtf_Nome;
    private javax.swing.JTextField jtf_Senha;
    // End of variables declaration//GEN-END:variables
}
