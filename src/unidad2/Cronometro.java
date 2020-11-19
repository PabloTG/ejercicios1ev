package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		/* Controlo el momento en que se inicia el programa, gracias a System
		(https://docs.oracle.com/javase/8/docs/api/java/lang/System.html). */
		long comienzo = System.currentTimeMillis();
		// Uso BufferedReader para recibir datos (como en ejercicios anteriores).
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		// Solicito el nombre.
		System.out.println("Dime tu nombre: ");
		// Declaro e inicializo nombre.
		String nombre = entrada.readLine();
		// Controlo el momento en que el nombre está escrito.
		long fin = System.currentTimeMillis();
		// Calculo el tiempo que llevó escribir el nombre.
		float tiempo = fin - comienzo;
		/* Muestro el mensaje con tres cifras en la parte decimal del número. La división entre
		 mil es para generar el resultado en segundos, siguiendo el enunciado. Las tres cifras
		 decimales aparecerán por definición, al tratarse de milisegundos. */
		System.out.println("Hola, " + nombre + ", has tardado " + tiempo / 1000 + 
				" segundos en decirme tu nombre.");

	}

}
