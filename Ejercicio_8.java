/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio_8 {

	/*
	 * EJERCICIO 8
	 * Dado el siguiente array de números, crear un bloque de código que sume por un lado solo los números pares 
	 * y devuelva el resultado y por otro solo los impares y también pinte el resultado
	 * int[] numeros = new int[]{1,2,7,3,4,65,23,78,98,34,342,45,57};
	 */
	
	public static void main(String[] args) {
		
		// Añado el array
		int[] numeros = new int[]{1,2,7,3,4,65,23,78,98,34,342,45,57};
		
		// Creo 2 variables para guardar el resultado
		int pares = 0, impares = 0;
		
		for (int num : numeros) {
			
			if (num % 2 == 0) { // Si el numero es par
				pares += num;
			} else { // Si el numero es impar
				impares += num;
			}
			
		}
		
		// Imprimo los 2 resultados
		System.out.println("La suma de los numeros pares es:" + pares);
		System.out.println("La suma de los numeros pares es:" + impares);
		
	}

}
