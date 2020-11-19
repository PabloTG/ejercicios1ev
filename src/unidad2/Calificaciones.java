package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Calificaciones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Solicitar� los datos necesarios de nuevo mediante BufferedReader.
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		// Declaro y almaceno las notas tras pedirlas.
		System.out.println("Introduce la calificaci�n del examen de Matem�ticas: ");
		float examenMates = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificaci�n de la primera tarea de Matem�ticas: ");
		float primeraMates = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificaci�n de la segunda tarea de Matem�ticas: ");
		float segundaMates = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificaci�n de la tercera tarea de Matem�ticas: ");
		float terceraMates = Float.parseFloat(entrada.readLine());
		
		System.out.println("Introduce la calificaci�n del examen de F�sica: ");
		float examenFisica = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificaci�n de la primera tarea de F�sica: ");
		float primeraFisica = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificaci�n de la segunda tarea de F�sica: ");
		float segundaFisica = Float.parseFloat(entrada.readLine());
		
		System.out.println("Introduce la calificaci�n del examen de Qu�mica: ");
		float examenQuimica = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificaci�n de la primera tarea de Qu�mica: ");
		float primeraQuimica = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificaci�n de la segunda tarea de Qu�mica: ");
		float segundaQuimica = Float.parseFloat(entrada.readLine());
		System.out.println("Introduce la calificaci�n de la tercera tarea de Qu�mica: ");
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
		System.out.println("\nTu nota de Matem�ticas ser� un " + mostrar.format(notaMates) + ".");
		System.out.println("Tu nota de F�sica ser� un " + mostrar.format(notaFisica) + ".");
		System.out.println("Tu nota de Qu�mica ser� un " + mostrar.format(notaQuimica) + ".");
	}

}
