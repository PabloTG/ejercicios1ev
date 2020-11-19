package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Calificaciones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Solicitaré los datos necesarios de nuevo mediante BufferedReader.
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		// Declaro y almaceno las notas tras pedirlas.
		System.out.println("Introduce la calificación del examen de Matemáticas: ");
		float examenMates = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificación de la primera tarea de Matemáticas: ");
		float primeraMates = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificación de la segunda tarea de Matemáticas: ");
		float segundaMates = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificación de la tercera tarea de Matemáticas: ");
		float terceraMates = Float.parseFloat(entrada.readLine());
		
		System.out.println("Introduce la calificación del examen de Física: ");
		float examenFisica = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificación de la primera tarea de Física: ");
		float primeraFisica = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificación de la segunda tarea de Física: ");
		float segundaFisica = Float.parseFloat(entrada.readLine());
		
		System.out.println("Introduce la calificación del examen de Química: ");
		float examenQuimica = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificación de la primera tarea de Química: ");
		float primeraQuimica = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificación de la segunda tarea de Química: ");
		float segundaQuimica = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificación de la tercera tarea de Química: ");
		float terceraQuimica = Float.parseFloat(entrada.readLine());
		
		// Calculo las calificaciones.
		float notaMates = (float) (0.9 * examenMates + 0.1 * 
				((primeraMates + segundaMates + terceraMates)/3));
		float notaFisica = (float) (0.8 * examenFisica + 0.2 * 
				((primeraFisica + segundaFisica)/2));
		float notaQuimica = (float) (0.85 * examenQuimica + 0.15 * 
				((primeraQuimica + segundaQuimica + terceraQuimica)/3));
		
		// Muestro por consola los resultados con dos posiciones decimales.
		DecimalFormat mostrar = new DecimalFormat("#.00");
		System.out.println("\nTu nota de Matemáticas será un " + mostrar.format(notaMates) + ".");
		System.out.println("Tu nota de Física será un " + mostrar.format(notaFisica) + ".");
		System.out.println("Tu nota de Química será un " + mostrar.format(notaQuimica) + ".");
	}

}
