package Tema4;
import java.time.LocalDate;
import java.time.Month;
public class PruebaCaballo {

	public static void main(String[] args) {
		// Caballo de Don Quijote
		Caballo c1 = new Caballo("Rocinante", LocalDate.of(1300, Month.FEBRUARY, 23), "Blanco", 400.0);		
		Caballo c2 = new Caballo("Pegaso", LocalDate.of(50, Month.FEBRUARY, 23), "Blanco", 450.0);		
		// Caballo de Toy Story
		Caballo c3 = new Caballo("Perdigon", LocalDate.of(1997, Month.FEBRUARY, 23), "Marron", 375.0);
		
		System.out.print("\t CARLOS: �Cuanto pesa Rocinante?");
		System.out.println(c1.dimePeso());
		
		int engorde = 7;
		System.out.println("\t CARLOS: Vamos a engordarlo " + engorde);
		c1.engordar(engorde);
		
		System.out.print("\t CARLOS: �Cuanto pesas ahora?");
		System.out.println(c1.dimePeso());
		
		System.out.print("\t CARLOS: �Cuando naciste? ");
		System.out.println(c1.dimeFechaNacimiento());

	}

}
