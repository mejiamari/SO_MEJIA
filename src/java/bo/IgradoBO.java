/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import dto.grado;

/**
 *
 * @author ACER SWIFT 3
 */
public interface IgradoBO {
    
      public int InsertarGrado ( int id,int id_carrera,
             String nombre,String estatus);
    
    
  public grado ConsultarGrado (String nombre,int id);
    
    
    public int ModificarGrado (int id,int id_carrera,
             String nombre,String estatus);
    
    public int BorrarGrado (int id);
    
    
}
