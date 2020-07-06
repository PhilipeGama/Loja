/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ItemCompra;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class CompraRealizadaControl {
    public static ArrayList<String[]> getCompras(){
        
        ArrayList<ItemCompra> listaC = ItemCompra.getCompras();
        ArrayList <String[]> getC = new ArrayList();
        if(listaC != null){
        for(ItemCompra c: listaC){
            String qtd = "";
            String pr = "";
            String nome = String.valueOf(c.getCliente());
            String idCompra = String.valueOf(c.getId());
            qtd = "[";
            pr = "[";
            for(int i= 0;i<c.getProdutoId().size();i++){
                qtd += String.valueOf(c.getProdutoId().get(i))+", ";
                pr += String.valueOf(c.getQtdProduto().get(i))+", ";
            }  
            qtd += "]";
            pr += "]";
            String co[] = new String[5];
            co[0] = idCompra;
            co[1] = nome;
            co[2] = pr;
            co[3] = qtd;
            
            if(c.isStatus() == true){
                co[4] = "Confirmado";
            }else{
                co[4]  = "Pendente";
            } 
            
            getC.add(co);
            
            
    }
                
      
            
    }
          return getC;
    }
    
}
