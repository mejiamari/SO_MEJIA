/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author HP
 */
public interface Igrupo {
    public int InsertarGrupo ( int id,int id_grado,String nombre,String estatus);
    
    
    public int ConsultarGrupo (int id);
    
    
    public int ModificarGrupo (int id);
    
    public int BorrarGrupo (int id);
    
}
