package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import exceptions.Test;

public class ExerciseOne {

	public static void main(String[] args) {
		
		// Attributi
		int numberUser; 
		int index;
		int[] numbers = generateNumbers(5);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Di seguito il contenuto dell'array: " + Arrays.toString(numbers));
		
		while(true) {
			try {
				System.out.println("Inserisci un numero qualsiasi oppure 0 per uscire: ");
				numberUser = input.nextInt();				//int numberUser = Integer.parseInt(input.nextLine());
				
				if(numberUser == 0) break;
				
				System.out.println("Inserisci la posizione dove memorizzare il valore sopra: ");
				index = input.nextInt();
				
				if(index >= 0 && index <= numbers.length) {
					if(numberUser > 0 && numberUser <= 10) {
						numbers[index] = numberUser;
					} else {
						// eccezione con throw
						throw new Test("Puoi inserire solo valori compresi tra 1 e 10", 1, 10);
					}
				} else {
					// eccezione con throw	
					throw new Test("Puoi inserire solo valori compresi tra 1 e " + numbers.length, 0, numbers.length);
				}
				System.out.println("Di seguito il contenuto dell'array modifcato: " + Arrays.toString(numbers));
			} catch (Test e) {
				System.out.println(e.getMessage());
			} 
		}
		input.close();
		
		System.out.println("Di seguito la disposizione finale dell'array: " + Arrays.toString(numbers));
	}

//	metodi
	public static int[] generateNumbers(int n) {
		int[] numbers = new int[n];
		
		Random random = new Random();
		
		for (int i = 0; i < n; i++) {
			int numRand = random.nextInt(10) + 1;
			numbers[i] = numRand;
		}
		return numbers;
	}
}
