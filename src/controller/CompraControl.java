/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Produto;
import model.ItemCompra;
import java.util.ArrayList;

/**
 *
 * @author Philipe
 */
public class CompraControl {
    
      public static ArrayList<String[]> getProdutos(){
        ArrayList<String[]> Prods = new ArrayList();
        ArrayList<Produto> a1 = Produto.getProdutos();
        if(a1!=null){
        for(int i = 0;i<a1.size();i++){
            String a[] = new String[5];
            a[0] = Integer.toString(a1.get(i).getId());
            a[1] = a1.get(i).getNome();
            a[2] = Double.toString(a1.get(i).getPreco());
            a[3] = a1.get(i).getTipo();
            a[4] = Integer.toString(a1.get(i).getQtdEstoque());
            Prods.add(a);
        }
        }    
        return Prods;
        
    }
//    public void calcularValor(int index,int qtd){
//          ArrayList<Produto> a1 = Produto.getProdutos();
//          double divida = a1.get(index).getPreco()*qtd; 
//    }  
     public static boolean salvarCompra(int row,String id,int idCliente,ArrayList<Integer>produto,ArrayList<String>qtd){
         ItemCompra c1 = new ItemCompra();
         c1.setId(Integer.parseInt(id));
         c1.setCliente(idCliente);
         ArrayList<Integer> a = new ArrayList();
         ArrayList<Integer> b = new ArrayList();
         for(int i = 0;i < qtd.size();i++){
             //a.add(produto.get(i));
             b.add(Integer.parseInt(qtd.get(i)));
         }
         c1.setProdutoId(produto);
         c1.setQtdProduto(b);
         c1.Persistir(row);
         return true;
     } 
      
    
    public static void  compra(int indexCliente,String produto,String qtd){
        
    }
      
      
}
