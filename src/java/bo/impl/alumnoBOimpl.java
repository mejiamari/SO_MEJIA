/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.impl;

import bo.IalumnoBO;
import dto.alumno;

/**
 *
 * @author HP
 */
public class alumnoBOimpl implements IalumnoBO{
    
     @Override
     public alumno ConsultarAlumno(
     String nombre, String apellido_paterno,
     String apellido_materno){
        return null;  
     }
    
     @Override
       public int  GenerarAlumno(
     String nombre, String apellido_paterno,
     String apellido_materno,String username,String estatus){
           int tmp=0;
         return tmp;
         
     }
    
       
     @Override
       public int ModificarAlumno(
     String nombre, String apellido_paterno,
     String apellido_materno,String username,String estatus){
         return 0;
           
       }
       
     @Override
       public int BorrarAlumno( String username,int id){
         return 0;
           
       }

    
}
