/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.Igrado;
import dto.grado;

/**
 *
 * @author HP
 */
public class gradoImpl implements Igrado {

    @Override
    public int InsertarGrado ( int id,int id_carrera,
             String nombre,String estatus){
         int tmp=0;
         return tmp;
    }
            
    @Override
     public grado ConsultarGrado (String nombre,int id){
     return null;
    }
    
    
    @Override
    public int ModificarGrado (int id){
     int tmp=0;
     return tmp;
    }
    
    @Override
    public int BorrarGrado (int id){
   int tmp=0;
   return tmp;
    }
    
}
