/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio_7 {

	/*
	 * EJERCICIO 7
	 * Dado el siguiente array crear un bloque de código que sume todas las componentes del array, 
	 * para ello hacer uso de un bucle que vaya obteniendo todos los valores del array
	 * float[] decimales = new float[]{3.4F,5.67F,12.0F,3.141615F,0.0F};
	 */
	
	public static void main(String[] args) {

		// Añado el array
		float[] decimales = new float[]{3.4F,5.67F,12.0F,3.141615F,0.0F};
		
		// Creo una variable para poder ir sumando y guardando el resultado
		float contador = 0;
		
		// Recorro el array con un bucle for each
		for(float decimal : decimales) {
			// En cada iteracion sumo a contador el valor de decimal
			contador += decimal;
		}
		
		System.out.println("La suma de todos los elementos es: " + contador);
		
	}

}
