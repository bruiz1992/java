package practica1;

public class gestion {

	
	
	
	public gestion(){
		
	}
	
	public boolean comprobar(String cuadro1,String cuadro2,String cuadro3,String cuadro4) {
		
		if(cuadro1.equals(cuadro2)) {
			return true;
		}else if(cuadro1.equals(cuadro3)) {
			return true;
		}else if(cuadro1.equals(cuadro4)) {
			return true;
		}else if(cuadro2.equals(cuadro3)) {
			return true;
		}else if(cuadro2.equals(cuadro4)) {
			return true;
		}else if(cuadro3.equals(cuadro4)) {
			return true;
		}	
		return false;
	}
	
}
