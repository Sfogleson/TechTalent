package hw0131;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter 5 numbers.  Example: 1 2 3 4 5 ");
		String randomNumbers = userInput.nextLine();

		String[] numbers = randomNumbers.split(" ");

		int total = 0;
		int product = 1;
		int smallestNumber = Integer.parseInt(numbers[0]);
		int largestNumber = Integer.parseInt(numbers[0]);

		for (int i = 0; i <= numbers.length - 1; i++) {
			System.out.println(numbers[i]);
			int number = Integer.parseInt(numbers[i]);
			total = total + number;
			product = product * number;

			if (smallestNumber > number) {
				smallestNumber = number;
			}
			if (largestNumber < number) {
				largestNumber = number;
			}

		}

		System.out.println("Total: " + total);
		System.out.println("Product: " + product);
		System.out.println("Smallest number : " + smallestNumber);
		System.out.println("Largest number : " + largestNumber);

		userInput.close();
	}

}
