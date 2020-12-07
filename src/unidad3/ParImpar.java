package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// solicito el n�mero a comprobar.
		System.out.println("Introduzca el n�mero a comprobar:");
		// declaro el n�mero a comprobar, introducido mediante teclado.
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		// compruebo si el n�mero introducido es par mirando el resto de su divisi�n
		// entre dos.
		if (numero % 2 == 0)
			// si el resto es cero, el n�mero es par.
			System.out.println("El n�mero " + numero + " es par.");
		else
			// si no, es impar.
			System.out.println("El n�mero " + numero + " es impar.");
		// cierro el Scanner para quitar el aviso de Eclipse.
		entrada.close();

	}

}
