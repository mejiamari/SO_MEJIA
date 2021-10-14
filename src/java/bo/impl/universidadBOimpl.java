/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.impl;

import bo.IuniversidadBO;

/**
 *
 * @author ACER SWIFT 3
 */
public class universidadBOimpl implements IuniversidadBO{
    
     @Override
     public int InsertarUniversidad ( int id,
     String nombre,String estatus){
         return 0;
         
     }
    
    
     @Override
    public int ConsultarUniversidad (int id,
     String nombre,String estatus){
         return 0;
        
    }
    
    
     @Override
    public int ModificarUniversidad (int id,
     String nombre,String estatus){
         return 0;
        
    }
    
     @Override
    public int BorrarUniversidad (int id){
         return 0;
        
    }
}
