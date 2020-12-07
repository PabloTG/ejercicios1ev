package unidad3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		// declaro las variables que voy a necesitar.
		int aciertos = 0, fallos = 0, repetir;
		do {
			// solicito la tabla a repasar y la acepto con Scanner.
			System.out.println("¿Qué tabla quieres repasar?");
			Scanner entrada = new Scanner(System.in);
			int multiplicador = entrada.nextInt();
			// pregunto y creo la tabla con un bucle.
			// Técnicamente sirve para todos los números; se podría implementar
			// un if como el del final para limitarlo del 1 al 9.
			for (int multiplicando = 1; multiplicando <= 10; multiplicando++) {
				System.out.println("¿Cuánto es " + multiplicador + " por " + multiplicando + "?");
				int respuesta = entrada.nextInt();
				if (respuesta == multiplicador * multiplicando) {
					aciertos++;
					System.out.println("La respuesta " + respuesta + " es correcta.");
				} // fin del if.
				else {
					fallos++;
					System.out.println("La respuesta correcta es " + (multiplicador * multiplicando));
				} // fin del else.
			} // fin del for.
			System.out.println("Has acertado " + aciertos + " multiplicaciones, " + "y has fallado " + fallos + ".");
			if (fallos <= 1)
				System.out.println("Has aprobado.");
			else
				System.out.println("Has suspendido.");
			System.out.println("¿Quieres repasar otra tabla?\nPulsa \"S\" para repasar otra tabla.\n"
					+ "Pulsa cualquier otra tecla para cerrar el programa.");
			if (entrada.next().equalsIgnoreCase("S")) {
				repetir = 1;
			} else {
				repetir = 0;
				entrada.close();
			}
		} // fin del do.
		while (repetir == 1);
	} // fin del método main.

} // fin de la clase.
