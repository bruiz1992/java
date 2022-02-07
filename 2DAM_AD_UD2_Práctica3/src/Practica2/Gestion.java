package Practica2;

import java.io.File;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Gestion {

	Connection conexion;
	Statement sentencia;

	Gestion(String bbdd, String psswd, String user) {

		String sql = "CREATE TABLE if not exists `clientes` (" + "  `Nif` varchar(9) NOT NULL,"
				+ "  `Nombre` varchar(45) DEFAULT NULL," + "  `Apellidos` varchar(45) DEFAULT NULL,"
				+ "  PRIMARY KEY (`Nif`)" + ");";
		String sql2 = "CREATE TABLE if not exists `descuento` (\r\n" + "  `idDescuento` int NOT NULL,\r\n"
				+ "  `Motivo` varchar(45) DEFAULT NULL,\r\n" + "  `Porcentaje` float DEFAULT NULL,\r\n"
				+ "  PRIMARY KEY (`idDescuento`)\r\n" + ");";
		String sql3 = "CREATE TABLE if not exists `coches` (\r\n" + "  `Matricula` varchar(10) NOT NULL,\r\n"
				+ "  `Marca` varchar(45) DEFAULT NULL,\r\n" + "  `Color` varchar(45) DEFAULT NULL,\r\n"
				+ "  `Precio` double DEFAULT NULL,\r\n" + "  PRIMARY KEY (`Matricula`)\r\n" + ");";
		String sql4 = "CREATE TABLE if not exists `ventas` (\r\n" + "  `idVentas` int NOT NULL AUTO_INCREMENT,\r\n"
				+ "  `Matricula` varchar(45) DEFAULT NULL,\r\n" + "  `nifCliente` varchar(45) DEFAULT NULL,\r\n"
				+ "  `fecha_venta` date DEFAULT NULL,\r\n" + "  `idDescuento` int DEFAULT NULL,\r\n"
				+ "  PRIMARY KEY (`idVentas`),\r\n" + "  KEY `Matricula_idx` (`Matricula`),\r\n"
				+ "  KEY `nifCliente_idx` (`nifCliente`),\r\n" + "  KEY `idDescuento_idx` (`idDescuento`),\r\n"
				+ "  CONSTRAINT `idDescuento` FOREIGN KEY (`idDescuento`) REFERENCES `descuento` (`idDescuento`),\r\n"
				+ "  CONSTRAINT `Matricula` FOREIGN KEY (`Matricula`) REFERENCES `coches` (`Matricula`),\r\n"
				+ "  CONSTRAINT `nifCliente` FOREIGN KEY (`nifCliente`) REFERENCES `clientes` (`Nif`)\r\n" + ");";
		
		String sql5 ="INSERT INTO `initiald`.`clientes` (`Nif`, `Nombre`, `Apellidos`) VALUES ('12345678A', 'Benjamin', 'Ruiz');";
				String sql6 =	"INSERT INTO `initiald`.`clientes` (`Nif`, `Nombre`, `Apellidos`) VALUES ('98765432S', 'Aaron', 'Baila');";
				String sql7 =	"INSERT INTO `initiald`.`clientes` (`Nif`, `Nombre`, `Apellidos`) VALUES ('65498732r', 'Jorge', 'murillo');";
				String sql8 =	"INSERT INTO `initiald`.`clientes` (`Nif`, `Nombre`, `Apellidos`) VALUES ('98765421O', 'prueba', 'pruebita');";
				String sql9 =	"INSERT INTO `initiald`.`coches` (`Matricula`, `Marca`, `Color`, `Precio`) VALUES ('12345K', 'Seat', 'rojo', '12000');";
				String sql10 =	"INSERT INTO `initiald`.`coches` (`Matricula`, `Marca`, `Color`, `Precio`) VALUES ('654321L', 'Citroen', 'Verde', '22000');";
				 String sql11 =	"INSERT INTO `initiald`.`coches` (`Matricula`, `Marca`, `Color`, `Precio`) VALUES ('987654K', 'Seat', 'Azul', '5500');";
				String sql12 =	"INSERT INTO `initiald`.`coches` (`Matricula`, `Marca`, `Color`, `Precio`) VALUES ('985263R', 'Mazda', 'Negro', '20000');";
				String sql13 =	"INSERT INTO `initiald`.`descuento` (`idDescuento`, `Motivo`, `Porcentaje`) VALUES ('1', 'sin desc', '0');";
				String sql14 =	"INSERT INTO `initiald`.`descuento` (`idDescuento`, `Motivo`, `Porcentaje`) VALUES ('2', 'familiar', '0.15');";
				String sql15 =	"INSERT INTO `initiald`.`descuento` (`idDescuento`, `Motivo`, `Porcentaje`) VALUES ('3', 'empleado', '0.2');";
				String sql16 =	"INSERT INTO `initiald`.`descuento` (`idDescuento`, `Motivo`, `Porcentaje`) VALUES ('4', 'peloteo', '0.3');";
				String sql17 =	"INSERT INTO `initiald`.`ventas` (`idVentas`, `Matricula`, `nifCliente`, `fecha_venta`, `idDescuento`) VALUES ('1', '12345K', '12345678A', '2022-01-20', '2');";
				String sql18 =	"INSERT INTO `initiald`.`ventas` (`idVentas`, `Matricula`, `nifCliente`, `fecha_venta`, `idDescuento`) VALUES ('2', '654321L', '12345678A', '2022-01-20', '2');";

				
				
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			setConexion(conexion = DriverManager.getConnection("jdbc:mysql://localhost/" + bbdd, user, psswd));
			setSentencia(sentencia = conexion.createStatement());

			try {

				sentencia.executeUpdate(sql);
				sentencia.executeUpdate(sql2);
				sentencia.executeUpdate(sql3);
				sentencia.executeUpdate(sql4);
				sentencia.executeUpdate(sql5);
				sentencia.executeUpdate(sql6);
				sentencia.executeUpdate(sql7);
				sentencia.executeUpdate(sql8);
				sentencia.executeUpdate(sql9);
				sentencia.executeUpdate(sql10);
				sentencia.executeUpdate(sql11);
				sentencia.executeUpdate(sql12);
				sentencia.executeUpdate(sql13);
				sentencia.executeUpdate(sql14);
				sentencia.executeUpdate(sql15);
				sentencia.executeUpdate(sql16);
				sentencia.executeUpdate(sql17);
				sentencia.executeUpdate(sql18);
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

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

	public String listarDni(String Dni) {
		String sql = "Select * from clientes where Nif = '" + Dni + "'";
		String salida = "";
		ResultSet resultado;

		if (ExisteDNI(Dni) == false) {
			return "Dni no aparece en BBDD";
		}

		try {
			resultado = sentencia.executeQuery(sql);

			// sql = "Select * from clientes";
			while (resultado.next()) {
				String DNI = resultado.getString("Nif");
				String nombre = resultado.getString("Nombre");
				String apellido = resultado.getString("Apellidos");
				String add = DNI + "\t" + nombre + "\t" + apellido + "\n";
				salida = salida + add;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		return salida;
	}

	public String listarcoche(int opcion, String dato) {
		String salida = "";
		String sql = "";
		if (opcion == 1) {
			sql = "Select * from coches where matricula = '" + dato + "'";
		} else {
			sql = "Select * from coches where marca = '" + dato + "'";
		}
		ResultSet resultado;
		try {

			resultado = sentencia.executeQuery(sql);

			while (resultado.next()) {
				String Matricula = resultado.getString("Matricula");
				String Marca = resultado.getString("Marca");
				String Color = resultado.getString("Color");
				Double Precio = resultado.getDouble("Precio");
				String add = Matricula + "\t" + Marca + "\t" + Color + "\t" + Precio + "\n";
				salida = salida + add;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//// e.printStackTrace();
		}
		return salida;

	}

	public String listarVentas(String fechas) {

		String salida = "";
		String sql = "SELECT * FROM ventas where fecha_venta = '" + fechas + "'";
		ResultSet resultado;
		try {
			resultado = sentencia.executeQuery(sql);

			while (resultado.next()) {
				int ID = resultado.getInt("idVentas");
				String Matricula = resultado.getString("Matricula");
				String nifCliente = resultado.getString("nifCliente");
				Date fecha = resultado.getDate("fecha_venta");
				int IDD = resultado.getInt("idDescuento");
				String add = ID + "\t" + Matricula + "\t" + nifCliente + "\t" + fecha + "\t" + IDD + "\t" + "\n";
				salida = salida + add;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//// e.printStackTrace();
		}
		return salida;
	}

	public String listar(int opcion) {
		String salida = "";

		String sql = "";

		try {

			if (opcion == 0) {// ver todos los empleados
				sql = "Select * from clientes";
			}
			if (opcion == 1) {// ver por DNI
				sql = "Select * from descuento";
			}
			if (opcion == 2) {
				sql = "Select * from ventas";
			}
			if (opcion == 3) {
				sql = "Select * from coches";
			}

			ResultSet resultado = sentencia.executeQuery(sql);

			if (opcion == 0) {// ver todos los empleados
				// sql = "Select * from clientes";
				while (resultado.next()) {
					String DNI = resultado.getString("Nif");
					String nombre = resultado.getString("Nombre");
					String apellido = resultado.getString("Apellidos");
					String add = DNI + "\t" + nombre + "\t" + apellido + "\n";
					salida = salida + add;
				}
			}
			if (opcion == 1) {// ver por DNI
				// sql = "Select * from descuento";
				while (resultado.next()) {
					int ID = resultado.getInt("idDescuento");
					String Motivo = resultado.getString("Motivo");
					float Porcentaje = resultado.getFloat("Porcentaje");
					String add = ID + "\t" + Motivo + "\t" + Porcentaje + "\n";
					salida = salida + add;
				}
			}
			if (opcion == 2) {
				// sql = "Select * from ventas";
				while (resultado.next()) {
					int ID = resultado.getInt("idVentas");
					String Matricula = resultado.getString("Matricula");
					String nifCliente = resultado.getString("nifCliente");
					Date fecha = resultado.getDate("fecha_venta");
					int IDD = resultado.getInt("idDescuento");
					String add = ID + "\t" + Matricula + "\t" + nifCliente + "\t" + fecha + "\t" + IDD + "\t" + "\n";
					salida = salida + add;
				}

			}
			if (opcion == 3) {
				// sql = "Select * from coches";
				while (resultado.next()) {
					String Matricula = resultado.getString("Matricula");
					String Marca = resultado.getString("Marca");
					String Color = resultado.getString("Color");
					Double Precio = resultado.getDouble("Precio");
					String add = Matricula + "\t" + Marca + "\t" + Color + "\t" + Precio + "\n";
					salida = salida + add;
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		return salida;

	}

	public String addCliente(String nif, String nombre, String apellidos) {

		if (ExisteDNI(nif) == true) {
			return "El dni ya esta en la BBDD";
		}
		if (DniCorrecto(nif) == false) {
			return "Compruebe que el DNI este compuesto por 9 caracteres.";
		}

		String sql = "INSERT INTO `initiald`.`clientes` (`Nif`, `Nombre`, `Apellidos`) VALUES ('" + nif + "', '"
				+ nombre + "', '" + apellidos + "');";
 
		try {

			sentencia.executeUpdate(sql);
			sentencia.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}

		return "Elemento añadido";
	}

	public String addVehiculo(String matricula, String marca, String color, Float precio) {
		if (ExisteMatricula(matricula) == true) {
			return "El Vehiculo ya esta en la BBDD";
		}

		String sql = "INSERT INTO `initiald`.`coches` (`Matricula`, `Marca`, `Color`, `Precio`) VALUES ('" + matricula
				+ "', '" + marca + "', '" + color + "', '" + precio + "');";

		try {

			sentencia.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}

		return "Elemento añadido";
	}

	public String addVenta(String matricula, String nif, int idDescuento) {
		Date date = new Date();
		DateFormat hourdateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String fecha = hourdateFormat.format(date);

		try {

			if (ExisteMatricula(matricula) == false) {
				return "El Vehiculo no esta en la BBDD";
			}
			if (ExisteDNI(nif) == false) {
				return "El dni no esta en la BBDD";
			}
			if (yaVendido(nif) == true) {
				return "El vehiculo ya ha sido vendido";
			}

			String sql = "INSERT INTO `initiald`.`ventas` (`Matricula`, `nifCliente`, `fecha_venta`, `idDescuento`) VALUES ('"
					+ matricula + "', '" + nif + "', '" + fecha + "', '" + idDescuento + "')";

			sentencia.executeUpdate(sql);
			sentencia.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//// e.printStackTrace();
		}

		return "Elemento añadido";
	}

	public boolean ExisteDNI(String dni) {
		String sql;
		sql = "Select * from clientes";
		try {

			ResultSet resultado = sentencia.executeQuery(sql);

			while (resultado.next()) {

				String DNI = resultado.getString("Nif");
				if (DNI.equals(dni)) {
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		return false;
	}

	public boolean ExisteMatricula(String matricula) {
		String sql;
		sql = "SELECT * FROM initiald.coches";
		try {

			ResultSet resultado = sentencia.executeQuery(sql);

			while (resultado.next()) {

				String Matricula = resultado.getString("matricula");
				if (Matricula.equals(matricula)) {

					return true;

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		return false;

	}

	public boolean yaVendido(String matricula) {
		String sql;
		sql = "Select * from ventas";
		try {

			ResultSet resultado = sentencia.executeQuery(sql);

			while (resultado.next()) {

				String Matricula = resultado.getString("matricula");
				if (Matricula.equals(matricula)) {
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//// e.printStackTrace();
		}
		return false;
	}

	public boolean DniCorrecto(String dni) {

		int cantidad = 9;
		if (cantidad == dni.length()) {
			return true;
		}
		return false;
	}

	public String modCoche(String matricula, float precio) {
		try {

			if (ExisteMatricula(matricula) == false) {
				return "Coche no aparece en BD";
			}
			String sql = "UPDATE `coches` WHERE matricula= '" + matricula + "'";
			sentencia = conexion.createStatement();

			sentencia.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		return "precio modificado";

	}
	
	/*public void crearPdf(String bbdd, String psswd, String user) {
		Map<String, Object> map = new HashMap<>();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		map.put("fecha1Format", "10-10-2000");
		map.put("fecha2Format", "10-10-3000");
		 File path = new File("./jasper.jasper");
		//File path = new File("src/practica2/jasper.jasper");
		JasperReport reporte;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/" + bbdd, user, psswd);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			reporte = (JasperReport) JRLoader.loadObjectFromFile(path.getAbsolutePath());
			//Connection con = (Connection) ges.getConexion();
			JasperPrint jp = JasperFillManager.fillReport(reporte, map, conexion);

			JasperViewer jviewer = new JasperViewer(jp, false);

			JasperExportManager.exportReportToPdfFile(jp, "src/practica2/prueba.pdf" );
			jviewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
			jviewer.setVisible(true);
			jviewer.toFront();
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/


}
