package Ejercicios1;

import java.util.Scanner;

public class Ej1_6
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca su velocidad (en Km/h): ");
		int kmh = teclado.nextInt();
		float ms;
		ms = kmh * 1000 / 3600f;
		System.out.printf("Su velocidad de %d km/h es equivalente a %.2f m/s.\n", kmh, ms);
		teclado.close();
	}
}
