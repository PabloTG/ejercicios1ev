package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		// Solicito el año a comprobar y lo acepto con Scanner.
		System.out.println("Introduzca el año a comprobar:");
		Scanner entrada = new Scanner(System.in);
		// El año a comprobar está en inglés porque suena mejor que en español...
		// No me atrevo a usar eñes en el código, por si acaso.
		int year = entrada.nextInt();
		// Tengo que comprobar si es divisible entre 4 y entre 400 con una sola
		// expresión lógica.
		if ((year % 4 == 0 && year % 100 != 0) ^ year % 400 == 0) {
			System.out.println("El año " + year + " es bisiesto.");
		} // fin del if.
		else {
			System.out.println("El año " + year + " no es  bisiesto.");
		} // fin del else.
		entrada.close();
	} // fin del método main.

} // fin de la clase.
