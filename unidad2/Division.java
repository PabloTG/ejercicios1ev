package unidad2;

import java.text.DecimalFormat;

public class Division {

	public static void main(String[] args) {
// Declaro dividendo y divisor y los inicializo a los números que me interesan.
double dividendo = 1234, divisor = 532;
// Realizo la división.
double division = dividendo / divisor;
/* Muestro el resultado de la división de manera que ocupe como mínimo quince 
 caracteres, sólo dos de ellos para la parte decimal, utilizando la clase 
 DecimalFormat  (https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html).
 Se mostrarán dieciséis caracteres incluyendo la coma: trece para la parte 
 numérica, la coma, y dos para la parte decimal. */
DecimalFormat mostrar = new DecimalFormat("0000000000000.00");
System.out.println(mostrar.format(division));
	}

}
