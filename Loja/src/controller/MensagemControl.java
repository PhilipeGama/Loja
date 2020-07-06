/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Mensagem;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class MensagemControl {
    public static int salvarMsg(int row,String id,String texto,boolean status){
        if(texto.equals("") ){
//       
            return 1;
        }
        Mensagem a1 = new Mensagem();
        
        
        ///if(id.equals("") || nome.equals(""))
        a1.setId(Integer.parseInt(id));
        a1.setStatus(status);
        a1.setTexto(texto);
        
        a1.Persistir(row);
        return 0;
    }
    
    
    public static ArrayList<String[]> getMsg(){
        ArrayList<String[]> Admins = new ArrayList();
        ArrayList<Mensagem> a1 = Mensagem.getMensagem();
        if(a1!=null){
        for(int i =0;i<a1.size();i++){
            String a[] = new String[3];
            a[0] = Integer.toString(a1.get(i).getId());
            a[1] = a1.get(i).getTexto();
            if(a1.get(i).getStatus() == false){
                a[2] = "Pendente";
            }
            else
            {
                a[2] = "Visto";
            }
            Admins.add(a);
        }
        }    
        return Admins;
        
    }
    
    public static boolean excluirMsg(int row){
        return Mensagem.excluir(row);
       
    }
    
    public static int buscarMsgNome(String nome){
      return Mensagem.buscarNome(nome);
    }
    public static int novoId()
    {
        return Mensagem.getUltimo();
    }
}
