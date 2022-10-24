package ejercicios;

import java.util.Scanner;

/**Las pruebas realizadas han sido->
 * Para comprobar el rango:
 * -4 ->Número introducido incorrecto.
 * 524 ->Número introducido incorrecto.
 
 * Para números con terminaciones únicas:
 * 10 ->diez
 * 15 ->quince
 * 4 ->cuatro
 * 80 ->ochenta
 
 *Para números que siguen un patrón:
 *16 ->dieciseis
 *75 ->setenta y cinco
 *32  ->treinta y dos
 */

public class Ejercicio04 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		int num;
		int unidades;
		int decenas;
		int cifras = 0;
		String cadenaNumero1 = "";
		String cadenaNumero2 = "";
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner (System.in);
		
		//Imprimimos el mensaje inicial y esperamos a que se introduzca un valor
		System.out.print("Introduzca un número entero entre 0 y 99: ");
		//Guardamos el valor en la variable 'num'
		num = sc.nextInt();
		
		//Si el número está fuera de rango, se imprime un mensaje de error y se acaba el programa
		if (num < 0 || num >= 100) {
			System.out.print("Número introducido incorrecto.");
		}
		 //Si el número se encuentra entre el 1 y el 9, tiene una cifra
		if(num > 0 && num < 10) {
			cifras = 1;
		}
		//Si el número se encuentra entre el 10 y el 99, tiene dos cifras
		if (num >= 10 && num <100) {
			cifras = 2;
		}
		
		//El valor de las unidades del número introducido es igual al resto de dividir éste entre 10
		unidades = num % 10;
		//El valor de las unidades del número introducido es igual al resultado de dividir éste entre 10
		decenas = num / 10;
		
		//Si las unidades valen 0:
		if (unidades == 0) {
			//Según el valor de las decenas, el número será uno u otro
			//Por ejemplo, las decenas valen 1, el número es 10. Y así con todas las decenas
			if (decenas == 1) {
				cadenaNumero1 = "diez.";
			}
			else if (decenas == 2) {
				cadenaNumero1 = "veinte.";
			}
			else if (decenas == 3) {
				cadenaNumero1 = "treinta.";
			}
			else if (decenas == 4) {
				cadenaNumero1 = "cuarenta.";
			}
			else if (decenas == 5) {
				cadenaNumero1 = "cincuenta.";
			}
			else if (decenas == 6) {
				cadenaNumero1 = "sesenta.";
			}
			else if (decenas == 7) {
				cadenaNumero1 = "setenta.";
			}
			else if (decenas == 8) {
				cadenaNumero1 = "ochenta.";
			}
			else if (decenas == 9) {
				cadenaNumero1 = "noventa.";
			}
			//Imprimimos el número y se acaba el programa
			System.out.print("El númeron introducido es " + cadenaNumero1);
		}
		//Si el número se encuentra entre el 11 y el 15:
		else if(num > 10 && num < 16) {
			//En función de cuál sea el número, se imprime uno u otro
			if (num == 11) {
				cadenaNumero1 = "once.";
			}
			if (num == 12) {
				cadenaNumero1 = "doce.";
			}
			if (num == 13) {
				cadenaNumero1 = "trece.";
			}
			if (num == 14) {
				cadenaNumero1 = "catorce.";
			}
			if (num == 15) {
				cadenaNumero1 = "quince.";
			}
			//Imprimimos el número y se acaba el programa
			System.out.print("El número introducido es " + cadenaNumero1);
		}
		
		//Si no se da ninguno de estos casos "excepcionales":
		else {
			//Le asignaremos un valor a 'cadenaNumero1' en función del valor de las unidades.
			cadenaNumero1 = switch(unidades) {
			//Por ejemplo, si 'unidades' = 1, cadenaNumero1 valdrá "uno", y así con todas las unidades
				case 1 -> {
					yield "uno.";
				}
				case 2 -> {
					yield "dos.";
				}
				case 3 -> {
					yield "tres.";
				}
				case 4 -> {
					yield "cuatro.";
				}
				case 5 -> {
					yield "cinco.";
				}
				case 6 -> {
					yield "seis.";
				}
				case 7 -> {
					yield "siete.";
				}
				case 8 -> {
					yield "ocho.";
				}
				case 9 -> {
					yield "nueve.";
				}
				default -> {
					yield "";
				}
			};
			
			//Repetimos el proceso con la segunda cadena, pero ésta cambiará según las decenas
			cadenaNumero2 = switch(decenas) {
			//Si las decenas = 1, 'cadenaNumero2' valdrá "dieci", y así con todas las decenas
				case 1 -> {
					yield "dieci";
				}
				case 2 -> {
					yield "veinti";
				}
				case 3 -> {
					yield "treinta y ";
				}		
				case 4 -> {
					yield "cuarenta y ";
				}		
				case 5 -> {
					yield "cincuenta y ";
				}		
				case 6 -> {
					yield "sesenta y ";
				}		
				case 7 -> {
					yield "setenta y ";
				}		
				case 8 -> {
					yield "ochenta y ";
				}		
				case 9 -> {
					yield "noventa y ";
				}
				default -> {
					yield "";
				}
			};
			
			//Si el número tiene una cifra, imprime solo la cadena de las unidades
			if (cifras == 1){
				System.out.print("El número introducido es " + cadenaNumero1);
			}
			//Si el número tiene dos cifras, imprime las dos cadenas (D + U) concatenadas.
			else if (cifras == 2) {
				System.out.print("El número introducido es " + cadenaNumero2 + cadenaNumero1);
			}
		}
		//Cerramos el escáner
		sc.close();
	}

}
