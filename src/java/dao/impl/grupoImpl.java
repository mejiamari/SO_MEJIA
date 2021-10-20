/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.Igrupo;
import dto.grupo;

/**
 *
 * @author HP
 */
public class grupoImpl implements Igrupo{
     @Override
     public int InsertarGrupo ( int id,int id_grado,String nombre,String estatus){
           int tmp=0;
         return tmp;
        
    }
    
    
     @Override
    public grupo ConsultarGrupo (String nombre, int id){
        return null;
        
    }
    
    
     @Override
    public int ModificarGrupo (int id){
           int tmp=0;
         return tmp;
        
    }
    
     @Override
    public int BorrarGrupo (int id){
       int tmp=0;
         return tmp;
    }
}
