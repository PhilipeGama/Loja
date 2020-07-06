/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Administrador;
import model.Cliente;
import view.ClienteView;
import view.MenuAdministradorView;
import view.MenuClienteView;
import java.util.ArrayList;
/**
 *
 * @author Aluno
 */
public class LoginControl {
    public static boolean verificarLoginAdmin(String nome,String senha){
          ArrayList<Administrador> a1 = Administrador.getAdmins();
       
          //System.out.println("1");
          for(Administrador a: a1){
              if(a.getNome().equals(nome) && a.getSenha().equals(senha)){
                  //System.out.println("1111");
                  MenuAdministradorView MaV = new MenuAdministradorView();
                  MaV.setVisible(true);
                  return true;
              }
          }
          return false;
      
    } 
    
     public static boolean verificarLoginCliente(String nome,String senha){
          ArrayList<Cliente> c1 = Cliente.getClientes();
       
          //System.out.println("1");
          int i =0;
          for(Cliente c: c1){
              if(c.getNome().equals(nome) && c.getSenha().equals(senha)){
                
                  //MaV.setVisible(true);
                  
                  MenuClienteView MC1 = new MenuClienteView();
                  MenuClienteControl MC = new MenuClienteControl(i);
                          
                  
                  MC1.setVisible(true);
                  
                  
                  return true;
              }
          i++;    
          }
          return false;
      
    } 
    
     public static void bt_cadastrar(){
         ClienteView Cw = new ClienteView();
         Cw.setVisible(true);
     }
   
    
    
}
