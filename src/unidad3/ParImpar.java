package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// solicito el número a comprobar.
		System.out.println("Introduzca el número a comprobar:");
		// declaro el número a comprobar, introducido mediante teclado.
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		// compruebo si el número introducido es par mirando el resto de su división
		// entre dos.
		if (numero % 2 == 0)
			// si el resto es cero, el número es par.
			System.out.println("El número " + numero + " es par.");
		else
			// si no, es impar.
			System.out.println("El número " + numero + " es impar.");
		// cierro el Scanner para quitar el aviso de Eclipse.
		entrada.close();

	}

}
