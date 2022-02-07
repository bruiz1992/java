package practica1AD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Gestion {
	
	
	
	
	

	public String ConsultarEmpleados(int opcion, String DnI, String psswd, String user) {
		String salida = "";

		String sql;

		try {

			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (opcion == 1) {// ver todos los empleados
				sql = "Select * from empleados";
			} else {// ver por DNI
				sql = "Select * from empleados where Nif='" + DnI + "'";
			}

			// Establecemos la conexión con la BBDD
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/empresa", user, psswd);

			// Preparamos la consulta

			Statement sentencia = conexion.createStatement();
			ResultSet resultado = sentencia.executeQuery(sql);

			// Recorremos el resultSet obteniendo su contenido.
			while (resultado.next()) {
				String DNI = resultado.getString("Nif");
				String nombre = resultado.getString("Nombre");
				String apellido = resultado.getString("Apellidos");
				float salario = resultado.getFloat("Salario");
				String Ssalario = String.valueOf(salario);

				String add = DNI + "\t" + nombre + "\t" + apellido + "\t" + Ssalario + "\n";
				salida = salida + add;

			}
			// Liberamos los recursos

			resultado.close();
			sentencia.close();
			// conexion.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salida;
	}

	public String ConsultarEmpleadossal(int opcion, Float Sal, String psswd, String user) {
		String salida = "";
		String sql;

		if (opcion == 1) {// ver salario igual o menor
			sql = "Select * from empleados where Salario <=" + Sal;
		} else {// ver salario mayor
			sql = "Select * from empleados where Salario >" + Sal;
		}

		try {

			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Establecemos la conexión con la BBDD
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/empresa", user, psswd);

			// Preparamos la consulta

			Statement sentencia = conexion.createStatement();
			ResultSet resultado = sentencia.executeQuery(sql);

			// Recorremos el resultSet obteniendo su contenido.
			while (resultado.next()) {
				String DNI = resultado.getString("Nif");
				String nombre = resultado.getString("Nombre");
				String apellido = resultado.getString("Apellidos");
				float salario = resultado.getFloat("Salario");
				String Ssalario = String.valueOf(salario);

				String add = DNI + "\t" + nombre + "\t" + apellido + "\t" + Ssalario + "\n";
				salida = salida + add;

			}
			// Liberamos los recursos

			resultado.close();
			sentencia.close();
			// conexion.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salida;
	}

}
