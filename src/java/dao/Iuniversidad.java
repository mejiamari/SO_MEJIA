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
public interface Iuniversidad {
   public int InsertarUniversidad ( int id,
     String nombre,String estatus);
    
    
    public int ConsultarUniversidad (int id);
    
    
    public int ModificarUniversidad (int id);
    
    public int BorrarUniversidad (int id);  
    
    
}
