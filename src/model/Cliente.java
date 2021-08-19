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
public class Cliente {
    private int id;
    private String nome;
    private double carteira ;
    private String senha;
    private String email;
    
    
    private static final String caminho = "src/arquivos/clientes.txt";
    private static int ultimo ;
    
    public Cliente(){
        
    }

    public static int getUltimo() {
        return ultimo;
    }
    
    public Cliente(int id, String nome, double carteira, String senha, String email) {
        this.id = id;
        this.nome = nome;
        this.carteira = carteira;
        this.senha = senha;
        this.email = email;
    }
    
   public Cliente(JSONObject json) {
        this.id = json.getInt("id");
        this.nome = json.getString("nome");
        this.carteira = json.getDouble("carteira");
        this.senha = json.getString("senha");
        this.email = json.getString("email");
    }
     
    public JSONObject toJson(){
       JSONObject json = new JSONObject();
       json.put("id",this.id);  
       json.put("nome",this.nome);
       json.put("carteira",this.carteira);
       json.put("senha",this.senha);
       json.put("email",this.email);
       return json;
    }
    

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCarteira() {
        return carteira;
    }

    public void setCarteira(double carteira) {
        this.carteira = carteira;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
       ArrayList <Cliente> A = Cliente.getClientes();
       for(int i = 0;i<A.size();i++){
           if(A.get(i).getNome().equals(nome)){
               return i;
           }
       }
       return -1;
    } 
    
    
        
    public static ArrayList<Cliente> getClientes(){
        ArrayList<Cliente> listaCliente = new ArrayList(); 
        String base = Arquivo.Read(caminho);
        if(base.isEmpty() || base.length()<5)
            return null;
        JSONArray jA = new JSONArray(base);
        for(int i=0;i < jA.length();i++){
          Cliente A = new Cliente(jA.getJSONObject(i));
          listaCliente.add(A);
          ultimo = jA.getJSONObject(i).getInt("id");
        }
        return listaCliente;
    }
    
    
   
}
