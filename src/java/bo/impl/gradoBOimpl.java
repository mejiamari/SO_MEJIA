/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.impl;

import bo.IgradoBO;

/**
 *
 * @author ACER SWIFT 3
 */
public class gradoBOimpl implements IgradoBO{
    
     @Override
     public int InsertarGrado ( int id,int id_carrera,
             String nombre,String estatus){
         return 0;
         
     }
    
    
     @Override
    public int ConsultarGrado (int id,int id_carrera,
             String nombre,String estatus){
         return 0;
        
    }
    
    
     @Override
    public int ModificarGrado (int id,int id_carrera,
             String nombre,String estatus){
         return 0;
        
    }
    
     @Override
    public int BorrarGrado (int id){
         return 0;
        
    }
}
