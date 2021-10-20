/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.universidad;

/**
 *
 * @author HP
 */
public interface Iuniversidad {
   public int InsertarUniversidad ( int id,
     String nombre,String estatus);
    
    
    public universidad ConsultarUniversidad (int id,
     String nombre);
    
    
    public int ModificarUniversidad ( int id,
     String nombre,String estatus);
    
    public int BorrarUniversidad (int id);  
    
    
}
