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

public class Administrador{
    private int id;
    private String nome;
    private String senha;
    private static int ultimo;
    private static final String caminho = "arquivos/administradores.txt";

    //DateTimeFormatter dma = DateTimeFormatter.ofPattern("dd/MM/aaaa");
    
    public Administrador(){
        
    }
    
    public Administrador(int id,String nome,String senha) {
       
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }
    
    public Administrador(JSONObject json) {
        this.id = json.getInt("id");
        this.nome = json.getString("nome");
        this.senha = json.getString("senha");
    }
     
    public JSONObject toJson(){
       JSONObject json = new JSONObject();
       json.put("id",this.id);  
       json.put("nome",this.nome);
       json.put("senha",this.senha);
      
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public static int getUltimo(){
        return ultimo;
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
       ArrayList <Administrador> A = Administrador.getAdmins();
       for(int i = 0;i<A.size();i++){
           if(A.get(i).getNome().equals(nome)){
               return i;
           }
       }
       return -1;
    } 
    
    
        
    public static ArrayList<Administrador> getAdmins(){
        ArrayList<Administrador> listaAdmins = new ArrayList(); 
        String base = Arquivo.Read(caminho);
        if(base.isEmpty() || base.length()<5)
            return null;
        JSONArray jA = new JSONArray(base);
        for(int i=0;i < jA.length();i++){
          Administrador A = new Administrador(jA.getJSONObject(i));
          listaAdmins.add(A);
          ultimo = jA.getJSONObject(i).getInt("id");
        }
        return listaAdmins;
    }
    
    
    
    
   
   
    
    
        
}

