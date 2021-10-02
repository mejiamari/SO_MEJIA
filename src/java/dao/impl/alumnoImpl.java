/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.Ialumno;

/**
 *
 * @author HP
 */
public class alumnoImpl implements Ialumno {
    
    @Override
    public int InsertarAlumno (int id,int idMateria,String username,
     String nombre,String apellido_paterno,
     String apellido_materno,String estatus){
     return 0;
    }
   
    
    
    
    @Override
    public int ConsultarAlumno (int id) {
        return 0;
        
    }
            
    
    @Override
    public int ModificarAlumno (int id) {
        return 0;
        
    }
    
    
    @Override
    public int BorrarAlumno (int id){
        return 0;
        
    }
    
    
}
