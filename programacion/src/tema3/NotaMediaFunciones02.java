package tema3;



	public class NotaMediaFunciones02 {

		static float hazMedia(float dato1, float dato2){
			return ((dato1 + dato2) / 2);
		}
		
		public static void main(String[] args){

			// 1ª FORMA DE USAR FUNCIONES

			float examen1 = 4;
			float examen2 = 7;
			float media1 = hazMedia (examen1, examen2);
			System.out.println("media1 = " + media1);

			// 2ª FORMA DE USAR FUNCIONES

			// float examen3 = 9;
			// float examen4 = 6;
			float media2 = hazMedia (9, 6);
			System.out.println("media2 = " + media2);

			// 3ª FORMA DE USAR FUNCIONES

			// float examen5 = 10;
			// float examen6 = 8;
			// float media1 = (examen5 + examen6) / 2;
			System.out.println("media3 = " + hazMedia(10, 8));

		}
	}