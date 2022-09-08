// Ayman Berri


import java.util.Scanner;
public class MyName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a name: ");
		String nameEntered = sc.next();
		char firstLetter = nameEntered.charAt(0);
		
		while(firstLetter != 'a' || nameEntered.length() <= 5) {
			
			if(nameEntered.length() <= 5) {
				System.err.println("The name has 5 or less characters.");	
			}
			if(firstLetter != 'a') {
				System.err.println("The name doesn't start with 'a'");
				
			}
			
			System.out.println();
			System.out.print("Re-enter a correct name: ");
			nameEntered = sc.next();
			firstLetter = nameEntered.charAt(0);
		}
		
		System.out.println("Accepted.");
		
		
		sc.close();

	}

}
