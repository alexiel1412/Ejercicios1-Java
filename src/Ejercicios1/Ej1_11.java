package Ejercicios1;

import java.util.Scanner;

public class Ej1_11
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca una cifra de 3 digitos.");
		int cifra = teclado.nextInt();
		int dig1, dig2, dig3;
		
		dig1 = cifra / 100;
		cifra = cifra % 100;
		dig2 = cifra / 10;
		dig3 = cifra % 10;
		
		/* FORMA B
		dig1 = cifra / 100;
		cifra -= dig1 * 100;
		dig2 = cifra / 10;
		dig3 = cifra - (dig2 * 10);
		*/
		
		System.out.println(dig1 + "\n" + dig2 + "\n" + dig3);
		
		/* FORMA C
		String cifra = teclado.next();
		System.out.println(cifra.substring(0,1) + "\n" + cifra.substring(1,2) + "\n" + cifra.substring(2,3));
		 */
		
		teclado.close();
	}

}
