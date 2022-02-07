package tema3;
import tema3.matematicas.Varias;
import tema3.matematicas.Geometria;
import tema3.matematicas.Ecuaciones1;
import java.util.Scanner;
public class PuebaFunciones {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		
		
		// Prueba esPrimo()
		System.out.print("Introduzca un número entero positivo: ");
		n = entrada.nextInt();
		if (tema3.matematicas.Varias.esPrimo(n)) {
			System.out.println("El " + n + " es primo.");
		} else {
			System.out.println("El " + n + " no es primo.");
		}
		
		// Prueba digitos()
		System.out.print("Introduzca un número entero positivo: ");
		int b = entrada.nextInt();
		System.out.println(b + " tiene " + tema3.matematicas.Varias.digitos(b) + " dígitos.");
		
		// Prueba volumenCilindro()
		double r, h;
		System.out.println("Cálculo del volumen de un cilindro");
		System.out.print("Introduzca el radio en metros: ");
		r = entrada.nextDouble();
		System.out.print("Introduzca la altura en metros: ");

		h = entrada.nextDouble();
		System.out.println("El volumen del cilindro es " + tema3.matematicas.Geometria.volumenCilindro(r, h) + " m3");
	
	
		 System.out.println("Ingrese valores ax,bx,c separados: ");

	       
	        double a = entrada.nextDouble(); //variable a almacenada es trasformada a int

	        double bb = entrada.nextDouble(); //variable b almacenada es trasformada a int

	        double c = entrada.nextDouble(); //variable v almacenada es trasformada a int

	        //Obtien los valores x1,x2 de la ecuacion
	        double x1 = tema3.matematicas.Ecuaciones1.hazecua (a, bb, c);
	       
	        
	
	
	
	
	}

	
		
		
	}


