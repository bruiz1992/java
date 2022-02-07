package PracticaAcceso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Cuotas extends JFrame {

	private JPanel contentPane;
	private JTable tabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuotas frame = new Cuotas();
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
	public Cuotas() {

		getContentPane().setLayout(null);
		DefaultTableModel Tabla1 = new DefaultTableModel();
		Tabla1.addColumn("Cadena");
		Tabla1.addColumn("madrugada");
		Tabla1.addColumn("mañana");
		Tabla1.addColumn("tarde");
		Tabla1.addColumn("Prime");
		Tabla1.addColumn("Total");
		tabla = new JTable(Tabla1);
		JScrollPane Scroll = new JScrollPane(tabla);
		setTitle("Mediciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabla.setBounds(40, 36, 355, 169);
		// contentPane.add(tabla);
		Scroll.setBounds(10, 36, 652, 281);
		getContentPane().add(Scroll);

		JButton btnNewButton = new JButton("Salir");
		btnNewButton.setBounds(67, 209, 98, 23);
		contentPane.add(btnNewButton);

		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMostrar.setBounds(259, 209, 98, 23);
		contentPane.add(btnMostrar);

		JButton btnNewButton_1 = new JButton("Mostrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setEnabled(false);
				if (e.getSource() == btnNewButton_1) {
					File PracticaFinal = new File("cuotas.txt");
					try {
						PracticaFinal.createNewFile();

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
		btnNewButton_1.setBounds(49, 328, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaz boton = new interfaz();
				boton.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setBounds(546, 328, 89, 23);
		contentPane.add(btnNewButton_2);
	}

}
