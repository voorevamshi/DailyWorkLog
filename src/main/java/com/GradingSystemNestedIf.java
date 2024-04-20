package com;

import java.util.Scanner;

public class GradingSystemNestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = scanner.nextInt();

		if (marks <= 100) {
			if (marks <= 85) {
				if (marks <= 70) {
					if (marks <= 35) {
						if (marks < 35) {
							System.out.println("student fail");
							return;
						}
						System.out.println(" pass");
						return;
					}
					System.out.println("third  class");
					return;
				}
				System.out.println("second class");
				return;
			}
			System.out.println("first class");
			return;
		}
		
	}

}
