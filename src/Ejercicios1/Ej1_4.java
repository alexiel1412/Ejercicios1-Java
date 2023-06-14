package Ejercicios1;
import java.util.Scanner;

public class Ej1_4
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca la temperatura (Celiuus): ");
		float faren, celsius = teclado.nextFloat();
		faren = 32 + (9 * celsius / 5f);
		System.out.printf("La temperatura de %.2f ºC equivale a %.2f ºF", celsius, faren);
		teclado.close();
	}

}
