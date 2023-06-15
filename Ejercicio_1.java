/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio_1 {
	
	/**
	 * EJERCICIO 1
	 * Crear un bloque de código que pinte las vocales y solo las vocales que existen en un array de caracteres. 
	 * El programa debe de ir comprobando, con un bucle, para determinar si cada carácter del array es o no una vocal.
	 */
	
	public static void main(String[] args) {

		// Creo un array de tipo char con todas las letras del abecedario español en mayusculas y minusculas
		char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 
				'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		System.out.println("Las vocales que contiene el array son:");
		
		// Utilizando un bucle for recorro el array
		for (int i = 0; i < abecedario.length; i++) {
			// Cada caracter representa un numero, por lo que se pueden compara utilizando == para hacer las comprobaciones
			if(abecedario[i] == 'a' || abecedario[i] == 'A') {
				System.out.println(abecedario[i]);
			} else if(abecedario[i] == 'e' || abecedario[i] == 'E') {
				System.out.println(abecedario[i]);
			} else if (abecedario[i] == 'i' || abecedario[i] == 'I') {
				System.out.println(abecedario[i]);
			} else if (abecedario[i] == 'o' || abecedario[i] == 'O') {
				System.out.println(abecedario[i]);
			} else if (abecedario[i] == 'u' || abecedario[i] == 'U') {
				System.out.println(abecedario[i]);
			}
			
		}

		
		
	}
	
	
}
