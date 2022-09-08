// Ayman Berri


import java.util.Scanner;
public class Shape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter ->");
		System.out.print("A number> ");
		int number = sc.nextInt();
		
		char charr = '-';
		if(number != -1) { // Check if first number isn't -1
			System.out.print("A char> ");
			charr = sc.next().charAt(0);
		}

		
		while(number != -1) {			
			for (int row = 1; row <= number; row++) {
				
	            for (int col = 1; col <= number; col++) {
	                if (row == 1 || row == number || col == 1 || col == number)         
	                    System.out.print(charr);           
	                else
	                    System.out.print(" ");           
	            }
	            
	            System.out.println(); // next row
	        }

			System.out.println("\n============");
			System.out.print("A number> ");
			number = sc.nextInt();
			if (number == -1) break;
			
			System.out.print("A char> ");
			charr = sc.next().charAt(0);
			
		}
		
		System.out.println("Program ending...");
		System.out.println("Goodbye!");
		
		
		
		sc.close();
		
		
		
		
		
	}

}
