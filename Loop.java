import java.util.Scanner;

public class Loop {

	
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt user for a number
	        
	        int number = 2;
	        
	        if(number!=0) {
	        	System.out.println("The program run sucessfully");
	        	
	        }
	        else {
	        	System.out.println("Exception or erro occurs in program during execution");
	        }
	        
	        // For loop to print the multiplication table
	        System.out.println("Multiplication table for " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }
	        
	        // While loop to print numbers from 1 to the entered number
	        System.out.println("\nNumbers from 1 to " + number + ":");
	        int count = 1;
	        while (count <= number) {
	            System.out.println(count);
	            count++;
	        }
	        
	        
	        scanner.close();
	    }
	

	}


