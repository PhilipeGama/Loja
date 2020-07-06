/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import model.Administrador;
import controller.AdministradorControl;
import java.util.ArrayList;

/**
 *
 * @author Philipe
 */
public class ExecTestes {
    public static void main(String[] args) {
//        ArrayList<Administrador> lA = Administrador.getAdmins();
//        Administrador a1 = new Administrador();;
//        a1.setId(2);
////        a1.setNome("Pedro");
////        a1.setSenha("113");
////        a1.Persistir();
////
////        if(lA!=null){
////            for(Administrador a2:lA){
////                System.out.println("ID:"+a2.getId()+" Nome:"+a2.getNome()+" Senha:"+a2.getSenha());
////            }
////        }
//    ArrayList <String[]> a = AdministradorControl.getAdmins();
//    for(String[] s:a){
//        System.out.println("ID:"+s[2]);
//        System.out.println("Senha:"+s[0]);
//        System.out.println("Nome:"+s[1]);
//     
//    }
        System.out.println(Administrador.getAdmins());
        System.out.println(Administrador.getUltimo());
        
        
}   
}
