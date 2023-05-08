package app;

import java.util.Scanner;

public class ExerciseTwo {

	public static void main(String[] args) {

		// Attributi
		int km;
		int fuel;

		Scanner input = new Scanner(System.in);

		try {

			System.out.println("Inserisci i km percorsi: ");
			km = input.nextInt();

			System.out.println("Inserisci i litri consumati: ");
			fuel = input.nextInt();

			System.out.println("Sono stati percorsi " + kmPerLiter(km, fuel) + "km con un litro.");

		} catch (ArithmeticException e) {
			System.out.println("Puoi inserire solo numeri positivi");
		}

		input.close();
	}

	public static int kmPerLiter(int km, int fuel) {
		return km / fuel;
	}

}

// per controllare se un numero è infinito => if (Double.isInfinite(kmLitro) 