package tema3;

import java.util.Scanner;

public class ConversorBinarioDecimal {


	// pasar de binario a decimal
	static int DeBaD(int dato1){
		  int binario=111, resto, decimal=0, i=0;
	       while (binario != 0){
	           resto = binario % 10;
	           decimal = decimal + (resto * (int) Math.pow(2, i));
	           i++;
	           binario = binario / 10;
	       }
	       System.out.println(decimal);
	    
	    
		return dato1;
		}
		public static void main(String[] args) {

			 Scanner entrada = new Scanner (System.in);
			
			 boolean salir = false;
			 int opcion = 0;		
				
			while (salir == false) {
				System.out.println("OPCIONES DE MENU");
				System.out.println("	1. pasar de binario a decimal");
				System.out.println("	2. pasar de decimal a binario ");
				System.out.println("	3. Salir. ");
				System.out.println("	Introduce tu opcion: ");
				opcion = entrada.nextInt();
				
				if (opcion == 3){
					salir = true;
				} else if (opcion == 1){
					System.out.println("Elegiste pasar de binario a decimal ") ;
					System.out.println("introduzca un numero decimal");
					int a = entrada.nextInt();
					int resultado = DeBaD (a);
				} else if (opcion == 2){
					System.out.println("Elegiste pasar de decimal a binario");
					System.out.println("introduzca un numero decimal");
					int a = entrada.nextInt();
					int resultado = 1;
				} 
				System.out.println("hasta pronto");
				
			}
		}

	

	}


