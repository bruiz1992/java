package PracticaAcceso;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class MedicionesInter extends JFrame {

	private JPanel contentPane;
	private JTable tabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicionesInter frame = new MedicionesInter();
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
	public MedicionesInter() {
		getContentPane().setLayout(null);
		DefaultTableModel Tabla1 = new DefaultTableModel();
		
		Tabla1.addColumn("Hora");
		Tabla1.addColumn("Minutos");
		Tabla1.addColumn("Cadena");
		Tabla1.addColumn("Niños");
		Tabla1.addColumn("Jovenes");
		Tabla1.addColumn("Adultos");
		Tabla1.addColumn("Mayores");
		Tabla1.addColumn("Total");
		
		tabla = new JTable(Tabla1);
		JScrollPane Scroll = new JScrollPane(tabla);
		setTitle("Mediciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabla.setBounds(40, 36, 355, 169);
		// contentPane.add(tabla);
		Scroll.setBounds(10, 36, 434, 281);
		getContentPane().add(Scroll);
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaz boton = new interfaz();
				boton.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(31, 328, 122, 23);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Mediciones de las diferentes cadenas en activo");
		lblNewLabel.setBounds(20, 11, 375, 14);
		contentPane.add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("Mostrar");
		btnNewButton_1.setBounds(316, 328, 89, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setEnabled(false);
				if (e.getSource() == btnNewButton_1) {
					File PracticaFinal = new File("totales.txt");
					try {
						PracticaFinal.createNewFile();
						BBDD bbdd = new BBDD();
						bbdd.AddArrays("medicion.txt");
						bbdd.pisarFicheromed();

						BufferedReader br = new BufferedReader(new FileReader(PracticaFinal));
						tabla.getModel();
						
						
						Object[] Linea = br.lines().toArray();
						
						for (int i = 0; i < Linea.length; i++) {
							String[] fila = Linea[i].toString().split(",");
							Tabla1.addRow(fila);

						}
						br.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}

		});

	}
}
