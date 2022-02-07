package ficheros;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterUsuario extends JFrame {

	private JPanel contentPane;
	public JTextField BD;
	public JTextField usu;
	public JTextField pasword;
	private static String bd;
	private static String usU;
	private static String pasworD;
 
	//Gestion ges = new Gestion(BD.getText(), pasword.getText(),usu.getText());
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterUsuario frame = new InterUsuario();
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
	public InterUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BD.getText().toString().isEmpty()) {
					dialogo("Por favor rellena los datos");
				}else if(usu.getText().toString().isEmpty()) {
					dialogo("Por favor rellena los datos");
				}else if(pasword.getText().toString().isEmpty()) {
					dialogo("Por favor rellena los datos");
				}else {
				
				setBd(BD.getText());
				setUsU(usu.getText());
				setPasworD(pasword.getText());
					
				
				intervehiculo paso = new intervehiculo();
				paso.setVisible(true);
				setVisible(false);
			}}
		});
		btnNewButton.setBounds(168, 183, 89, 23);
		contentPane.add(btnNewButton);
		
		BD = new JTextField();
		BD.setBounds(132, 49, 215, 20);
		contentPane.add(BD);
		BD.setColumns(10);
		
		usu = new JTextField();
		usu.setBounds(132, 80, 215, 20);
		contentPane.add(usu);
		usu.setColumns(10);
		
		pasword = new JTextField();
		pasword.setBounds(132, 111, 215, 20);
		contentPane.add(pasword);
		pasword.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre DB");
		lblNewLabel.setBounds(22, 52, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(22, 83, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a");
		lblNewLabel_2.setBounds(22, 114, 67, 14);
		contentPane.add(lblNewLabel_2);
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



	public static String getBd() {
		return bd;
	}

	public static void setBd(String bd) {
		InterUsuario.bd = bd;
	}

	public static String getUsU() {
		return usU;
	}

	public static void setUsU(String usU) {
		InterUsuario.usU = usU;
	}

	public static String getPasworD() {
		return pasworD;
	}

	public static void setPasworD(String pasworD) {
		InterUsuario.pasworD = pasworD;
	}
}
