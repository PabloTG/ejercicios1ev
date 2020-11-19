package unidad2;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		/* Declaro variables para el sueldo y las comisiones, aceptando sus
		valores por teclado. */
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca su sueldo base: ");
		float sueldo = entrada.nextFloat();
		
		System.out.println("Por favor, introduzca el importe de su primera venta: ");
		float venta1 = entrada.nextFloat();
		System.out.println("Por favor, introduzca el importe de su segunda venta: ");
		float venta2 = entrada.nextFloat();
		System.out.println("Por favor, introduzca el importe de su tercera venta: ");
		float venta3 = entrada.nextFloat();
		
		// Calculo el porcentaje ganado por las comisiones
		float comisiones = (float) (0.1 * (venta1 + venta2 + venta3));
		
		// Muestro las ganancias totales y desglosadas.
		System.out.println("Su sueldo total será " + (sueldo + comisiones) + "€." + 
				" Lo correspondiente al sueldo base son " + sueldo + "€ y a las comisiones " + 
				comisiones + "€.");

	}

}
