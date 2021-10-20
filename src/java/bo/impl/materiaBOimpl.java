/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.impl;

import bo.ImateriaBO;
import dao.Igrado;
import dao.Imateria;
import dto.grado;
import dto.materia;

/**
 *
 * @author ACER SWIFT 3
 */
public class materiaBOimpl implements ImateriaBO{
    
    @Override
    public int InsertarMateria ( int id, int id_grupo,
      String nombre,String estatus){
         int tmp=0;
         return tmp;
    }
    
    
    @Override
    public materia ConsultarMateria (int id,String nombre){
     Imateria mDAO =null;
     materia Materia = null;
     
     if (nombre !=null){
         Materia =mDAO.ConsultarMateria(nombre, id);
     }else {
         System.out.println("Hay un parametro nulo, favor de validar");
     }
     return Materia;
        
    }
    
    @Override
    public int ModificarMateria (int id, int id_grupo,
      String nombre,String estatus){
         int tmp=0;
         return tmp;
        
    }
    
    @Override
    public int BorrarMateria (int id){
         int tmp=0;
         return tmp;
    }
}
