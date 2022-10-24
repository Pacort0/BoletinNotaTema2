package ejercicios;

import java.util.Scanner;
/**Las pruebas realizadas han sido->
 * Para probar números negativos:
 * -65 ->El valor absoluto del número introducido es: |65|
 * -1 ->El valor absoluto del número introducido es: |1|
 * -36346->El valor absoluto del número introducido es: |36346|
 
 *Para probar números positivos:
 *76 ->El valor absoluto del número introducido es: |76|
 *4 ->El valor absoluto del número introducido es: |4|
 *44232 ->El valor absoluto del número introducido es: |44232|
 */

public class Ejercicio05 {

	public static void main(String[] args) {
		//Creamos la variable
		int num;
		
		//Creamos el escáner
		Scanner sc = new Scanner (System.in);
		
		//Imprimimos el mensaje inicial y esperamos a que se introduza un valor
		System.out.print("Introduzca un número entero: ");
		//Guardamos el valor introducido en la variable 'num'
		num = sc.nextInt();
		
		//Usamos un operador ternario para determinar si el numero es positivo o negativo y, en caso negativo, lo multiplicamos por -1
		num = num > 0 ? num : num*-1;
		
		//Imprimimos el mensaje final con el valor absoluto del número
		System.out.print("El valor absoluto del número introducido es: |" + num + "|");
		
		//Cerramos el escáner
		sc.close();
	}

}
