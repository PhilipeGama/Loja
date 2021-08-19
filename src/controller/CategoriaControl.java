/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Administrador;
import model.Categoria;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class CategoriaControl {
    
    public static int salvarCategoria(int row,String id,String tipo){
        if(tipo.equals(""))
        {
            return 1;
        }
        Categoria c1 = new Categoria();
        ///if(id.equals("") || nome.equals(""))
        c1.setId(Integer.parseInt(id));
        c1.setTipo(tipo);
        c1.Persistir(row);
        return 0;
    }
    public static ArrayList<String[]> getsCategorias (){
        ArrayList<String[]> arrayCat = new ArrayList();
        ArrayList<Categoria> aCa = Categoria.getCategs();
        if(aCa!=null){
        for(int i =0;i < aCa.size();i++){
            String ac[] = new String[2];
            ac[0] = Integer.toString(aCa.get(i).getId());
            ac[1] = aCa.get(i).getTipo();
            arrayCat.add(ac);
        }
        }
        return arrayCat;
        
    } 
    public static boolean excluirCategoria(int row){
       return Categoria.excluir(row);
  
   }
//    
    public static int buscarCategoriaTipo(String tipo){
      return Categoria.buscarTipo(tipo);
    }
    public static int novoId(){
//        ArrayList a = Administrador.getAdmins();
//       int i = a.size();
        return Categoria.getUltimo();
        
//        
    } 
}