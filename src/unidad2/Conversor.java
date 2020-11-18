package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Conversor {

	public static void main(String[] args) throws IOException {
		//uso BufferedReader para recibir datos siguiendo la recomendaci�n del enunciado
		BufferedReader cantidadAConvertir = new BufferedReader(new InputStreamReader(System.in));
		//solicito la entrada del n�mero a convertir
		System.out.println("Introduzca la cantidad de euros a convertir a d�lares: ");
		//declaro e inicializo euros, convirtiendo la String a Double
		double euros = Double.parseDouble(cantidadAConvertir.readLine());
		/*declaro dolares y realizo la conversi�n (utilizo un tipo fijado de antemano porque si 
		 solicito tambi�n el tipo en realidad estoy programando una calculadora que s�lo 
		 multiplica. 1� = $1,19 es correcto a 18 de noviembre de 2020)*/
		double dolares = euros * 1.19;
		//muestro el resultado con dos cifras decimales
		DecimalFormat mostrar = new DecimalFormat("#.00");
		System.out.println(euros + "� son $" + mostrar.format(dolares) + " utilizando un tipo "
				+ "de cambio de 1,19 d�lares por euro.");

	}

}
