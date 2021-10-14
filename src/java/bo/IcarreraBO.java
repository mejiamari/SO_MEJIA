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
public interface IcarreraBO {
     
    public int GenerarCarrera(int id,int id_universidad,
          String nombre,String estatus);
  
            
  
    public int ConsultarCarrera (int id,int id_universidad,
          String nombre,String estatus);
    
    
    public int ModificarCarrera (int id,int id_universidad,
          String nombre,String estatus);
    
    
    public int BorrarCarrera (int id) ;
            

}