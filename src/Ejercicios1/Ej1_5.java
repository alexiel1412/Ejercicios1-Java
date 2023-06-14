package Ejercicios1;
import java.util.Scanner;

public class Ej1_5
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el radio (entero): ");
		float radio = teclado.nextFloat();
		final float PI = 3.14159265f;
		double longitud = 2 * PI * radio, area = Math.PI * Math.pow(radio, 2);
		// Math.pow --> potencia
		// Math.PI --> número PI
		System.out.printf("Radio de circunferencia = %f, longitud = %.2f, area = %.2f", radio, longitud, area);
		teclado.close();
	}

}
