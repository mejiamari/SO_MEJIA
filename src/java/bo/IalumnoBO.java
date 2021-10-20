/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import dto.alumno;

/**
 *
 * @author HP
 */
public interface IalumnoBO {
    public alumno ConsultarAlumno(int id,
     String nombre, String apellido_paterno,
     String apellido_materno,String username);
    
       public int  InsertarAlumno(
     String nombre, String apellido_paterno,
     String apellido_materno,String username,String estatus);
       
       public int ModificarAlumno(
     String nombre, String apellido_paterno,
     String apellido_materno,String username,String estatus);
       
       public int BorrarAlumno( String username,int id);
}
