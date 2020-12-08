package unidad4;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		// declaro las variables que necesito
		int numA = 0, numE = 0, numI = 0, numO = 0, numU = 0;
		// acepto texto por teclado
		System.out.println("Escribe tu texto.");
		Scanner entrada = new Scanner(System.in);
		// pongo el texto en mayúsculas para que no haya problemas con ellas
		String texto = entrada.nextLine().toUpperCase();
		char[] textoChar = texto.toCharArray();
		// uso un bucle para contar las vocales
		for (int letra = 0; letra < textoChar.length; letra++) {
			if (textoChar[letra] == 'A') numA++;
			if (textoChar[letra] == 'Á') numA++;
			if (textoChar[letra] == 'E') numE++;
			if (textoChar[letra] == 'É') numE++;
			if (textoChar[letra] == 'I') numI++;
			if (textoChar[letra] == 'Í') numE++;
			if (textoChar[letra] == 'O') numO++;
			if (textoChar[letra] == 'Ó') numE++;
			if (textoChar[letra] == 'U') numU++;
			if (textoChar[letra] == 'Ú') numE++;
		} // fin for
		entrada.close();
		System.out.println("El texto \"" + texto + "\" tiene:");
		System.out.println(numA + " aes,");
		System.out.println(numE + " es,");
		System.out.println(numI + " íes,");
		System.out.println(numO + " oes y");
		System.out.println(numU + " úes.");
	} // fin main

}