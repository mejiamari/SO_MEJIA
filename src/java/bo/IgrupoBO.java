/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import dto.grupo;

/**
 *
 * @author ACER SWIFT 3
 */
public interface IgrupoBO {
    public int InsertarGrupo ( int id,int id_grado,String nombre,String estatus);
    
    
     public grupo ConsultarGrupo ( int id,String nombre);
    
    
    public int ModificarGrupo ( int id,int id_grado,String nombre,String estatus);
    
    public int BorrarGrupo (int id);
}
