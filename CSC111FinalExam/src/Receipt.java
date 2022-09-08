// Ayman Berri



public class Receipt {
	
	private String[] names;
	private	int[] quantities;
 	private double[] prices;
	private int nItems;
	public static final int MAX_SIZE=100;
	
//==================================================================================
	
	public Receipt() {
		this.names = new String[MAX_SIZE];
		this.quantities = new int[MAX_SIZE];
		this.prices = new double[MAX_SIZE];
		this.nItems = 0; // my index
	}
	
	public int getNItems() {
		return this.nItems;
	}
	
	public int findIndexByName(String name) {
		for(int i=0; i<nItems; i++) {
			//if (names[i] != null) {
				if (names[i].equalsIgnoreCase(name)) {
					return i;
				}
		//	}
		}
		return -1;
	}
	
	public boolean displayItem(int i) {
		if (i<nItems && i>-1) {
			System.out.println(names[i] + ", x" + quantities[i] + ", " + prices[i] + "SR.");
			return true;
		}
		return false;
	}
	
	public boolean addItem(String name, int quantity, double price) {		
		if (quantity > 0 && nItems < 100) {
			int found = findIndexByName(name);
			
			if (found!=-1 && prices[found] == price) {
					quantities[found] += quantity;
					return true;				
			}
			
			
			if (nItems<100) {
				this.names[nItems] = name;
				this.quantities[nItems] = quantity;
				this.prices[nItems] = price;
				nItems++;
			}
			return true;
		}

		return false;
	}
	
	
	public void printReceipt() {
		double total = 0;
		for (int i = 0; i<nItems; i++) {
			displayItem(i);
			total += prices[i]*quantities[i];
		}

		System.out.println("=====================");
		System.out.println(" Total =     " + total);
		System.out.println("=====================\n");
		
	}
	
	
	
	
}
