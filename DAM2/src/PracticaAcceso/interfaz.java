package PracticaAcceso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;

public class interfaz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz frame = new interfaz();
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
	public interfaz() {
		setType(Type.POPUP);
		setTitle("Menu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Mostrar mediciones de audiencia");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MedicionesInter boton1 = new MedicionesInter();
				boton1.setVisible(true);
				setVisible(false);

			}
		});
		btnNewButton.setBounds(102, 87, 234, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1_1 = new JButton("Modificar de TXT a XML");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtaXmlinter boton3 = new TxtaXmlinter();
				boton3.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1_1.setBounds(102, 121, 234, 23);
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_1_1_1 = new JButton("Salir");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1_1.setBounds(102, 201, 234, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Menu Practica final tema 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(102, 11, 240, 46);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1_1_2 = new JButton("Cuotas de pantalla");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cuotas boton2 = new Cuotas();
				boton2.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1_1_2.setBounds(102, 155, 234, 23);
		contentPane.add(btnNewButton_1_1_2);
	}
}
