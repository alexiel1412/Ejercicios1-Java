package Ejercicios1;

import java.util.Scanner;

public class Ej1_8
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el radio de la esfera (entero): ");
		int radio = teclado.nextInt();
		double volumen = 4 / 3.0 * Math.PI * Math.pow(radio, 3);
		System.out.printf("En una esfera de radio %d, su volumen es %.2f", radio, volumen);
		teclado.close();
	}

}
