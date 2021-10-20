/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.impl;

import bo.IgradoBO;
import dao.Ialumno;
import dao.Igrado;
import dto.alumno;
import dto.grado;

/**
 *
 * @author ACER SWIFT 3
 */
public class gradoBOimpl implements IgradoBO{
    
     @Override
     public int InsertarGrado ( int id,int id_carrera,
             String nombre,String estatus){
            int tmp=0;
         return tmp;
         
     }
    
    
     @Override
   public grado ConsultarGrado (String nombre,int id){
        Igrado gDAO =null;
     grado Grado = null;
     
     if (nombre !=null){
         Grado =gDAO.ConsultarGrado(nombre, id);
     }else {
         System.out.println("Hay un parametro nulo, favor de validar");
     }
     return Grado;
        
    }
    
    
     @Override
    public int ModificarGrado (int id,int id_carrera,
             String nombre,String estatus){
         int tmp=0;
         return tmp;
        
    }
    
     @Override
    public int BorrarGrado (int id){
         int tmp=0;
         return tmp;
        
    }
}
