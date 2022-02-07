package Tema4;

public class GatoSimple {

	// ATRIBUTOS /////////////////////////////
	String color, raza, sexo;
	int edad;
	double peso;

	
	
	
	
	// METODOS ///////////////////////////////
	
	// Constructor SIN parametros
	//  Si no decimos nada, al crear un gato sera siempre del genero masculino.
	GatoSimple () {
		this.sexo = "macho";
	}
	
	// Constructor CON parametros
	GatoSimple (String s) {
		if (s.equals("hembra")) {
			this.sexo = s;
		} else if (s.equals("macho")) {
			this.sexo = s;
		} else {
			System.out.println("Esa condicion sexual no existe. ");
			this.sexo = "hemafrodita";
		}
		
	}

	
	
	
	
	
	
	
	// getter
	String getSexo() {
		return this.sexo;
	}
	
	
	
	
	

	/*
	 * Hace que el gato maulle
	 */
	void maulla() {
		System.out.println("Miauuuu");
	}

	/*
	 * Hace que el gato ronronee
	 */
	void ronronea() {
		System.out.println("mrrrrrr");
	}

	/*
	 * Hace que el gato coma.
	 * A los gatos les gusta el pescado, si le damos otra comida la rechazara.
	 * @param comida la comida que se le ofrece al gato
	 */
	void come(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Hmmmm, gracias");
		} else {
			System.out.println("Lo siento, yo solo como pescado");
		}
	}

	/*
	 * Pone a pelear dos gatos.
	 * Solo se van a pelear dos machos entre si�.
	 *
	 * @param contrincante es el gato contra el que pelear
	 */
	void peleaCon(GatoSimple contrincante) {
		if (this.sexo.equals("hembra")) {
			System.out.println("Soy una dama y no me gusta pelear");
		} else {
			if (contrincante.getSexo().equals("hembra")) {
				System.out.println("No peleo contra gatitas");
			} else {
				System.out.println("���Ven aqu�!!!, ���que te vas a enterar!!!");
			}
		}
	}
	
}
