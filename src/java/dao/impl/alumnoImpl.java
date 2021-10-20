/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.Ialumno;
import dto.alumno;

/**
 *
 * @author HP
 */
public class alumnoImpl implements Ialumno {
       
    @Override
    public alumno ConsultarAlumno (String username,int id) {
        return null;
        
    }
    
     @Override
    public int InsertarAlumno (int id,int idMateria,String username,
     String nombre,String apellido_paterno,
     String apellido_materno,String estatus){
     int a=0;
     return a;
    }
   
    @Override
    public int ModificarAlumno (int id) {
     int a=0;
     return a;
    }
    
    
    @Override
    public int BorrarAlumno (int id){
     int a=0;
     return a;
        
    }
    
    
}
