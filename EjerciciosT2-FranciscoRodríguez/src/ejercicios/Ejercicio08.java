package ejercicios;

import java.util.Scanner;

/**Las pruebas realizadas han sido ->
 * Distancia introducida menor o igual a 0:
 * Distancia = -1
 * Días de estancia = 5
 * -> Valores introducidos incorrectos.
 
 * Días de estancia introducidos incorrectos:
 * Distancia = 50
 * Días de estancia = -23 
 * -> Valores introducidos incorrectos.
 * 
 * Datos correctos pero no se aplica descuento:
 * Distancia = 35
 * Días de estancia = 1
 * -> No se le aplica descuento a su billete. 
	  Precio del billete: 87.5 euros.
 
 * Datos correctos y sólo se cumple un requisito para el descuento:
 * Distancia = 850
 * Días de estancia = 6 
 * -> No se le aplica descuento a su billete. 
	  Precio del billete: 2125.0 euros.
 
 * Datos correctos y sólo se cumple el otro requisito para el descuento:
 * Distancia = 650
 * Días de estancia = 9
 * -> No se le aplica descuento a su billete. 
	  Precio del billete: 1625.0 euros.
 
 * Datos correctos y se puede aplicar descuento:
 * Distancia = 850
 * Días de estancia = 8
 * -> Se le aplicará a su billete un descuento del 30%. 
	  Precio del billete: 1487.5 euros.
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
		//Guardamos el valor en la variable 'distancia'
		distancia = sc.nextInt();
		System.out.print("Introduzca los días de estancia: ");
		//Guardamos el valor en la variable 'dias'
		dias = sc.nextInt();
		
		if (distancia <= 0 || dias <= 0) {
			System.out.print("Valores introducidos incorrectos.");
		}
		
		else {
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
		}
		//Cerramos el escáner
		sc.close();
	}
}
