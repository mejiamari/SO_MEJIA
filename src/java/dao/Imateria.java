/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.materia;

/**
 *
 * @author HP
 */
public interface Imateria {
    
    public int InsertarMateria ( int id, int id_grupo,
      String nombre,String estatus);
    
    
    public materia ConsultarMateria (String nombre,int id);
    
    
    public int ModificarMateria (int id, int id_grupo,
      String nombre,String estatus);
    
    public int BorrarMateria (int id);
    
    
}
