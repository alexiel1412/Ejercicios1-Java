package Ejercicios1;

import java.util.Scanner;

public class Ej1_10
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		double cambio;
		int euros, centimos, mon2e, mon1e, mon50c, mon20c, mon10c, mon5c, mon2c, mon1c;
		
		System.out.println("Escriba el importe total de la compra: ");
		double importe = teclado.nextDouble();
		System.out.println("Escriba la cantidad con la que pagará: ");
		double cantidad = teclado.nextDouble();
		
		cambio = importe - cantidad;
		if (cambio < 0 || importe < 0)
			System.out.println("Error: Introduzca datos adecuados");
		else
		{
			System.out.println("Precio del producto: " + importe + " euros.");
			System.out.println("Cambio a devolver: " + cambio + " euros.");
			if (cambio == 0)
				System.out.println("Le dieron el pago exacto, no tiene cambio.");
			else
			{
				euros = (int) cambio;
				cambio = Math.round ((cambio - euros) * 100);
				
				//Calculamos las monedas de euro
				mon2e = (int) (euros / 2);
				mon1e = euros % 2;
				
				System.out.println(cambio);
				//Calculamos los centimos
				mon50c = (int) (cambio / 50);
				cambio = cambio % 50;
				mon20c = (int) (cambio / 20);
				cambio = cambio % 20;
				mon10c = (int) (cambio / 10);
				cambio = cambio % 10;
				mon5c = (int) (cambio / 5);
				cambio = cambio % 5;
				mon2c = (int) (cambio / 2);
				mon1c = (int) (cambio % 2);
				
				System.out.println("Tu cambio es: ");
				//Escribimos las monedas solo si se da alguna de cada tipo
				if (mon2e > 0)
					System.out.println(mon2e + " monedas de 2 euros.");
				if (mon1e > 0)
					System.out.println(mon1e + " monedas de 1 euros.");
				if (mon50c > 0)
					System.out.println(mon50c + " Monedas de 50 centimos.");
				if (mon20c > 0)
					System.out.println(mon20c + " Monedas de 20 centimos.");
				if (mon10c > 0)
					System.out.println(mon10c + " Monedas de 10 centimos.");
				if (mon5c > 0)
					System.out.println(mon5c + " Monedas de 5 centimos.");
				if (mon2c > 0)
					System.out.println(mon2c + " Monedas de 2 centimos.");
				if (mon1c > 0)
					System.out.println(mon1c + " Monedas de 1 centimos.");
			}
		}
	}
}