package unidad2;

import java.util.Scanner;

public class ColoresYIQ { 
	/*Aunque el enunciado pedía llamarla Sueldo, preferí usar un nombre distinto
	 para evitar problemas. */

	public static void main(String[] args) {
		// Declaro variables y las inicializo con valores que acepto por teclado.
		Scanner entradaDeDatos = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca la componente R del color: ");
		float componenteR = entradaDeDatos.nextFloat();
		System.out.println("Por favor, introduzca la componente G del color: ");
		float componenteG = entradaDeDatos.nextFloat();
		System.out.println("Por favor, introduzca la componente B del color: ");
		float componenteB = entradaDeDatos.nextFloat();
		
		//Declaro las variables YIQ y las calculo.
		float componenteY = (float) (0.299 * componenteR + 0.587 * componenteG + 0.114 * componenteB);
		float componenteI = (float) (0.596 * componenteR - 0.275 * componenteG - 0.321 * componenteB);
		float componenteQ = (float) (0.212 * componenteR - 0.528 * componenteG + 0.311 * componenteB);

		// Muestro por pantalla las componentes YIQ del color.
		System.out.println("\nLas componentes YIQ del color proporcionado son:\n" + 
		"Componente Y: " + componenteY + ".\nComponente I: " + componenteI + 
		".\nComponente Q: " + componenteQ + ".");
	}

}
