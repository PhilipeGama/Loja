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
 * @author Philipe
 */
public class Produto {
    private int id;
    private String nome;
    private double preco;
    private String tipo;
    private static int ultimo;

    private static final String caminho = "arquivos/produtos.txt";
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    private int qtdEstoque;


    
    public Produto()
    {
        
    }
    
    public Produto(int id, String nome, double preco, int qtdEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public Produto(JSONObject json) {
        this.id = json.getInt("id");
        this.nome = json.getString("nome");
        this.preco = json.getDouble("preco");
        this.tipo = json.getString("tipo");
        this.qtdEstoque = json.getInt("qtdEstoque");
    }
    
    public JSONObject toJson(){
       JSONObject json = new JSONObject();
       json.put("id",this.id);  
       json.put("nome",this.nome);
       json.put("preco",this.preco);
       json.put("tipo",this.tipo);
       json.put("qtdEstoque",this.qtdEstoque);
       return json;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }
    public static int getUltimo() {
            return ultimo;
        }
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public boolean Persistir(int row){
        JSONObject json = this.toJson();
        
        String base = Arquivo.Read(caminho);
        JSONArray jA = new JSONArray();
        if(!base.isEmpty() && base.length()>5)
        jA = new JSONArray(base);
        if(row >= 0){
        jA.put(row,json);
        }else{
          jA.put(json); 
        }
        
        Arquivo.Write(caminho,jA.toString());
       
        return true;
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
    
    public static int buscarNome(String nome){
       ArrayList <Produto> A = Produto.getProdutos();
       for(int i = 0;i<A.size();i++){
           if(A.get(i).getNome().equals(nome)){
               return i;
           }
       }
       return -1;
    } 
    
    public static ArrayList<Produto> getProdutos(){
        ArrayList<Produto> listaProds = new ArrayList(); 
        String base = Arquivo.Read(caminho);
        if(base.isEmpty() || base.length()<5)
            return null;
        JSONArray jA = new JSONArray(base);
        for(int i=0;i < jA.length();i++){
          Produto A = new Produto(jA.getJSONObject(i));
          listaProds.add(A);
          ultimo = jA.getJSONObject(i).getInt("id");
        }
        return listaProds;
    }
    
    
    
   


    
}
    

    
