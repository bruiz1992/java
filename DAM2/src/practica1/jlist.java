package practica1;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class jlist {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jlist window = new jlist();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public jlist() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
		ejercicio6 ej6 = new ejercicio6();
		ArrayList<String> ventana= new ArrayList<String>();
		ventana = ej6.ej6();
		
		DefaultListModel listModel = new DefaultListModel();
		//Recorrer el contenido del ArrayList
		for(int i=0; i<ventana.size(); i++) {
		    //Añadir cada elemento del ArrayList en el modelo de la lista
		    listModel.add(i, ventana.get(i));
		}
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JList list = new JList(listModel);
		panel.add(list);
	
	
	
	
	
	
	}

}
