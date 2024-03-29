package controlador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexionBD.ConexionBD;
import modelo.Alumno;

public class AlumnoDAO {
	
	//metodos que permiten realizar las Altas, Bajas, Cambios y Consultas
	
	public boolean agregarAlumno(Alumno a) {
		String sql="INSERT INTO Alumnos VALUES('"+a.getNumControl()
		+"', '"+a.getNombre()
		+"', '"+a.getPrimerAp()
		+"', '"+a.getSegundoAp()
                +"', '"+a.getEdad()
		+"', "+a.getSemetre()
		+", '"+a.getCarrera()+"')";
		ConexionBD conexion=new ConexionBD();
		boolean x= conexion.ejecutarInstruccion(sql);
		conexion.cerrarConexion();
		return x;
	}
	
	public boolean eliminarAlumnos(String nc) {
		String sql ="DELETE FROM Alumnos WHERE NumControl='"+nc+"'";
		ConexionBD conexion=new ConexionBD();
		boolean x= conexion.ejecutarInstruccion(sql);
		conexion.cerrarConexion();
		return x;
	}
	
	public boolean modificarAlumno(Alumno a) {
		String sql="UPDATE Alumnos SET "
		+"Nombre='"+a.getNombre()
		+"',PrimerAp='"+a.getPrimerAp()
		+"',SegundoAp='"+a.getSegundoAp()
                +"',Edad='"+a.getEdad()
		+"',Semestre='"+a.getSemetre()
		+"',Carrera='"+a.getCarrera()
		+"' WHERE NumControl='"+a.getNumControl()+"'";
		ConexionBD conexion=new ConexionBD();
		boolean x= conexion.ejecutarInstruccion(sql);
		conexion.cerrarConexion();
		return x;
	}
	
	 //=================== BUSCAR UN REGISTRO ===================
	
		public Alumno buscarAlumno(String nC){
			Alumno alumno=new Alumno();
			String sql = "SELECT * FROM Alumnos WHERE NumControl='"+ nC+"'";
			//SELECT * FROM Alumnos WHERE NumControl='1';
			
			ConexionBD conexion = new ConexionBD();
			ResultSet rs=conexion.ejecutarConsultaRegistros(sql);
			try {
				rs.last();
				alumno.setNumControl(rs.getString(1));
				alumno.setNombre(rs.getString(2));
				alumno.setPrimerAp(rs.getString(3));
				alumno.setSegundoAp(rs.getString(4));
                                alumno.setEdad(rs.getByte(5));
				alumno.setSemetre(rs.getByte(6));
				alumno.setCarrera(rs.getString(7));
			} catch (SQLException e) {
				System.out.println("No se encontro el registro");
				return null;
			}finally {
				conexion.cerrarConexion();
			}
			return alumno;
		}
		//=================== BUSCAR MULTIPLES REGISTROS ===================
		
		public ArrayList <Alumno> buscarAlumnos(String nombre,String primerAp,String segundoAp,byte edad,byte semestre,String carrera){
			ArrayList <Alumno> listaAlumnos=new ArrayList<Alumno>();
			String sql="SELECT * FROM Alumnos WHERE " +
			"Nombres='"+nombre
			+"' AND PrimerAp='"+primerAp
			+"' AND SegundoAp='"+segundoAp
                        +"' AND Edad="+edad
			+"' AND Semestre="+semestre
			+" AND Carrera='"+carrera+"'";
			//RECORRER el ResultSet mientas haya registros
			ConexionBD conexion = new ConexionBD();
			ResultSet rs=conexion.ejecutarConsultaRegistros(sql);
			try {
				rs.first();
				while(!rs.isAfterLast()) {
				Alumno alumno = new Alumno();
				alumno.setNumControl(rs.getString(1));
				alumno.setNombre(rs.getString(2));
				alumno.setPrimerAp(rs.getString(3));
				alumno.setSegundoAp(rs.getString(4));
                                alumno.setEdad(rs.getByte(5));
				alumno.setSemetre(rs.getByte(6));
				alumno.setCarrera(rs.getString(7));
				listaAlumnos.add(alumno);
				rs.next();
				}
			} catch (SQLException e) {
				System.out.println("No se encontraron registros");
				return null;
			}finally {
				conexion.cerrarConexion();
			}
			return listaAlumnos;
		}

}
