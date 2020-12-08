package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		// declaro las variables que necesitar� y genero el n�mero
		Random aleatorio = new Random();
		int limiteSuperior = (aleatorio.nextInt(100)+1)*1000;
		int numeroElegido = aleatorio.nextInt(limiteSuperior)+1;
		int intento;
		// muestro el mensaje por pantalla
		System.out.println("He pensado un n�mero entre 1 y " +
				limiteSuperior + ", adivina cu�l es.");
		// acepto intentos por teclado mediante Scanner
		Scanner entrada = new Scanner(System.in);
		// uso un bucle para los intentos
		do {
			System.out.println("�Qu� n�mero crees que es?");
			intento = entrada.nextInt();
			if (intento == numeroElegido)
				System.out.println("�Enhorabuena! Has acertado.");
			else if (intento < numeroElegido)
				System.out.println("Lo siento, el n�mero elegido es mayor que " + intento);
			else System.out.println("Lo siento, el n�mero elegido es menor que " + intento);
		} //fin do
		while (intento != numeroElegido);
		entrada.close();
	}

}
