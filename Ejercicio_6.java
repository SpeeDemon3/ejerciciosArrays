/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio_6 {

	public static void main(String[] args) {

		/*
		 * EJERCICIO 6
		 * Dado el siguiente array, crear un bloque de código que pinte, SOLO, las consonantes que existan en dicho array
		 * char[] letras = new char[]{‘2′,’f’,’f’,’u’,’u’,’g’,’h’,’i’,’4′};
		 */
		
		// Añado el array
		char[] letras = new char[]{'2','f','f','u','u','g', 'h', 'i', '4'};

		System.out.println("Las consonatas que contiene el array son:");
		
		for(char letra : letras) {
			if (letra == 'f') {
				System.out.println(letra);
			} else if (letra == 'g') {
				System.out.println(letra);
			} else if (letra == 'h') {
				System.out.println(letra);
			}
		}
		
	}

}
