/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.Icarrera;
import dto.carrera;

/**
 *
 * @author HP
 */
public class carreraImpl implements Icarrera{
    
    @Override
    public int InsertarCarrera(int id,int id_universidad,
            String nombre,String estatus) {
        int tmp=0;
         return tmp;
        
    }
            
    @Override
    public carrera ConsultarCarrera (int id,
            String nombre) {
            return null;
    }
    
    
    @Override
    public int ModificarCarrera (int id) {
       int tmp=0;
         return tmp;
        
    }
    
    @Override
    public int BorrarCarrera (int id) {
       int tmp=0;
         return tmp;
    }
}
