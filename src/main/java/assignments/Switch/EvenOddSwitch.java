package assignments.Switch;

import java.util.Scanner;

public class EvenOddSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		int remainder = number % 2;
		switch (remainder) {
		case 0:
			System.out.println("even number");
			break;
		case 1:
			System.out.println("odd number");
			break;
		}

	}

}
