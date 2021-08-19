/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import view.CategoriaView;
import view.ListaCompraView;
import view.AdministradorView;
import view.MensagemView;
import view.ClienteTabelaView;
import view.ProdutoView;
import tableModel.ListarCompraTM;

//import View.CategoriaView;
//import View.ProdutoView;
/**
 *
 * @author Aluno
 */
public class MenuAdministradorControl {
    public static void telaAdministrador(){
        AdministradorView Av = new AdministradorView();
        Av.setVisible(true);
    }
    
     public static void telaProduto(){
        ProdutoView Pv = new ProdutoView();
        Pv.setVisible(true);
    }
     
    public static void telaCategoria(){
        CategoriaView Cv = new CategoriaView();
        Cv.setVisible(true);
    } 
    public static void telaCliente(){
        ClienteTabelaView Cv = new ClienteTabelaView();
        Cv.setVisible(true);
    }
    
    public static void  TelaMensagem(){
        MensagemView Mv = new MensagemView();
        Mv.setVisible(true);
    }
    
     public static void  TelaListarCompra(){
       ListaCompraView LCw = new ListaCompraView();
       LCw.setVisible(true);
    }
    

}
