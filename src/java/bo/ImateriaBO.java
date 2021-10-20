/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import dto.materia;

/**
 *
 * @author ACER SWIFT 3
 */
public interface ImateriaBO {
    
    
    public int InsertarMateria ( int id, int id_grupo,
      String nombre,String estatus);
    
    
    public materia ConsultarMateria (int id,String nombre);
    
    
    public int ModificarMateria (int id, int id_grupo,
      String nombre,String estatus);
    
    public int BorrarMateria (int id);
    
    
}
