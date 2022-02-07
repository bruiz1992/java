package BBDD;

import java.util.*;
import java.sql.*;

public class prueba2 {

	public static void main(String[] args) { // cargar el Driver

		try {

			 try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Establecemos la conexión con la BBDD
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/mybb1", "root", "Dam2021");

			// Preparamos la consulta

			Statement sentencia = conexion.createStatement();
			String sql = "Select * from primera";
			ResultSet resultado = sentencia.executeQuery(sql);

			// Recorremos el resultSet obteniendo su contenido.
			while (resultado.next()) {
				int idempleados = resultado.getInt("id");
				String nombre = resultado.getString("nombre");

				System.out.println(idempleados + " " + nombre);
			}
			// Liberamos los recursos

			resultado.close();
			sentencia.close();
			// conexion.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}