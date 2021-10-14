/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.impl;

import bo.IcarreraBO;


/**
 *
 * @author ACER SWIFT 3
 */
public class carreraBOimpl implements  IcarreraBO{
    
@Override
public int GenerarCarrera(int id,int id_universidad,
          String nombre,String estatus){
     int tmp=0;
     return tmp;
    
}
  
            
  
@Override
    public int ConsultarCarrera (int id,int id_universidad,
          String nombre,String estatus){
    return 0;
        
    }
@Override
    public int ModificarCarrera (int id,int id_universidad,
          String nombre,String estatus){
    return 0;
        
    }
    
    
@Override
    public int BorrarCarrera (int id){
    return 0;
        
    }
                
}
