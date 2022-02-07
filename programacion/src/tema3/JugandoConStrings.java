package tema3;

public class JugandoConStrings {
	public static void main(String[] args) {

		String frase1 = "";
		String frase2 = "";

		System.out.println("** Metodo Length() **");
		frase1 = "Esta cadena tiene como numero de caracteres: ";
		System.out.println(frase1);
		System.out.println(frase1.length() + 1);

		System.out.println("\n** Metodo charAt() **");
		frase1 = "Obtengo el caracter numero 6: ";
		System.out.println(frase1);
		System.out.print(frase1.charAt(6));

		System.out.println("\n** Metodo Equals() **");
		frase1 = "Tengo una frase";
		System.out.println(frase1);
		frase2 = "Tengo UNA frase";
		System.out.println(frase2);
		System.out.println("�Son iguales?");
		System.out.println(frase1.equals(frase2));

		System.out.println("\n** Metodo EqualsIgnoreCase() **");
		System.out.println(frase1);
		System.out.println(frase2);
		System.out.println("�Son iguales a pesar de las mayusculas?");
		System.out.println(frase1.equalsIgnoreCase(frase2));

		System.out.println("\n** Metodo CompareTo() **");
		frase1 = "Frase con e";
		System.out.println(frase1);
		frase2 = "Frase con a";
		System.out.println(frase2);
		System.out.println("La distancia entre caracteres distintos (e - a): ");
		System.out.println(frase1.compareTo(frase2));

		System.out.println("\n** Metodo CodePointAt() - Codigos UNICODE **");
		frase1 = "A y b estan en esta frase";
		System.out.println(frase1);
		System.out.println("Valor de A:" + frase1.codePointAt(0));
		System.out.println("Valor de a:" + frase1.codePointAt(4));

		System.out.println("\n** Metodo IndexOf() **");
		frase1 = "Primera posicion del caracter s: ";
		System.out.println(frase1);
		System.out.println(frase1.indexOf('s'));

		System.out.println("\n** Metodo LastIndexOf() **");
		frase1 = "Ultima posicion del caracter r:";
		System.out.println(frase1);
		System.out.println(frase1.lastIndexOf('r'));
		System.out.println("La frase tenia: " + frase1.length());

		System.out.println("\n** MAS IndexOf() **");
		frase1 = "Posicion del substring DEL: ";
		System.out.println(frase1);
		System.out.println(frase1.indexOf("del"));

	}
}
