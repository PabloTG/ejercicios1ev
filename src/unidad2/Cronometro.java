package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		// Controlo el momento en que se inicia el programa.
		long comienzo = System.currentTimeMillis();
		// Uso BufferedReader para recibir datos
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		// Solicito el nombre.
		System.out.println("Dime tu nombre: ");
		// Declaro e inicializo nombre.
		String nombre = entrada.readLine();
		// Controlo el momento en que el nombre está escrito.
		long fin = System.currentTimeMillis();
		// Calculo el tiempo que llevó escribir el nombre.
		long tiempo = fin - comienzo;
		/* Muestro el mensaje con tres cifras en la parte decimal del número. La división
		 trunca el número, con lo que siempre se obtendrían cantidades enteras de segundos -  
		 por eso uso este formato tan poco elegante para la salida. */
		System.out.println("Hola, " + nombre + ", has tardado " + (tiempo / 1000) + "," + 
		(tiempo - (tiempo / 1000) * 1000) + " segundos en decirme tu nombre.");

	}

}
