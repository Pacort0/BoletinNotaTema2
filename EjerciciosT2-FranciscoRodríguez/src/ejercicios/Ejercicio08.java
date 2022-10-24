package ejercicios;

import java.util.Scanner;

/**Las pruebas realizadas han sido ->
 * 
 * 
 * 
 *
 */

public class Ejercicio08 {
	public static void main (String[] args) {
		//Creamos las variables del programa
		double precio;
		int dias;
		int distancia;
		final double descuento = 0.7;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner (System.in);
		
		//Imprimimos los mensajes iniciales y esperamos a la introducción de datos por parte del usuario
		System.out.print("Introduzca la distancia que va a recorrer (km): ");
		//Guardamos los datos en sus variables correspondientes
		distancia = sc.nextInt();
		System.out.print("Introduzca los días de estancia: ");
		dias = sc.nextInt();
		
		//Calculamos el precio del billete basándonos en la distancia a recorrer
		precio = distancia * 2.5;
		
		//Si los requisitos para aplicar el descuento no se cumplen, no se aplica descuento
		if(dias < 7 || distancia < 800) {
			System.out.print("No se le aplica descuento a su billete."
					+ " \nPrecio del billete: " + precio + " euros.");
		}
		//Si coinciden, se aplica un 30% de descuento usando la variable estática 'descuento'
		else if (dias > 7 && distancia > 800){
			System.out.print("Se le aplicará a su billete un descuento del 30%."
					+ " \nPrecio del billete: " + precio * descuento + " euros.");
		}
		//Cerramos el escáner
		sc.close();
	}
}