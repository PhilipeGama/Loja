/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class ClienteControl {
     public static int  salvarCliente(int row,String id,String nome,String senha,String email){
       if(nome.equals("") || senha.equals("") || senha.equals("")){
            return 1;
        }
        Cliente c1 = new Cliente();
        ///if(id.equals("") || nome.equals(""))
        c1.setId(Integer.parseInt(id));
        //c1.setCarteira(Double.parseDouble(carteira));
        c1.setEmail(email);
        c1.setNome(nome);
        c1.setSenha(senha);
        c1.Persistir(row);
        return 0;
    }
    
    public static ArrayList<String[]> getClientes(){
        ArrayList<String[]> Admins = new ArrayList();
        ArrayList<Cliente> a1 = Cliente.getClientes();
        if(a1!=null){
        for(int i =0;i<a1.size();i++){
            String a[] = new String[3];
            a[0] = Integer.toString(a1.get(i).getId());
            a[1] = a1.get(i).getNome();
            a[2] = a1.get(i).getSenha();
            a[3] = String.valueOf(a1.get(i).getCarteira());
            a[4] = a1.get(i).getEmail();
            Admins.add(a);
        }
        }    
        return Admins;
        
    }
    
    public static boolean excluirAdmin(int row){
        return Cliente.excluir(row);
       
    }
    
    public static int buscarAdminNome(String nome){
      return Cliente.buscarNome(nome);
    }
    public static int novoId(){
        ArrayList<Cliente> a1 = Cliente.getClientes();
        return Cliente.getUltimo();
//        
    } 
}
