package Ejercicios1;

import java.util.Scanner;

public class Ej1_13
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca una cifra de 5 digitos.");
		int cifra = teclado.nextInt();
		String guardado = "0";
		
		for (int exp = 1; exp <= 5; exp++)
		{
			System.out.println((int)(cifra % Math.pow(10, exp)));
			if ((int)(cifra % Math.pow(10, exp)) != 0)
			{
				guardado = String.valueOf((int)(cifra % Math.pow(10, exp)));
				System.out.printf("%5s\n", guardado);
			}
			else
			{
				guardado = "0" + guardado;
				System.out.printf("%5s\n", guardado);
			}
		}
		teclado.close();
	}

}
