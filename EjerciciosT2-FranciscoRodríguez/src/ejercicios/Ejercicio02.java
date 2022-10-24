package ejercicios;

import java.util.Scanner;

/**
 * Las pruebas realizadas han sido->
 * Para comprobar el rango:
 * 5431528 ->DNI introducido incorrecto.
 * 8765064389 ->DNI introducido incorrecto.
 
 * Para comprobar funcionamiento:
 * 29504688 -> N
 * 76549876 -> B
 */

public class Ejercicio02 {

	public static void main(String[] args) {
		//Creamos las variables del programa 
		int DNI;
		int resto;
		String letra;
		
		//Creamos el escáner
		Scanner sc = new Scanner (System.in);
		
		//Imprimimos el mensaje principal y esperamos a que se introduzcan los datos por consola
		System.out.print("Introduzca su número del DNI: ");
		//Guardamos el valor introducido en la variable DNI
		DNI = sc.nextInt();
		
		//Si el DNI introducido no tiene 8 dígitos, no es correcto y se acaba el programa. 
		if(DNI<9999999 || DNI>99999999) {
			System.out.print("DNI introducido incorrecto.");
		}
		
		else {
		//Dividimos el DNI introducido entre 23 y nos quedamos con el resto
		resto = DNI % 23;
		
		//Le asignaremos un valor a la variable "letra" en función del valor que esté guardado en "resto"
		letra = switch (resto) {
		//Por ejemplo, si resto = 0, letra = T
		case 0 -> {
				yield "T";
			}
		case 1 -> {
			yield "R";
		}
		case 2 -> {
			yield "W";
		}
		case 3 -> {
			yield "A";
		}
		case 4 -> {
			yield "G";
		}
		case 5 -> {
			yield "M";
		}
		case 6 -> {
			yield "Y";
		}
		case 7 -> {
			yield "F";
		}
		case 8 -> {
			yield "P";
		}
		case 9 -> {
			yield "D";
		}
		case 10 -> {
			yield "X";
		}
		case 11-> {
			yield "B";
		}
		case 12-> {
			yield "N";
		}
		case 13-> {
			yield "J";
		}
		case 14-> {
			yield "Z";
		}
		case 15 -> {
			yield "S";
		}
		case 16-> {
			yield "Q";
		}
		case 17-> {
			yield "V";
		}
		case 18-> {
			yield "H";
		}
		case 19-> {
			yield "L";
		}
		case 20-> {
			yield "C";
		}
		case 21-> {
			yield "K";
		}
		case 22-> {
			yield "E";
		}
		//Si ninguno de los valores anteriores es el guardado en la variable "resto", imprime un mensaje de error
			default ->{
				System.out.print("El número introducido es incorrecto.");
				yield "";
			}
		};
		//Imprimimos el mensaje final
		System.out.print("La letra de su DNI es " + letra);
		}
		//Cerramos el escáner
		sc.close();
	}

}
