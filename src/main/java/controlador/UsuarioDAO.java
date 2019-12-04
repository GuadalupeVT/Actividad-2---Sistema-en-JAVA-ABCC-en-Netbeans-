/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexionBD.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;

/**
 *
 * @author guvad
 */
public class UsuarioDAO {
     ConexionBD con=new ConexionBD();
     
    public Usuario buscarUsuario(String user,String contraseña){
       Usuario usuario=new Usuario();
        String sql = "SELECT * FROM usuario WHERE usuario=? AND contraseña=?";
	ResultSet rs=con.ejecutarConsultaUsuarios(sql,user,contraseña);
	try {
            rs.last();
	    usuario.setUsuario(rs.getString(1));
	    usuario.setContrasena(rs.getString(2));
            
        } catch (SQLException e) {
            System.out.println("No se encontro el registro");
            System.out.println(sql);
            return null;
	}
        return usuario;
   }
    
     public Usuario buscarUsuarioAlta(String user){
        Usuario usuario=new Usuario();
        String sql = "SELECT * FROM usuario WHERE usuario=?";
	ResultSet rs=con.ejecutarConsultaUsuarios(sql,user);
	try {
            rs.last();
	    usuario.setUsuario(rs.getString(1));
	    //usuario.setContrasena(rs.getString(2));
            
        } catch (SQLException e) {
            System.out.println("No se encontro el registro");
            System.out.println(sql);
            return null;
	}
        return usuario;
   }
    
    public boolean alta(Usuario a){
        String sql="INSERT INTO usuario VALUES (?,?)";
        boolean x= con.ejecutarInstruccionUsuario(sql,a);
        return x;
    }
    
    public boolean eliminarUsuario(String id) {
	String sql ="DELETE FROM usuario WHERE usuario=?";
	boolean x=con.eliminarRegistroUsuario(sql, id);
        return x;
	}
    
    
    
    public static void main(String[]args) {
       //UsuarioDAO user=new UsuarioDAO();
       //Usuario usuario1 = user.buscarUsuarioAlta("admin");
       //Usuario usuario=new Usuario("admin","admin");
       //user.eliminarUsuario("usuario1");
    }
}
