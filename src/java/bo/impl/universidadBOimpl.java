/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.impl;

import bo.IuniversidadBO;
import dao.Imateria;
import dao.Iuniversidad;
import dto.materia;
import dto.universidad;

/**
 *
 * @author ACER SWIFT 3
 */
public class universidadBOimpl implements IuniversidadBO{
    
     @Override
     public int InsertarUniversidad ( int id,
     String nombre,String estatus){
         int tmp=0;
         return tmp;
        
         
     }
    
    
     @Override
    public universidad ConsultarUniversidad (int id,
     String nombre){
     Iuniversidad uDAO =null;
     universidad Universidad = null;
     
     if (nombre !=null){
         Universidad =uDAO.ConsultarUniversidad(id, nombre);
     }else {
         System.out.println("Hay un parametro nulo, favor de validar");
     }
     return Universidad;
        
    }
    
    
     @Override
    public int ModificarUniversidad (int id,
     String nombre){
         int tmp=0;
         return tmp;
        
    }
    
     @Override
    public int BorrarUniversidad (int id){
          int tmp=0;
         return tmp;
        
    }
}
