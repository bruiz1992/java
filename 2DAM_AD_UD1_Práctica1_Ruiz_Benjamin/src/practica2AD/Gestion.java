package practica2AD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Gestion {

	Connection conexion;
	Statement sentencia;

	Gestion(String psswd, String user) {
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setConexion(conexion = DriverManager.getConnection("jdbc:mysql://localhost/empresa", user, psswd));
			setSentencia(sentencia = conexion.createStatement());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String ConsultarEmpleados(int opcion, String DnI, int dpto) {
		String salida = "";

		String sql=" ";

		try {

			if (opcion == 1) {// ver todos los empleados
				sql = "Select * from empleados";
			}
			if (opcion == 0) {// ver por DNI
				sql = "Select * from empleados where Nif='" + DnI + "'";
			} if(opcion == 2) {
				sql = "Select * from empleados where dpto='" + dpto + "'";
			}

			// Establecemos la conexión con la BBDD

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
				int DPTO = resultado.getInt("dpto");

				String add = DNI + "\t" + nombre + "\t" + apellido + "\t" + Ssalario + "\t" +DPTO+ "\n";
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

	public String ConsultarEmpleadossal(int opcion, Float Sal) {
		String salida = "";
		String sql = "";

		if (opcion == 1) {// ver salario igual o menor
			sql = "Select * from empleados where Salario <= " + Sal;
		} if(opcion == 2) {// ver salario mayor
			sql = "Select * from empleados where Salario > " + Sal;
		}

		try {

			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Establecemos la conexión con la BBDD
			// Connection conexion =
			// DriverManager.getConnection("jdbc:mysql://localhost/empresa", user, psswd);

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

	public String addEmpleado(String DNI, String nombre, String apellido, float salario, int DP) {
		if (ExisteDNI(DNI) == true) {
			return "El dni ya esta en la BBDD";
		}
		if (ExisteDep(DP) == false) {
			return "El Dep indicado no esta en la BBDD";
		}
		if (DniCorrecto(DNI)== false) {
			return "Compruebe que el DNI este compuesto por 9 caracteres.";
		}
		
		String sql = "INSERT INTO `empresa`.`empleados` (`Nif`, `Nombre`, `Apellidos`, `Salario`, `dpto`) VALUES ('"
				+ DNI + "', '" + nombre + "', '" + apellido + "', '" + salario + "', '" + DP + "');";

		try {

			sentencia.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "El usuario se ha añadido a la BBDD";
	}

	public boolean ExisteDNI(String dni) {
		String sql;
		sql = "Select * from empleados";
		try {
			Statement sentencia = conexion.createStatement();
			ResultSet resultado = sentencia.executeQuery(sql);

			while (resultado.next()) {

				String DNI = resultado.getString("Nif");
				if (DNI.equals(dni)) {
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public String ModEmpleado(String dni, float salario) {
		if (ExisteDNI(dni) == false) {
			return "El dni no existe";
		}

		String sql = "UPDATE `empresa`.`empleados` SET `Salario` = '" + salario + "' WHERE (`NIF` = '" + dni + "')";
		Statement sentencia;
		try {
			sentencia = conexion.createStatement();

			sentencia.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Salario modificado";
	}

	public String BorrarEmpleado(String dni) {
		if (ExisteDNI(dni) == false) {
			return "El dni no existe";
		}
		String sql = "DELETE FROM `empleados`WHERE Nif = '" + dni + "'";
		Statement sentencia;
		try {
			sentencia = conexion.createStatement();

			sentencia.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "Elemento borrado de la BBDD";

	}

	public boolean ExisteDep(int id) {
		if ((contarDep()+1) <= id) {
			return false;
		}return true;}

	public int contarDep() {
		String sql;
		int total = 0;
		sql = "Select * from departamentos";
		try {
			Statement sentencia = conexion.createStatement();
			ResultSet resultado = sentencia.executeQuery(sql);

			while (resultado.next()) {
				total++;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return total;
	}

	public String addDepartamento(String nombre) {

		int ID = contarDep() + 1;
		String sql = "INSERT INTO `empresa`.`departamentos` (`ID`, `nombre`) VALUES ('" + ID + "', '" + nombre + "')";
		try {

			sentencia.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "Departamento creado correctamente";
	}

	public String ModDepartamento(int id, String nombre) {
		if ((contarDep()+1) <= id) {
			return "El DEP no existe";
		}
		String sql = "UPDATE `empresa`.`departamentos` SET `nombre` = '" + nombre + "' WHERE (`ID` = '" + id + "');";
		Statement sentencia;
		try {
			sentencia = conexion.createStatement();

			sentencia.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "Elemento modificado de la BBDD";

	}

	public String BorrarDepartamento(int id) {

		if (ExisteDep(id) == false) {
			return "El DEP no existe";
		}
		String sql = "DELETE FROM `departamentos`WHERE ID = '" + id + "'";
		Statement sentencia;
		try {
			sentencia = conexion.createStatement();

			sentencia.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "Elemento borrado de la BBDD";

	}

	public String ListarDep(int opcion, String nombre, int id) {

		String sql = "SELECT * FROM departamentos", salida = "";
		if ((contarDep()+1) <= id) {
			return "El DEP no existe";
		}
		if (opcion == 1) {
			sql = "SELECT * FROM departamentos where nombre = '" + nombre + "'";
		}
		if (opcion == 2) {
			sql = "SELECT * FROM departamentos where ID = '" + id + "'";
		}
		try {

			Statement sentencia = conexion.createStatement();
			ResultSet resultado = sentencia.executeQuery(sql);

			// Recorremos el resultSet obteniendo su contenido.
			while (resultado.next()) {
				String ID = resultado.getString("ID");
				String Nombre = resultado.getString("Nombre");

				String add = ID + "\t" + Nombre + "\n";
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

	public boolean DniCorrecto(String dni) {
		
		int cantidad = 9;
		if (cantidad == dni.length()) {
			return true;
		}
		return false;
	}
	
	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public Statement getSentencia() {
		return sentencia;
	}

	public void setSentencia(Statement sentencia) {
		this.sentencia = sentencia;
	}

}
