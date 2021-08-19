/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
import model.ItemCompra;
import view.ClienteView;
import view.CompraView;
import view.MensagemClienteView;
import view.MenuClienteView;
import javax.swing.JOptionPane;

/**
 *
 * @author Philipe
 */
public class MenuClienteControl {
    public int indexCliente;
    
    
    
    public MenuClienteControl() {
       
    }
    public MenuClienteControl(int i) {
        indexCliente = i;
    }
    
    
    public boolean bt_Mensagem(){
        
       MensagemClienteView MW = new MensagemClienteView();
        MW.setVisible(true);
        return true;
    } 
    
    public boolean bt_Compra(){
        CompraView CW = new CompraView(indexCliente+1);
        CW.setVisible(true);
        return true;
    }
    
    public boolean bt_Editar(){
        ClienteView Cw = new ClienteView(indexCliente);
        Cw.setVisible(true);
        
        return true;
    }
    
    
    public boolean bt_Excluir(){
        
        
        int resp = JOptionPane.showConfirmDialog(null, "Voce deseja realmente excluir sua conta");
        if(resp==0){
                 JOptionPane.showMessageDialog(null,"Conta deletada");
            return Cliente.excluir(indexCliente);
                 
        }else{
            JOptionPane.showMessageDialog(null,"Operação cancelada");
            return true;
        }
        
    }
//    public boolean bt_CompraRealizadas(){
//        //CompraView
//    }
    
}
