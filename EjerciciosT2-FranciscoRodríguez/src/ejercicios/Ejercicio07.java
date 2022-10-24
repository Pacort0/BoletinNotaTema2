package ejercicios;

import java.util.Scanner;
/**Las pruebas realizadas han sido->
 * 
 * 
 *
 */

public class Ejercicio07 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		int horas, minutos, segundos;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos los mensajes iniciales, esperando tras cada uno a la introducción de datos por parte del usuario
		System.out.print("Introduzca las horas: ");
		//Guardamos los datos en sus variables correspondientes, una a una.
		horas = sc.nextInt();
		System.out.print("Introduzca los minutos: ");
		minutos = sc.nextInt();
		System.out.print("Introduzca los segundos: ");
		segundos = sc.nextInt();
		
		//Si alguno de los datos introducidos está fuera de rango, imprimimos mensaje de error
		if(horas < 0 || horas >= 24 || segundos > 59 || segundos < 0 || minutos > 59 || minutos < 0) {
			System.out.print("Valores introducidos incorrectos.");
		}
		//Si todo está en orden, proseguimos con el programa
		else {	
			//Si los segundos valen 59 y los minutos valen cualquier valor distinto de 59, se suma un minuto y los segundos pasan a 0
			if (segundos == 59 && minutos != 59) {
				segundos = 00;
				minutos += 1;
				//Si los segundos y los minutos valen 59, la hora incrementa en 1 y segundos y minutos se reinician
			}
			else if (segundos == 59 && minutos == 59) {
				segundos = 00;
				minutos = 00;
				horas += 1;
				//De no ocurrir nada de esto, los segundos valen un segundo más
			}
			else {
				segundos +=1;
			}
			//Si la hora final vale '24', le cambiamos el valor a 0 (doce de la noche)
			if (horas == 24) {
				horas = 0;
			}
			//Imprimimos el mensaje final
		System.out.print("Son las " + horas + " horas " + minutos + " minutos y " + segundos + " segundos.");
		//Cerramos el escáner
		sc.close();
		}
	}

}



