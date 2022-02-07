package PracticaAcceso;



public class MainMenu {

	public static void main(String[] args) {
		
		BBDD BBDD = new BBDD();
		BBDD.AddArrays("medicion.txt");
		BBDD.pisarFichero();
		BBDD.pisarFicheromed();
		interfaz a = new interfaz();
		a.setVisible(true);
		
			
	}

}
