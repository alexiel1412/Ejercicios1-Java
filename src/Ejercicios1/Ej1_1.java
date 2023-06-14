package Ejercicios1;
import java.util.Scanner;

public class Ej1_1
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca a: ");
		double a = teclado.nextDouble();
		System.out.println("Introduzca b: ");
		double b = teclado.nextDouble();
		System.out.printf("Los números son %f y %f.\n", a, b);
		teclado.close();
	}

}
