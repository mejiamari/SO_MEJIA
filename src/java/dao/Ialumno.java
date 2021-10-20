
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.alumno;

/**
 *
 * @author HP
 */
public interface Ialumno {
     public alumno ConsultarAlumno (String username,int id);

    public int InsertarAlumno (int id,int idMateria,String username,
     String nombre,String apellido_paterno,
     String apellido_materno,String estatus);
    
    public int ModificarAlumno (int id);
    
    public int BorrarAlumno (int id);
    
    
    
    
}
