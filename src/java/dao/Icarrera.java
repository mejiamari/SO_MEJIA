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
public interface Icarrera {
    
    public int InsertarCarrera(int id,int id_universidad,
            String nombre,String estatus);
    
     public int ConsultarCarrera (int id);
    
    
    public int ModificarCarrera (int id);
    
    public int BorrarCarrera (int id);
   
}
