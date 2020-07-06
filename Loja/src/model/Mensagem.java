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
public class Mensagem {
    private int id;
    private String texto;
    private boolean status;
    private static int ultimo;
    
    private static final String caminho = "arquivos/mensagens.txt";

    //DateTimeFormatter dma = DateTimeFormatter.ofPattern("dd/MM/aaaa");
    
    public Mensagem(){
        
    }
    
    public Mensagem(int id,String texto,boolean status) {
       
        this.id = id;
        this.texto = texto;
        this.status = status;
    }
    
    public Mensagem(JSONObject json) {
        this.id = json.getInt("id");
        this.texto = json.getString("texto");
        this.status = json.getBoolean("status");
    }
     
    public JSONObject toJson(){
       JSONObject json = new JSONObject();
       json.put("id",this.id);  
       json.put("texto",this.texto);
       json.put("status",this.status);
       return json;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static int getUltimo() {
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
       ArrayList <Mensagem> A = Mensagem.getMensagem();
       for(int i = 0;i<A.size();i++){
           if(A.get(i).getMensagem().equals(nome)){
               return i;
           }
       }
       return -1;
    } 
    
    
        
    public static ArrayList<Mensagem> getMensagem(){
        ArrayList<Mensagem> listaMensagem = new ArrayList(); 
        String base = Arquivo.Read(caminho);
        if(base.isEmpty() || base.length()<5)
            return null;
        JSONArray jA = new JSONArray(base);
        for(int i=0;i < jA.length();i++){
          Mensagem A = new Mensagem(jA.getJSONObject(i));
          listaMensagem.add(A);
          ultimo = jA.getJSONObject(i).getInt("id");
        }
        return listaMensagem;
    }
}
