package com;

import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     System.out.println("what is your age");
     int age=scanner.nextInt();
     if(age>=18) {
    	 System.out.println("you are elgible to vote");
     }
     else {
    	 System.out.println("you are not elgible to vote");
     }
	}

}
