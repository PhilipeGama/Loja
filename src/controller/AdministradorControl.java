/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Administrador;
import java.util.ArrayList;

/**
 *
 * @author Philipe
 */
public class AdministradorControl {
    public static int salvarAdmins(int row,String id,String nome,String senha){
        //String
        if(nome.equals("") || senha.equals("")){
//       
            return 1;
        }
        
        
        Administrador a1 = new Administrador();
        ///if(id.equals("") || nome.equals(""))
        a1.setId(Integer.parseInt(id));
        
        a1.setNome(nome);
        a1.setSenha(senha);
        a1.Persistir(row);
        return 0;
    }
    
    public static ArrayList<String[]> getAdmins(){
        ArrayList<String[]> Admins = new ArrayList();
        ArrayList<Administrador> a1 = Administrador.getAdmins();
        if(a1!=null){
        for(int i =0;i<a1.size();i++){
            String a[] = new String[3];
            a[0] = Integer.toString(a1.get(i).getId());
            a[1] = a1.get(i).getNome();
            a[2] = a1.get(i).getSenha();
            Admins.add(a);
        }
        }    
        return Admins;
        
    }
    
    public static boolean excluirAdmin(int row){
        return Administrador.excluir(row);
       
    }
    
    public static int buscarAdminNome(String nome){
      return Administrador.buscarNome(nome);
    }
    public static int novoId(){
//        ArrayList a = Administrador.getAdmins();
//       int i = a.size();
        return Administrador.getUltimo();
        
//        
    } 
    
}
