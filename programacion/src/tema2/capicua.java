package tema2;
import java.util.Scanner;
public class capicua {


	    public static void main(String[] args) {
	        int Numero, B, inverso = 0, cifra;
	        Scanner sc = new Scanner(System.in);
	        
	            System.out.print("Introduce un número >= 10: ");                                                 
	            Numero = sc.nextInt();
	         while (Numero < 10);
	       
	       //lo vemos del reves
	        B = Numero;
	        while (B!=0){
	            cifra = B % 10;
	            inverso = inverso * 10 + cifra;
	            B = B / 10;
	        }
	    
	        if(Numero == inverso){
	            System.out.println("Es capicua");
	        }else{
	            System.out.println("No es capicua");
	        }
	    }
	
		
		
	}


