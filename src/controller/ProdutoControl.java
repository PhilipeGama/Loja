/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Categoria;
import model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class ProdutoControl {
    public static int salvarProduto(int row,String id,String nome,String preco,String tipo, String qtdEstoque){
        if(nome.equals("") || preco.equals("") || tipo.equals("") || qtdEstoque.equals("")){
//       
            return 1;
        }
        Produto a1 = new Produto();
        ///if(id.equals("") || nome.equals(""))
        a1.setId(Integer.parseInt(id));
        
        try {
           a1.setPreco(Double.parseDouble(preco)); 
           a1.setQtdEstoque(Integer.parseInt(qtdEstoque));
        } catch (NumberFormatException e) {
            return 2;
        }
        a1.setTipo(tipo);
        a1.setNome(nome);
        a1.setQtdEstoque(Integer.parseInt(qtdEstoque));
       a1.Persistir(row);
       return 0;
    }
    
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
    
    public static boolean excluirProduto(int row){
        return Produto.excluir(row);
       
    }
    
    public static int buscarProdutoNome(String nome){
      return Produto.buscarNome(nome);
    }
    
    public static ArrayList<String> getTipos(){
        ArrayList<Categoria> c = Categoria.getCategs();
        ArrayList <String> L = new ArrayList();
        if(c != null){
        for(Categoria c1:c){
            L.add(c1.getTipo());
        }
        }
        
        return L;
        
    }
    public static int novoId(){
//        ArrayList a = Administrador.getAdmins();
//       int i = a.size();
        return Produto.getUltimo();
        
//        
    } 
}
