package com;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = scanner.nextInt();
		if (marks < 35) {
			System.out.println("student is fail");
		}
		else if (marks == 35) {
			System.out.println("student is pass");
		} else if (marks > 35 && marks <= 70) {
			System.out.println("student secured thrid class");
		} else if (marks > 70 && marks <= 80) {
			System.out.println("student secured second class");
		} else if (marks > 80 && marks <= 100) {
			System.out.println("student secured first class");
		}

	}

}
