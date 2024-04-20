package com;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("what is today");
       String today=scanner.nextLine();
       if(today.equalsIgnoreCase("Momday")||
    	 today.equalsIgnoreCase("Tuesday")||
   	     today.equalsIgnoreCase("Wednesday")||
   	     today.equalsIgnoreCase("Thrsday")||
   	     today.equalsIgnoreCase("Frday")) {
   	  System.out.println("uff its a weekday");
       }
       
       else if(today.equalsIgnoreCase("Saturday")||
    		   today.equalsIgnoreCase("Sunday")){
    	   System.out.println("yayy its weekend");
       }
	}

}
