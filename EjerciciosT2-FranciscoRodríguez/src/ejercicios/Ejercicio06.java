package ejercicios;

import java.util.Scanner;
/**Las pruebas realizadas han sido->
 * 1. Números obtenidos: 28 + 54
 * ->Suma introducida (correcta): 82
 * ->Respuesta obtenida: "¡Correcto! El resultado de la suma es 85 ;)"
 
 * 2. Números obtenidos: 32 + 36
 *->Suma introducida (incorrecta): 93
 *->Respuesta obtenida: "Lo siento, el resultado de la suma no es 93 :("
 */

public class Ejercicio06 {

	public static void main(String[] args) {
		//Creamos los números aleatorios usando 'math.random' y multiplicándolos por 100
		double numeroAleatorio1 = Math.random()*100;
		double numeroAleatorio2 = Math.random()*100;
		//Creamos las variables del programa
		int suma;
		int sumaUs;
		
		//Creamos el escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el mensaje inicial con los dos números aleatorios casteados a int para que no nos dé decimales
		System.out.println("Debe usted sumar los dos siguientes números: " + (int)numeroAleatorio1 + " + " + (int)numeroAleatorio2);
		//Esperamos a que el usuario sume los números e imprimimos el siguiente mensaje
		System.out.print("Introduzca el resultado de la suma aquí: ");
		//Guardamos el resultado de la suma del usuario
		sumaUs = sc.nextInt();
		
		//Sumamos nosotros los números
		suma = (int)numeroAleatorio1 + (int)numeroAleatorio2;
		//Si los valores de ambas sumas son iguales, el resultado es correcto. Imprimimos un mensaje y se acaba el programa
		if(suma == sumaUs) {
			System.out.print("¡Correcto! El resultado de la suma es " + sumaUs + " ;)");
		}
		//Si no, es erróneo. Imprimimos un mensaje diferente y se acaba el programa
		else {
			System.out.print("Lo siento, el resultado de la suma no es " + sumaUs + " :(");
		}
		//Cerramos el escáner
		sc.close();
	}

}
