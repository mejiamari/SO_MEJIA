/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.Imateria;
import dto.materia;

/**
 *
 * @author HP
 */
public class materiaImpl implements Imateria{
    @Override
    public int InsertarMateria ( int id, int id_grupo,
      String nombre,String estatus){
         int tmp=0;
         return tmp;
        
    }
    
    
    @Override
    public materia ConsultarMateria (String nombre,int id){
        return null;
        
    }
    
    
    @Override
    public int ModificarMateria (int id, int id_grupo,
      String nombre,String estatus){
         int tmp=0;
         return tmp;
        
    }
    
    @Override
    public int BorrarMateria (int id){
         int tmp=0;
         return tmp;
    }
    
    
}
