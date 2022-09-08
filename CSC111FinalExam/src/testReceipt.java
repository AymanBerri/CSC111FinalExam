// Ayman Berri

import java.util.Scanner;
public class testReceipt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Receipt receipt = new Receipt();
		
//		System.out.println("Welcome :D");
		
		System.out.println("***********************************************************");
		System.out.println(" Welcome :)                                                ");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Please enter one of the following options:                 ");
		System.out.println("1) add ==> this allows you to add an item to the receipt   ");
		System.out.println("2) print ==> this allows you to print receipt.             ");
		System.out.println("3) find ==> this allows you to search for an item name.    ");
		System.out.println("4) exit ==> to end this program                            ");
		System.out.println("***********************************************************");
		System.out.print("Enter your option :> "); String userOption = sc.next();
		

		while (!userOption.equalsIgnoreCase("exit")) {
			
			if (userOption.equalsIgnoreCase("add") || userOption.equalsIgnoreCase("print") || userOption.equalsIgnoreCase("find") ||
				!userOption.equalsIgnoreCase("exit")) {
				
				switch (userOption){
					case "add":
						System.out.println("Please enter the name, quantity, and price of item :");
						if(receipt.addItem(sc.next(), sc.nextInt(), sc.nextDouble()))
							System.out.println("Item was added!");
						else System.err.println("Item was NOT added!");
						break;
					case "print":
						receipt.printReceipt();
						break;
					case "find":
						System.out.println("Please enter the item name:");
						int found = receipt.findIndexByName(sc.next());
						if(found != -1){
							receipt.displayItem(found);
						}
						else {
							System.err.println("The item is not found!");
						}
						break;
					default:
						System.err.println("Invalid input! Please try again. ");
				}
			}
			
			
			
			System.out.println("***********************************************************");
			System.out.println(" Welcome :)                                                ");
			System.out.println("-----------------------------------------------------------");
			System.out.println("Please enter one of the following options:                 ");
			System.out.println("1) add ==> this allows you to add an item to the receipt   ");
			System.out.println("2) print ==> this allows you to print receipt.             ");
			System.out.println("3) find ==> this allows you to search for an item name.    ");
			System.out.println("4) exit ==> to end this program                            ");
			System.out.println("***********************************************************");
			System.out.print("Enter your option :> "); userOption = sc.next();
		}
		
		
		System.out.println("You just exited the program.");
		System.out.println("Thanks! Goodbye :)");
		
		
		sc.close();
	}

}
