package tema2;
import java.util.Scanner;
public class Ejercicio19fecha {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca fecha en tres numero por separado en orden  DD MM AAAA: ");
		int dia = s.nextInt();
		int mes = s.nextInt();
		int año = s.nextInt();
		String mess = "mes";
		s.close();
		//dia
		if (mes == 2 && dia >= 29) {
			System.out.print(" " + dia);
		} 
		if(mes == 4 || mes == 6 ||mes == 9 || mes == 11 ||  dia >= 30){
			System.out.print(" " + dia);}
		if(mes == 1 || mes == 3 ||mes == 5 || mes == 7 ||mes == 8 ||mes == 10 ||mes == 12 ||  dia >= 31){
			System.out.print(" " + dia);			
		}
		else{
			System.out.print("La fecha indicada es erronea");
		}
		//mes
		if ( 0 <= mes || mes >= 13) {
				
			if ( mes == 1 )	{
				mess = "Enero";
			}
			if ( mes == 2 )	{
				mess = "febrero";
			}
			if ( mes == 3 )	{
				mess = "Marzo";
			}
			if ( mes == 4 )	{
				mess = "Abril";
			}
			if ( mes == 5 )	{
				mess = "Mayo";
			}
			if ( mes == 6 )	{
				mess = "Junio";
			}
			if ( mes == 7 )	{
				mess = "Julio";
			}
			if ( mes == 8 )	{
				mess = "Agosto";
			}
			if ( mes == 9 )	{
				mess = "Septiembre";
			}
			if ( mes == 10 )	{
				mess = "Octubre";
			}
			if ( mes == 11 )	{
				mess = "Noviembre";
			}
			if ( mes == 12 )	{
				mess = "Diciembre";
			}
			System.out.print(" " + mess + " ");
			}else {
			System.out.print("La fecha indicada es erronea");
		}
		
		//año	
		if ( 0 <= año ) {
			System.out.print(" " + año + " ");
		}
		else {
			System.out.print("La fecha indicada es erronea");
		}
		
	}

}
