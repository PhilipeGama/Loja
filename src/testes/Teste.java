/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;
import model.ItemCompra;
import java.util.ArrayList;
/**
 *
 * @author Philipe
 */
public class Teste {
    public static void main(String[] args) {
        ItemCompra ic = new ItemCompra();
        ic.setCliente(1);
        ic.setId(1);
        ArrayList <Integer> a = new ArrayList();
        a.add(5);
        a.add(72);
        a.add(6);
        ArrayList <Integer> b = new ArrayList();
        b.add(5);
        b.add(5);
        b.add(5);
        ic.setProdutoId(a);
        ic.setQtdProduto(b);
        //ic.Persistir(0);
         ItemCompra oc = new ItemCompra();
        oc.setCliente(1);
        oc.setId(2);
        //ArrayList <Integer> a = new ArrayList();
        a.add(5);
        a.add(72);
        a.add(6);
        //ArrayList <Integer> b = new ArrayList();
        b.add(5);
        b.add(5);
        b.add(5);
        oc.setProdutoId(a);
        oc.setQtdProduto(b);
        //oc.Persistir(1);
        //oc.Persistir(2);
        
        
        ArrayList<ItemCompra> q = ItemCompra.getCompras();
        
        for(int j =0;j<q.size();j++){
            System.out.println(q.get(j).getId());
        }
        //System.out.println(q.toString());
        //System.out.println("a"+q.get(0).getCliente());
    }
 
}
