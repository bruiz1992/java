package practica1;
import java.io.File;
public class ejercicio3 {

	public void ej3() {
		
		
		File oldfile = new File("C:\\Users\\Benjamin\\eclipse-workspace\\DAM2\\src\\2DAM\\AD\\P1.txt");
        File newfile = new File("C:\\Users\\Benjamin\\eclipse-workspace\\DAM2\\src\\2DAM\\AD\\Practica1.txt");
        if (oldfile.renameTo(newfile)) {
            System.out.println("archivo renombrado");
        } else {
            System.out.println("error");
        }
		
	}
}
