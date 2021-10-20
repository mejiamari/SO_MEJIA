/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.Iuniversidad;
import dto.universidad;

/**
 *
 * @author HP
 */
public class universidadImpl implements Iuniversidad {
       
    @Override
       public int InsertarUniversidad ( int id,
     String nombre,String estatus){
         int tmp=0;
         return tmp;
        
        
    }
    
    
       @Override
    public universidad ConsultarUniversidad (int id,
     String nombre){
        return null;
        
    }
    
    
       @Override
    public int ModificarUniversidad ( int id,
     String nombre,String estatus){
         int tmp=0;
         return tmp;
                
    }
    
       @Override
    public int BorrarUniversidad (int id){
          int tmp=0;
         return tmp;
        
    }
    
    
}
