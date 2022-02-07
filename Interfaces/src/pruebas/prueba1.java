package pruebas;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class prueba1 extends JFrame {
	public prueba1() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1,BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2,BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3,BorderLayout.WEST);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4,BorderLayout.CENTER);
	}

	public static void main(String[] args) {
	
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Flow layot itaca");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JButton jb1 = new JButton("ads");
		JButton jb2 = new JButton("asddd");
		JButton jb3 = new JButton("tercer");
		
		
		JPanel panel = new JPanel();
		
		panel.add(jb1);
		panel.add(jb2);
		panel.add(jb3);
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
