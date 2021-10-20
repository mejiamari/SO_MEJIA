/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.impl;

import bo.IalumnoBO;
import dao.Ialumno;
import dto.alumno;

/**
 *
 * @author HP
 */
public class alumnoBOimpl implements IalumnoBO{
    
     @Override
     public alumno ConsultarAlumno( int id,
     String nombre, String apellido_paterno,
     String apellido_materno,String username){
     Ialumno aDAO =null;
     alumno Alumno = null;
     
     if (username !=null){
         Alumno =aDAO.ConsultarAlumno(username, id);
     }else {
         System.out.println("Hay un parametro nulo, favor de validar");
     }
     return Alumno;
     }
    
     
     @Override
       public int  InsertarAlumno(
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
