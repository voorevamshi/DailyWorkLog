package assignments.Switch;

import java.util.Scanner;

public class OperationSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int number1= scanner.nextInt();
		System.out.println("Enter the second number");
		int number2=scanner.nextInt();
		System.out.println("Enter the target operation");
		String operaton =scanner.next();
		
		switch (operaton) {
		case "+":
			System.out.println(number1+number2);
			break;
		case "-":
			System.out.println(number1-number2);
			break;
		case "*":
			System.out.println(number1*number2);
			break;
		case "/":
			System.out.println(number1/number2);
			break;
		default:
			break;
		}
		
		
		
		
		
		
		
		scanner.close();
	
	
		
	}

}
