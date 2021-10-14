/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.impl;

import bo.ImateriaBO;

/**
 *
 * @author ACER SWIFT 3
 */
public class materiaBOimpl implements ImateriaBO{
    
    @Override
    public int InsertarMateria ( int id, int id_grupo,
      String nombre,String estatus){
        return 0;
        
    }
    
    
    @Override
    public int ConsultarMateria (int id, int id_grupo,
      String nombre,String estatus){
        return 0;
        
    }
    
    
    @Override
    public int ModificarMateria (int id, int id_grupo,
      String nombre,String estatus){
        return 0;
        
    }
    
    @Override
    public int BorrarMateria (int id){
        return 0;
        
    }
}
