package Ejercicios1;

import java.util.Scanner;

public class eJ1_12
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca una cifra de 5 digitos.");
		int cifra = teclado.nextInt();
		System.out.printf("%d\n", cifra / 10000);
		System.out.printf("%02d\n", cifra / 1000);
		System.out.printf("%03d\n", cifra / 100);
		System.out.printf("%04d\n", cifra / 10);
		System.out.println(cifra);
		teclado.close();
	}
}
