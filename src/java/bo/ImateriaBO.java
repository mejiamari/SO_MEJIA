/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

/**
 *
 * @author ACER SWIFT 3
 */
public interface ImateriaBO {
    
    
    public int InsertarMateria ( int id, int id_grupo,
      String nombre,String estatus);
    
    
    public int ConsultarMateria (int id, int id_grupo,
      String nombre,String estatus);
    
    
    public int ModificarMateria (int id, int id_grupo,
      String nombre,String estatus);
    
    public int BorrarMateria (int id);
    
    
}
