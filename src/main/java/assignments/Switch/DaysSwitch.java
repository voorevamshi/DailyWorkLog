package assignments.Switch;

import java.util.Scanner;

public class DaysSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter day name");
		String dayName = scanner.nextLine();
		switch (dayName) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println("its a weekday");
			break;
		case "saturday":
		case "sunday":
			System.out.println("yayn its weekend ");
			break;
		}

	}

}
