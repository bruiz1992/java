package pruebas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.UIManager;

 
	class Escuchador implements ActionListener{
		static int contador = 1;
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			System.out.println("has pulsado un boton: " + contador);
			setContador(contador + 1);
		}
		public static int getContador() {
			return contador;
		}
		public static void setContador(int contador) {
			Escuchador.contador = contador;
		}

		
		
		
	}


public class BorderLayout2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Border Layout");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jorge\\Pictures\\Planet9\\Planet9_3840x2160.jpg"));
		frame.setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.addWindowListener(new EscuchadorVentana());
		JButton jb1 = new JButton("DI");
		JButton jb2 = new JButton("SGE");
		JButton jb3 = new JButton("PSP");
		JButton jb4 = new JButton("AD");
		JButton jb5 = new JButton("PMD");
		JButton jb6 = new JButton("English");

		jb6.addActionListener(new Escuchador());
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));
		panel2.add(jb3);
		panel2.add(jb6);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(jb1, BorderLayout.NORTH);
		panel.add(jb2, BorderLayout.SOUTH);
		//panel.add(jb3, BorderLayout.EAST);
		panel.add(jb4, BorderLayout.WEST);
		panel.add(jb5, BorderLayout.CENTER);
		//panel.add(jb6, BorderLayout.EAST);
		
		panel.add(panel2, BorderLayout.EAST);
		JLabel label = new JLabel("Añado una etiqueta a la zona este");
		panel2.add(label);
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}

}
