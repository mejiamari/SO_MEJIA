/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author HP
 */
public interface Ialumno {
    
    public int InsertarAlumno (int id,int idMateria,String username,
     String nombre,String apellido_paterno,
     String apellido_materno,String estatus);
    
    
    public int ConsultarAlumno (int id);
    
    
    public int ModificarAlumno (int id);
    
    public int BorrarAlumno (int id);
    
    
    
    
}
