/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import dto.carrera;

/**
 *
 * @author ACER SWIFT 3
 */
public interface IcarreraBO {
     
    public int InsertarCarrera(int id,int id_universidad,
          String nombre,String estatus);
  
            
  
    public carrera ConsultarCarrera (int id,
          String nombre);
    
    
    public int ModificarCarrera (int id,int id_universidad,
          String nombre,String estatus);
    
    
    public int BorrarCarrera (int id) ;
            

}