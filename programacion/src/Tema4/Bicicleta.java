package Tema4;

public class Bicicleta {

	int velocidadActual, platoActual,pi�onActual, marcador;

	Bicicleta () {
		this.pi�onActual = 3;
		this.platoActual = 2;
		this.velocidadActual =0;
	}
//VELOCIDAD
	void acelerar() {
		velocidadActual = velocidadActual +5;
		//System.out.println("LA BICICLETA VA A " + velocidadActual + "KM/H");
	}
	void frenar() {
		velocidadActual = velocidadActual -5;	
	}
	
	void marcador() {		
		if (velocidadActual < 0) {
			velocidadActual = 0;
			System.out.println("ESTAS PARADO NO PUEDES FRENAR MAS");
			System.out.println();	
		}
		System.out.println("LA BICICLETA VA A " + velocidadActual + "KM/H");
		System.out.println("LA BICICLETA ESTA EN EL PI�ON " + pi�onActual);
		System.out.println("LA BICICLETA ESTA EN EL PLATO " + platoActual);
	}
	

//MARCHAS
	
	void cambiarPlato(int plato) {
		if (plato <=3 && plato >=1) {
		platoActual = plato;
		}else {
			System.out.println();
			System.out.println("ESE PLATO NO EXISTE, SOLO HAY TRES PLATOS");
			System.out.println();
		}
	}

	void cambiarPi�on(int pi�on) {
		if (pi�on <=6 && pi�on >=1) {
			platoActual = pi�on;
			}else {
				System.out.println();
				System.out.println("ESE PI�ON NO EXISTE, SOLO HAY SEIS PLATOS");
				System.out.println();
			}
		}
}
