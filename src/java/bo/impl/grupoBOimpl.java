/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.impl;

import bo.IgrupoBO;
import dto.grupo;

/**
 *
 * @author ACER SWIFT 3
 */
public class grupoBOimpl implements IgrupoBO{
    
    @Override
    public int InsertarGrupo ( int id,int id_grado,String nombre,String estatus){
          int tmp=0;
         return tmp;
        
    }
    
    
    @Override
    public grupo ConsultarGrupo ( int id,String nombre){
        return null;
        
    }
    
    @Override
    public int ModificarGrupo ( int id,int id_grado,String nombre,String estatus){
         int tmp=0;
         return tmp;
    }
    
    @Override
    public int BorrarGrupo (int id){
         int tmp=0;
         return tmp;
        
    }
}
