package tema3.matematicas;

public class Ecuaciones1 {
	public static double hazecua (double dato1, double dato2, double dato3){
		double x1 = (-dato2 + Math.sqrt((dato2*dato2)-(4*dato1*dato3)))/(2*dato1);
		
		double x2 = (-dato2 + Math.sqrt((dato2*dato2)-(4*dato1*dato3)))/(2*dato1);
        System.out.println("La solucion de x1: "+x1);
        System.out.println("La solucion de x2: "+x2);
		return x2;}
	
}
