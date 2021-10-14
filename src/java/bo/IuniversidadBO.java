/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

/**
 *
 * @author ACER SWIFT 3
 */
public interface IuniversidadBO {
    
   public int InsertarUniversidad ( int id,
     String nombre,String estatus);
    
    
    public int ConsultarUniversidad (int id,
     String nombre,String estatus);
    
    
    public int ModificarUniversidad (int id,
     String nombre,String estatus);
    
    public int BorrarUniversidad (int id);  
    
}
