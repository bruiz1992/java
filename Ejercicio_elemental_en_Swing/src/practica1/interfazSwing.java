package practica1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class interfazSwing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfazSwing frame = new interfazSwing();
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
	public interfazSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(64, 62, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(266, 62, 86, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setBounds(64, 139, 86, 20);
		textField_2.setColumns(10);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setBounds(266, 139, 86, 20);
		textField_3.setColumns(10);
		contentPane.add(textField_3);

		JLabel Etiqueta = new JLabel("practica 1");
		Etiqueta.setBounds(64, 23, 280, 14);
		contentPane.add(Etiqueta);

		JButton btnNewButton = new JButton("Comprobar");
		btnNewButton.setBounds(39, 205, 126, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gestion revision = new gestion();
				if (revision.comprobar(textField.getText(), textField_1.getText(), textField_2.getText(),
						textField_3.getText()) == true) {
					Etiqueta.setText("Existen coincidencias");
				} else {
					Etiqueta.setText("Los cuadros son diferentes");
				}
			}
		});
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBounds(263, 205, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnNewButton_1);

	}
}
