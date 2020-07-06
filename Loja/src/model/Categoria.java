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
public class Categoria {
    private int id;
    private String tipo;
    private static int ultimo;
    
    private static final String caminho = "arquivos/categorias.txt";
    
    public Categoria(){
        
    }
    
    public Categoria(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }
    
    public Categoria(JSONObject json) {
        this.id = json.getInt("id");
        this.tipo = json.getString("tipo");
    }
     
    public JSONObject toJson(){
       JSONObject json = new JSONObject();
       json.put("id",this.id);  
       json.put("tipo",this.tipo);
       return json;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    
    public static int buscarTipo(String tipo){
       ArrayList <Categoria> C = Categoria.getCategs();
       for(int i = 0;i<C.size();i++){
           if(C.get(i).getTipo().equals(tipo)){
               return i;
           }
       }
       return -1;
    } 
    
       public static ArrayList<Categoria> getCategs(){
        ArrayList<Categoria> listaCategs = new ArrayList(); 
        String base = Arquivo.Read(caminho);
        if(base.isEmpty() || base.length()<5)
            return null;
        JSONArray jA = new JSONArray(base);
        for(int i=0;i < jA.length();i++){
          Categoria  c = new Categoria(jA.getJSONObject(i));
          listaCategs.add(c);
          ultimo = jA.getJSONObject(i).getInt("id");
        }
        return listaCategs;
    }
    
    
}
