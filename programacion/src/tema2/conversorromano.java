package tema2;
import java.util.Scanner;
public class conversorromano {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un número entre 1 y 5000: ");
		int N = s.nextInt();
		int i, miles, centenas, decenas, unidades;
		int numero = N;
	      String romano = "";
	      miles = numero / 1000;
	      centenas = numero / 100 % 10;
	      decenas = numero / 10 % 10;
	      unidades = numero % 10;
	      //mil
	      for (i = 1; i <= miles; i++) {
	             romano = romano + "M";
	      }

	      //cen
	      if (centenas == 9) {
	          romano = romano + "CM";
	      } else if (centenas >= 5) {
	                 romano = romano + "D";
	                 for (i = 6; i <= centenas; i++) {
	                      romano = romano + "C";
	                 }
	      } else if (centenas == 4) {
	                 romano = romano + "CD";
	      } else {
	                 for (i = 1; i <= centenas; i++) {
	                      romano = romano + "C";
	             }
	      }

	      //dec
	      if (decenas == 9) {
	          romano = romano + "XC";
	      } else if (decenas >= 5) {
	                 romano = romano + "L";
	                 for (i = 6; i <= decenas; i++) {
	                      romano = romano + "X";
	                 }
	      } else if (decenas == 4) {
	                 romano = romano + "XL";
	      } else {
	                 for (i = 1; i <= decenas; i++) {
	                      romano = romano + "X";
	                 }
	      }

	      //uni
	      if (unidades == 9) {
	          romano = romano + "IX";
	      } else if (unidades >= 5) {
	                 romano = romano + "V";
	                 for (i = 6; i <= unidades; i++) {                                                           
	                      romano = romano + "I";
	                 }
	      } else if (unidades == 4) {
	                 romano = romano + "IV";
	      } else {
	                 for (i = 1; i <= unidades; i++) {
	                      romano = romano + "I";
	                 }
	      }
	      System.out.print(romano); 
	}

}
