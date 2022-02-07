package tema3;
import java.util.Scanner;
import tema3.matematicas.*;



public class ecuaciones {

	

	public static void main(String[]args){

		Scanner entrada = new Scanner (System.in);


        System.out.println("Ingrese valores ax,bx,c separados: ");

       
        double a = entrada.nextDouble(); //variable a almacenada es trasformada a int

        double b = entrada.nextDouble(); //variable b almacenada es trasformada a int

        double c = entrada.nextDouble(); //variable v almacenada es trasformada a int

        //Obtien los valores x1,x2 de la ecuacion
        double media2 = tema3.matematicas.Ecuaciones1.hazecua(a, b, c);



    }

}

