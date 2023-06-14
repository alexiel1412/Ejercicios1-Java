package Ejercicios1;

import java.util.Scanner;

public class Ej1_2
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce tu nombre");
		String nombre = teclado.nextLine();
		System.out.printf("Buenos días, %s.", nombre);
		// System.out.println("Buenos días, " + nombre + ".");
		teclado.close();
	}
}
