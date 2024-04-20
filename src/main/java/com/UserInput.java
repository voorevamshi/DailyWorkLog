package com;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
				System.out.println("what is your name");		
				String name= scanner.nextLine();
				System.out.println("what is your qualification" );
				String qualification=scanner.nextLine();
				System.out.println("what is your age");
				int age=scanner.nextInt();
				System.out.println("Thankyou for the information");	
				scanner.close();
				
		

	}

}
