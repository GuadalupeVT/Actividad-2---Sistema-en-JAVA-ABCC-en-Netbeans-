package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.util.TimeUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

public class ConexionBD {
	private Connection conexion;
	private Statement stm;
	
	private PreparedStatement pstm; //Para el proyecto final, evitar SQL injection
	
	ResultSet rs=null;
	
	public ConexionBD() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			                        //127.0.0.1
			String url="jdbc:mysql://localhost/BD_Escuela?useTimezone=true&serverTimezone=UTC";
			
			conexion=DriverManager.getConnection(url,"root","itsj");
			
			System.out.println("Magia magia con BD, ya casi soy ISC =)  ");
		} catch (ClassNotFoundException e) {
			System.out.println("No se encontro el Controlador");
			System.out.println("Mejor me dedico a las redes ='(  ");
		}catch ( SQLException e) {
			e.printStackTrace();
			System.out.println("No se pudo conectar al servidor");
			System.out.println("Mejor me dedico a las redes ='(  ");
		}finally {
			//codigo se SIEMPRE SE EJECUTA
			//cierre de la conexion a la BD, no se recomienda
		}
	}//Constructor
	
	public void cerrarConexion(){
		try {
			stm.close();
			conexion.close();
			System.out.println("Conexion Finalizada");
		} catch (SQLException e) {
			System.out.println("No se pudo cerrar la conexion");
		}
	}//metodo cerrarConexion
	
	//metodos que ejecuten las operaciones ABCC (DDL, DML, SQL)
	//un metodo para DDL y DML
        
        //==============================Usuarios====================================
    
    public ResultSet ejecutarConsultaUsuarios(String sql,String usuario,String contraseña) {
		try {
                    pstm = conexion.prepareStatement(sql);
	            pstm.setString(1, usuario);
		    pstm.setString(2, contraseña);
		    rs = pstm.executeQuery();
                        
		} catch (SQLException e) {
			System.out.println("No se pudo ejecutar la consulta");
		}
		return rs;
	}
    
    
    public ResultSet ejecutarConsultaUsuarios(String sql,String usuario) {
		try {
                        pstm = conexion.prepareStatement(sql);
			pstm.setString(1, usuario);
			rs =pstm.executeQuery();
                        
		} catch (SQLException e) {
			System.out.println("No se pudo ejecutar la consulta");
		}
		return rs;
	}
    

    public boolean ejecutarInstruccionUsuario(String sql, Usuario usuario){
        try {
            conexion.setAutoCommit(false);
            pstm = conexion.prepareStatement(sql);
            pstm.setString(1,usuario.getUsuario());
	    pstm.setString(2,usuario.getContrasena());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            conexion.commit(); 
            conexion.setAutoCommit(true);
            return ejecucion==1?true:false;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            try {
                conexion.rollback();
                conexion.setAutoCommit(true);
            } catch (SQLException ex1) {
                Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
            return false;
        }

    }
    
    public boolean eliminarRegistroUsuario(String sql, String usuario) {
		try {
                    conexion.setAutoCommit(false);
		     pstm=conexion.prepareStatement(sql);
	             pstm.setString(1,usuario);
		     int ejecucion;
		     ejecucion=pstm.executeUpdate();
                     conexion.commit(); 
                     conexion.setAutoCommit(true);
		     return ejecucion==1?true:false;
		}
                
		catch(SQLException e){
                    try {
                        conexion.rollback();
                        conexion.setAutoCommit(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    return false;
                }
	}
    
        
	
	
	public boolean ejecutarInstruccion(String sql) {		
		//en el proyecto prepare
		try {
			stm=conexion.createStatement();
			int ejecucion;
			System.out.println(sql);
			ejecucion=stm.executeUpdate(sql);
			System.out.println(ejecucion);
			return ejecucion==1?true:false;
		} catch (SQLException e) {
			System.out.println("No se pudo ejecutar la instruccion SQL");
			return false;
		}
	}
	
	//otro metodo para SQL (CONSULTAS)
	public ResultSet ejecutarConsultaRegistros(String sql) {
		try {
			stm=conexion.createStatement();
			rs = stm.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("No se pudo ejecutar la consulta");
		}
		return rs;
	}
	
	public static void main(String[]args) {
		new ConexionBD();
	}
	

}//class conexionBD
