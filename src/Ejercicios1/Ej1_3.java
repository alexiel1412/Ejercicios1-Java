package Ejercicios1;
import java.util.Scanner;

public class Ej1_3
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el número: ");
		int a = teclado.nextInt();
		// System.out.println("Número = " + a + ", su doble = " + a * 2 + ", su triple = " + a * 3 + ".");
		int doble = a * 2;
		int triple = a * 3;
		System.out.printf("Numero = %d, su doble = %d, su triple = %d.", a, doble, triple);
		teclado.close();
	}

}
