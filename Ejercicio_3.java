/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio_3 {

	/*
	 * EJERCICIO 3
	 * Crear un bucle que pinte por consola todas las componentes de un array en orden inverso 
	 * a como están guardadas en el array
	 */
	public static void main(String[] args) {
		
		// Creo un array de numeros
		int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Recorro el array utilizando un bucle for empezando por el final
			// Asigno a i el numero de elementos que contiene el array
				// Mientras i sea mayor a 0 
					// Resto 1 a i
		for (int i = numeros.length; i > 0; i--) {
			System.out.println(i); // Imprimo el valor de i en cada iteracion
		}
		
	}
	
}
