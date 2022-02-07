package tema3;

import java.util.Random;

public class NotasAsignaturaBasesDatos {

	public static void main(String[] args) {
		int x;
		float[] numeros = new float[27];
		float aleatorio = (float) (Math.random() * 10);
		for (x = 0; x < numeros.length; x++)
			numeros[x] = (float) (Math.random() * 10);
        int i = 0;
        int n = 1;
        while(i < 27){
        System.out.println("alumno numero:"+ n + ", nota examen " +numeros[i]);
        i++;
        n++;
        }
	}
}
