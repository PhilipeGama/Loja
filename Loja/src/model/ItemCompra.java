/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import util.Arquivo;
import java.util.ArrayList;
import json.JSONArray;
import json.JSONObject;

/**
 *
 * @author Aluno
 */
public class ItemCompra {
    private int id;
    private int cliente;
   
    private boolean status = false;
//    private ArrayList<Integer> produtoID;
    private ArrayList<Integer> qtdProduto;
    private ArrayList<Integer> produtoId;
    private static String caminho = "src/arquivos/compras.txt";
    
    public ItemCompra(){
        
    }
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Integer> getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(ArrayList<Integer> produtoId) {
        this.produtoId = produtoId;
    }

    public ArrayList<Integer> getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(ArrayList<Integer> qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

    public JSONObject toJson(){
       JSONObject json = new JSONObject();
       json.put("idCompra",this.id);  
       json.put("idCliente",this.cliente);
       json.put("Produto",this.produtoId);
       json.put("Quantidade",this.qtdProduto);
       json.put("Status",this.status);
       
       return json;
    }
    
    public ItemCompra(JSONObject json){
        this.id = json.getInt("idCompra");
        this.cliente = json.getInt("idCliente");
//        JSONArray tempProduto = new JSONArray();
//        JSONArray tempQtd = new JSONArray();
//        tempProduto = json.getJSONArray("Produto");
//        tempQtd = json.getJSONArray("Quantidade");
        JSONArray tempProduto = json.getJSONArray("Produto");
        JSONArray tempQtd = json.getJSONArray("Quantidade");
        this.status = json.getBoolean("Status");
//        JSONArray tempProduto = new JSONArray("Produto");
//        JSONArray tempQtd = new JSONArray("Quantidade");
////        
//      
    this.produtoId = new ArrayList();
    this.qtdProduto = new ArrayList();
        for(int i=0;i<tempProduto.length();i++){
//            int n1 =Integer.parseInt(tempProduto.get(i).toString());
//            int n2 = Integer.parseInt(tempQtd.get(i).toString()); 
//            System.out.println(n1);
//            System.out.println(n2);
//            //ArrayList<>
            
           this.produtoId.add(Integer.parseInt(tempProduto.get(i).toString()));
           this.qtdProduto.add(Integer.parseInt(tempQtd.get(i).toString()));
//            this.produtoId.add(n1);
//            this.qtdProduto.add(n2);
        }   
        
    }
    
      
        public boolean Persistir(int row){
        JSONObject json = this.toJson();
        
        String base = Arquivo.Read(caminho);
        JSONArray jA = new JSONArray();
        if(!base.isEmpty() && base.length()>5)
        jA = new JSONArray(base);
        if(row >= 0){;
        jA.put(row,json);
        }else{
        jA.put(json); 
        }
        
        Arquivo.Write(caminho,jA.toString());
       
        return true;
    }
        public static ArrayList<ItemCompra> getCompras(){
        ArrayList<ItemCompra> listaCompra = new ArrayList(); 
        String base = Arquivo.Read(caminho);
        if(base.isEmpty() || base.length()<5)
            return null;
        JSONArray jA = new JSONArray(base);
           
        for(int i=0;i < jA.length();i++){
          ItemCompra ic = new ItemCompra(jA.getJSONObject(i));
          listaCompra.add(ic);
          //ultimo = jA.getJSONObject(i).getInt("id");
        }
           return listaCompra;
           
        } 
        
        public static boolean excluir(int row){
        //JSONObject json = this.toJson();
        String base = Arquivo.Read(caminho);
        JSONArray jA = new JSONArray();
        if(!base.isEmpty() && base.length()>5)
            jA = new JSONArray(base);
        jA.remove(row);
        Arquivo.Write(caminho, jA.toString());
        
        return true;
        
        }
    
//        
//    public boolean mudarStatus(int row,boolean status){
//      
//        String base = Arquivo.Read(caminho);
//        JSONArray jA = new JSONArray(base);
//        JSONObject json = JSONArray;
//        //this.status = status;
//        jA.put(row,json);
//        return true;
//    } 
//    
} 
    
    
    
    
