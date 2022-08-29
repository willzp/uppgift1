package lek1;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args){
		System.out.println("Enter Password : ");
		
		for (int i = 0; i < 3; i++) {
		String password = "123";
		Scanner input = new Scanner(System.in);
		String svar = input.nextLine();
		
		if(svar.equals(password)) {
			System.out.println("logged in");
		}
		
		if(i == 0 && !svar.equals(password)) {
			System.out.println("Wrong! you have 2 more tries :");
		}
	    
		if(i == 1 && !svar.equals(password)) {
			System.out.println("Wrong! you have 1 more tries :");
		}
		 
		if(i == 2 && !svar.equals(password)) {
			System.out.println("no more chances");
		}
	  
		
		
		}
		
	}

}
