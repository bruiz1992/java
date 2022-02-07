package PracticaAcceso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class TxtaXmlinter extends JFrame {

	private JPanel contentPane;
	private JTextField TextoXML1;
	private JTextField TextoXML2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TxtaXmlinter frame = new TxtaXmlinter();
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
	public TxtaXmlinter() {
		setTitle("De TXT a XML");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaz boton = new interfaz();
				boton.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(179, 211, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Crear XML a partir del archivo TXT");
		lblNewLabel.setBounds(140, 11, 182, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Indica la ruta absoluta del fichero TXT");
		lblNewLabel_1.setBounds(10, 38, 357, 23);
		contentPane.add(lblNewLabel_1);
		
		TextoXML1 = new JTextField();
		TextoXML1.setBounds(10, 59, 414, 20);
		contentPane.add(TextoXML1);
		TextoXML1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("indica el nombre del nuevo archivo");
		lblNewLabel_2.setBounds(10, 90, 342, 14);
		contentPane.add(lblNewLabel_2);
		
		TextoXML2 = new JTextField();
		TextoXML2.setColumns(10);
		TextoXML2.setBounds(10, 126, 414, 20);
		contentPane.add(TextoXML2);
		
		JButton btnNewButton_1 = new JButton("generar Archivo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String XML = TextoXML2.getText();
				String nombre = TextoXML1.getText();;
				BBDD BBDD = new BBDD();
				BBDD.AddArrays(nombre);
				BBDD.CrearFicheroTXTaXML(XML);
				Mensaje AAA = new Mensaje();
				AAA.setVisible(true);
				setVisible(false);
			}
			
			
		});
		btnNewButton_1.setBounds(140, 158, 143, 23);
		contentPane.add(btnNewButton_1);
	}
}
