/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.impl;

import bo.IcarreraBO;
import dao.Ialumno;
import dao.Icarrera;
import dto.alumno;
import dto.carrera;


/**
 *
 * @author ACER SWIFT 3
 */
public class carreraBOimpl implements  IcarreraBO{
    
@Override
public int InsertarCarrera(int id,int id_universidad,
          String nombre,String estatus){
     int tmp=0;
     return tmp;
    
}
  
            
  
@Override
    public carrera ConsultarCarrera (int id,
          String nombre){
   Icarrera cDAO =null;
     carrera Carrera = null;
     
     if (nombre !=null){
         Carrera =cDAO.ConsultarCarrera(id,nombre);
     }else {
         System.out.println("Hay un parametro nulo, favor de validar1");
     }
     return Carrera;     
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
