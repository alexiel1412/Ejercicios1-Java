package Ejercicios1;

import java.util.Scanner;

public class Ej1_9
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca lado A: ");
		int ladoA = teclado.nextInt();
		System.out.println("Introduzca lado B: ");
		int ladoB = teclado.nextInt();
		System.out.println("Introduzca lado C: ");
		int ladoC = teclado.nextInt();
		double semiPer = (ladoA + ladoB + ladoC) / 2.0;
		// Formula natural = Math.sqrt(semiPer * (semiPer - ladoA) * (semiPer - ladoB) * (semiPer - ladoC)) --- Pero la he dividido
		double semiArea = (semiPer - ladoA) * (semiPer - ladoB) * (semiPer - ladoC);
		double area = Math.sqrt(semiPer * semiArea);
		if (Double.isNaN(area) || semiArea == 0)
			System.out.println("El triángulo no existe.");
		else
			System.out.printf("El área de un triángulo de lados %d, %d y %d es %.2f.", ladoA, ladoB, ladoC, area);
		teclado.close();
	}

}
