package Practica2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Component;
import javax.swing.JTextField;

public class intervehiculo extends JFrame {

	private JPanel contentPane;
	private JTable tabla;
	private JTextField Matricula;
	private JTextField Marca;
	private JTextField Color;
	private JTextField Precio;

	static InterUsuario conexion = new InterUsuario();

	static Gestion ges = new Gestion(conexion.getBd(), conexion.getPasworD(), conexion.getUsU());

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					intervehiculo frame = new intervehiculo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public intervehiculo() {
		getContentPane().setLayout(null);
		DefaultTableModel Tabla1 = new DefaultTableModel();

		Tabla1.addColumn("Matricula");
		Tabla1.addColumn("Marca");
		Tabla1.addColumn("Color");
		Tabla1.addColumn("Precio");

		tabla = new JTable(Tabla1);
		JScrollPane Scroll = new JScrollPane(tabla);
		Scroll.setBounds(189, 11, 366, 216);
		setTitle("Mediciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabla.setBounds(40, 36, 355, 169);
		getContentPane().add(Scroll);

		Matricula = new JTextField();
		Matricula.setBounds(115, 28, 64, 20);
		contentPane.add(Matricula);
		Matricula.setColumns(10);

		JButton btnNewButton = new JButton("insertar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float valor = Float.valueOf(Precio.getText());
				String matricula = Matricula.getText();
				String marca = Marca.getText();
				String color = Color.getText();
				for (int i = 0; i < tabla.getRowCount(); i++) {
					Tabla1.removeRow(i);
					i -= 1;
				}if (ges.ExisteMatricula(matricula) == true) {
					dialogo("matricula ya aparece en BD"); 
				}else {
				
				String sql = "INSERT INTO `initiald`.`coches` (`Matricula`, `Marca`, `Color`, `Precio`) VALUES ('"
						+ matricula + "', '" + marca + "', '" + color + "', '" + valor + "');";

				try {
					ges.getSentencia().executeUpdate(sql);

					dialogo("añadido");

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}}

			}
		});
		btnNewButton.setBounds(10, 291, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("listar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "Select * from coches";
				String[] dato = new String[4];
				ResultSet resultado;
				try {
					for (int i = 0; i < tabla.getRowCount(); i++) {
						Tabla1.removeRow(i);
						i -= 1;
					}
					resultado = ges.getSentencia().executeQuery(sql);

					while (resultado.next()) {

						dato[0] = resultado.getString("Matricula");
						dato[1] = resultado.getString("Marca");
						dato[2] = resultado.getString("Color");
						String val = String.valueOf(resultado.getDouble("Precio"));
						dato[3] = val;
						Tabla1.addRow(dato);

					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_1.setBounds(115, 291, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("modificar precio");
		btnNewButton_2.addActionListener(new ActionListener() {// modificar
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < tabla.getRowCount(); i++) {
					Tabla1.removeRow(i);
					i -= 1;
				}

				Float valor = Float.valueOf(Precio.getText());
				String matricula = Matricula.getText();

				if (ges.ExisteMatricula(matricula) == false) {
					dialogo("Coche no aparece en BD"); 
				}else {
				String sql = "UPDATE `initiald`.`coches` SET `Precio` =" +"'" + valor +"'"+ "WHERE (`Matricula` = '" + matricula +"')";
				dialogo("precio modificado");

				try {
					if (ges.ExisteMatricula(matricula) == false) {
						dialogo("Coche no aparece en BD"); 
					}else {
					ges.getSentencia().executeUpdate(sql);
					dialogo("Coche eliminado"); 
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}}

			}
		});
		btnNewButton_2.setBounds(226, 291, 107, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("borrar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// borrar
				ResultSet resultado;
				for (int i = 0; i < tabla.getRowCount(); i++) {
					Tabla1.removeRow(i);
					i -= 1;
				}
				String matricula = Matricula.getText();
				String sql = "DELETE from `coches` WHERE matricula= '" + matricula + "'";

				try {
					ges.getSentencia().executeUpdate(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(370, 291, 89, 23);
		contentPane.add(btnNewButton_3);

		Marca = new JTextField();
		Marca.setBounds(115, 71, 64, 20);
		Marca.setColumns(10);
		contentPane.add(Marca);

		Color = new JTextField();
		Color.setBounds(115, 120, 64, 20);
		Color.setColumns(10);
		contentPane.add(Color);

		Precio = new JTextField();
		Precio.setBounds(115, 165, 64, 20);
		Precio.setColumns(10);
		contentPane.add(Precio);

		JLabel lblNewLabel = new JLabel("matricula");
		lblNewLabel.setBounds(27, 31, 56, 14);
		contentPane.add(lblNewLabel);

		JLabel lblMarca = new JLabel("marca");
		lblMarca.setBounds(27, 74, 46, 14);
		contentPane.add(lblMarca);

		JLabel lblColor = new JLabel("color");
		lblColor.setBounds(27, 123, 46, 14);
		contentPane.add(lblColor);

		JLabel lblPrecio = new JLabel("precio");
		lblPrecio.setBounds(27, 168, 46, 14);
		contentPane.add(lblPrecio);

		JButton btnNewButton_3_1 = new JButton("salir");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3_1.setBounds(481, 291, 89, 23);
		contentPane.add(btnNewButton_3_1);
		
		JButton ExportarPDF = new JButton("PDF");
		ExportarPDF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearPdf(0);
			}
		});
		ExportarPDF.setBounds(10, 238, 89, 23);
		contentPane.add(ExportarPDF);
		
		JButton btnNewButton_5 = new JButton("HTML");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearPdf(1);
			}
		});
		btnNewButton_5.setBounds(115, 238, 89, 23);
		contentPane.add(btnNewButton_5);
	}

	public void dialogo(String mensaje) {

		JDialog dialogo = new JDialog(this, "dialog Box");
		// create a label
		JLabel mensajeDialogo = new JLabel(mensaje);
		mensajeDialogo.setFont(new Font("Verdana", Font.PLAIN, 18));
		dialogo.setBounds(400, 100, 500, 200);
		dialogo.getContentPane().add(mensajeDialogo);
		// setsize of dialog
		dialogo.setSize(300, 100);
		// set visibility of dialog
		dialogo.setVisible(true);
	}
	public void crearPdf(int eleccion) {
		Map<String, Object> map = new HashMap<>();
		File path = new File("./jasper.jasper");
		JasperReport reporte;
		try {
			reporte = (JasperReport) JRLoader.loadObjectFromFile(path.getAbsolutePath());
			
			JasperPrint jp = JasperFillManager.fillReport(reporte, map, ges.conexion);

			if (eleccion == 1) {
				String nombreArchivo = JOptionPane.showInputDialog("INDIQUE NOMBRE DEL ARCHIVO");
				JasperExportManager.exportReportToHtmlFile(jp, "./" + nombreArchivo + ".html");
			} else if (eleccion == 0) {
				String nombreArchivo = JOptionPane.showInputDialog("INDIQUE NOMBRE DEL ARCHIVO");
				JasperExportManager.exportReportToPdfFile(jp, "./" + nombreArchivo + ".pdf");
			}

		} catch (JRException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
