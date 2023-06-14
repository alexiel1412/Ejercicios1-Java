package Ejercicios1;

import java.util.Scanner;

public class Ej1_7
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int catA, catB;
		System.out.println("Introduzca el cateto A: ");
		catA = teclado.nextInt();
		System.out.println("Introduzca el teclado B: ");
		catB = teclado.nextInt();
		double hipot = Math.sqrt(Math.pow(catA, 2) + Math.pow(catB, 2));
		System.out.printf("En un triángulo con cateto A de %d cm y cateto B de %d cm, su hipotenusa es de %.2f cm.", catA, catB, hipot);
		teclado.close();
	}
}
