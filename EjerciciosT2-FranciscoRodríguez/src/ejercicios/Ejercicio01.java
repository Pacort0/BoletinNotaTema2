package ejercicios;

import java.util.Scanner;

/**
 * Las pruebas realizadas han sido->
 * Para comprobar el rango:
 * -65 ->Número introducido fuera de rango.
 * 63563 ->Número introducido fuera de rango.
 
 * Número con una cifra:
 * 5 ->El número es capicúa.
 * 8 ->El número es capicúa.
 
 * Número con dos cifras:
 * 66 ->El número es capicúa.
 * 54 ->El número no es capicúa
 * 98 ->El número no es capicúa
 * 33 ->El número es capicúa.
 
 * Número con tres cifras:
 * 656 ->El número es capicúa.
 * 452 ->El número no es capicúa
 * 978 ->El número no es capicúa
 * 505 ->El número es capicúa.
 
 * Número con cuatro cifras:
 * 6556 ->El número es capicúa.
 * 3433->El número no es capicúa
 * 9894 ->El número no es capicúa
 * 1111 ->El número es capicúa.
 */

public class Ejercicio01 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		int num, resto, millar, centena, decena, unidad;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner (System.in);
		
		//Imprimimos el mensaje inicial y esperamos a la introducción de datos por teclado del usuario
		System.out.print("Introduzca un número entero del 0 al 9999: ");
		//Guardaomos los datos en la variable 'num'
		num = sc.nextInt();
		
		//Si el número no está dentro del rango permitido, imprimimos un mensaje de error
		if(num < 0 || num > 9999) {
			System.out.println("Número introducido fuera de rango.");
		}
		//Si está en rango, continuamos con el programa
		else {
			//Calculamos la cifra de los millares y la guardamos en la variable 'millar'
			//Como las variables están iniciadas en int, no cogerá decimales de las divisiones
			millar = num / 1000;
			resto = num % 1000;
			
			//Calculamos la cifra de las centenas y la guardamos en la variable 'centena'
			centena = resto / 100;
			resto %= 100;
			
			//Calculamos la cifra de las decenas y la guardamos en la variable 'centena'
			decena = resto  / 10;
			
			//Calculamos la cifra de las unidades y la guardamos en la variable 'unidad'
			unidad = num % 10;
			
			//Si el número tiene una cifra, es capicúa
			if(num >= 0 && num < 10) {
				System.out.print("El número es capicúa.");
				//Si el número tiene dos cifras y ambas (decenas y unidades) son iguales, es capicúa
			}
			else if(num >= 10 && num < 100) {
				if (decena == unidad) {
					System.out.print("El número es capicúa.");
				}
				else {
					System.out.print("El número no es capicúa.");
				}
				//Si el número tiene 3 cifras y centenas y unidades coinciden, es capicúa
			}
			else if(num >= 100 && num < 1000) {
				if (centena == unidad) {
					System.out.print("El número es capicúa.");
				}
				else {
					System.out.print("El número no es capicúa.");
				}
				//Si el número tiene 4 cifras y los millares y las unidades son iguales, así como las centenas y decenas, es capicúa
			}
			else {
				if (millar == unidad && centena == decena) {
					System.out.print("El número es capicúa.");
				}
				else {
					System.out.print("El número no es capicúa");
				}
			}
		}
		//Cerramos el escáner
		sc.close();
	}

}
