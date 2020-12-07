package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		// Solicito el a�o a comprobar y lo acepto con Scanner.
		System.out.println("Introduzca el a�o a comprobar:");
		Scanner entrada = new Scanner(System.in);
		// El a�o a comprobar est� en ingl�s porque suena mejor que en espa�ol...
		// No me atrevo a usar e�es en el c�digo, por si acaso.
		int year = entrada.nextInt();
		// Tengo que comprobar si es divisible entre 4 y entre 400 con una sola
		// expresi�n l�gica.
		if ((year % 4 == 0 && year % 100 != 0) ^ year % 400 == 0) {
			System.out.println("El a�o " + year + " es bisiesto.");
		} // fin del if.
		else {
			System.out.println("El a�o " + year + " no es  bisiesto.");
		} // fin del else.
		entrada.close();
	} // fin del m�todo main.

} // fin de la clase.
