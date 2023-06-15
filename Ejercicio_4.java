/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio_4 {

	/*
	 * EJERCICIO 4
	 * 
	 * Crear un bloque de código que recorra los siguientes arrays y me cree otro que contenga las componentes de ambos dos. 
	 * Los arrays son los siguientes:
	 * 
	 * int[] array1 = new int[]{1,2,3,4,5};
	 * 
	 * int[] array2 = new int[]{334,23,4}; El array resultado es el siguiente:
	 * 
	 * int[] array3 = new int[]{1,2,3,4,5,334,23,4};
	 */
	
	public static void main(String[] args) {
		
		// Añado los arrays
		
		int[] array1 = new int[]{1,2,3,4,5};

		int[] array2 = new int[]{334,23,4};
		
		// Recorro array1 y array2 con un bucle for each
		
		for(int num : array1) {
			System.out.println(num);
		}
		
		for(int num : array2) {
			System.out.println(num);
		}
		
		// Nuevo array que contendra todos los elementos de los arrays anteriores, siendo un total de 8
		int[] array3 = new int[8];
		
		// (Array origen, posicion de inicio, array destino, posicion desde la que se empieza a copiar, numero de elementos a copiar)
		System.arraycopy(array1, 0, array3, 0, array1.length);
		
		System.arraycopy(array2, 0, array3, 5, array2.length);
		
		System.out.println("\nElementos del nuevo array:");
		
		// Recorro e imprimo el nuevo array3
		for (int num : array3) {
			System.out.println(num);
		}
		
	}
	
}
