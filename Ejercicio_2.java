/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio_2 {
	
	/*
	 * EJERCICIO 2
	 * Crear un bloque de código que lea las componentes de un array de enteros y me pinte cuales con pares, 
	 * cuales impares y cuales con múltiplos de tres. Para este ejercicio utilizar un bucle que recorra el array y 
	 * utilizar el operador %.
	 */

	public static void main(String[] args) {
		
		// Array de tipo int
		int[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		// Utilizo un bucle for para rrecorrer el array
		for (int i = 0; i < enteros.length; i++) {
			// Si i modulo 2 es igual a 0
			if (i % 2 == 0) {
				System.out.println("Número par:" + i);
			// Si i modulo 2 NO es igual a 0
			} else {
				// Si i modulo 3 es igual a 0
				if (i % 3 == 0) {
					System.out.println("Número multiplo de 3 e impar:" + i);
				} else {
					System.out.println("Número impar:" + i);
				}
			}
			
		}

	}

}
