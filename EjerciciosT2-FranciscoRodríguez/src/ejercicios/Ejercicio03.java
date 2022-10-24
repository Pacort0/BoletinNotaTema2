package ejercicios;

import java.util.Scanner;

/**Las pruebas realizadas han sido->
 * No hay animales o menores a 0:
 * animales = 0
 * ingieren = 50
 * compra = 40
  ->Valores introducidos incorrectos.
  
 * No hay comida comprada o menor a 0:
 * compra = 0
 * ingieren = 50
 * animales = 12
  ->Valores introducidos incorrectos.
  
 * No comen nada o menor a 0:
 * ingieren = 0
 * animales = 12
 * compra = 40
  ->Valores introducidos incorrectos.
  
 *Hay comida suficiente:
 *animales = 12
 *ingieren = 50
 *compra = 60
 ->Con la cantidad de comida comprada hoy es suficiente para que cada animal consuma sus " + ingieren/animales + " kilos"
						+ " de comida diaria.
						
 *No hay comida suficiente:
 *animales = 12
 *ingieren = 50
 *comida = 40
 *->Con la comida que ha comprado (" + compra + " kilos) no alcanza para que todos los animales consuman sus raciones diarias de "
			                     + ingieren / animales + " kilos de comida." + " \nCada animal podrá comer unos " + compra / animales + " kilos de comida.
 */

public class Ejercicio03 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		double compra;
		int animales;
		double ingieren;
		
		//Creamos el escáner
		Scanner sc = new Scanner (System.in);
		
		//Imprimimos tres mensajes, en cada uno esperamos a que el usuario introduzca un valor y los guardamos en variables distintas
		System.out.println("Introduzca la cantidad de comida que ingieren sus animales (kg): ");
		ingieren = sc.nextDouble();
		System.out.println("Introduzca la cantidad de comida que se ha comprado (kg): ");
		compra = sc.nextDouble();
		System.out.println("Introduzca la cantidad de animales que posee en su granja: ");
		animales = sc.nextInt();
		
		//Si el usuario ha introducido 0 animales, imprime un mensaje de error
		if (animales == 0 || compra == 0 || ingieren == 0) {
			System.out.println("Valores introducidos incorrectos.");
		}
		
		//Si los valores están en orden:
		else {
			//Si la compra es superior a la cantidad que ingieren todos los animales, imprime un mensaje y se acaba el programa
			if(compra > ingieren) {
				System.out.println("Con la cantidad de comida comprada hoy es suficiente para que cada animal consuma sus " + ingieren/animales + " kilos"
						+ " de comida diaria.");
			}
			//De no ser así, se imprime que no hay suficiente comida para los animales, se calcula la ración a la que cabría cada animal y se acaba el programa
			else {
				System.out.println("Con la comida que ha comprado (" + compra + " kilos) no alcanza para que todos los animales consuman sus raciones diarias de "
			                     + ingieren / animales + " kilos de comida." + " \nCada animal podrá comer unos " + compra / animales + " kilos de comida.");
			}
		}
		//Se cierra el escáner
		sc.close();
	}

}
