import java.util.Scanner;

public class BankingAppliccation {

	public static void main(String[] args) {
		
		BankAccount obj1 = new BankAccount("Shahad" , "007");
		obj1.showMenu();
		
		

	}

}

class BankAccount{
	
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cid){
		
		customerName = cname;
		customerId = cid;  
	}
	
	void deposit(int amount) {
		if(amount != 0) {					// Check
			balance = balance + amount;   // Deposit = Main Balance + Deposit Amount
			previousTransaction = amount;  // it shows how many amount is added previously 
			}
		
		
		
	}
	
	void withdrawal(int amount) {
		
		if(amount != 0) {						// Check
			balance = balance - amount;			// Withdrawal = Main Balance - Withdrawal Amount 
			previousTransaction =- amount;		// it shows how many amount is deducted previously
		}
	}
	
	void getPreviousTransaction() {    // It Shows the Previous Transactions
		
		if(previousTransaction > 0) {
			System.out.println("Deposit : " + previousTransaction);
		}
		else if(previousTransaction < 0) {
			System.out.println("Withdrawal : " + Math.abs(previousTransaction));
		}
		else {
			System.out.println("No Transaction Occured");
			}
	}
	
	void showMenu() {
		
		char option = '\0';        		// For enter the char Input from user (Options)
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Welcome " + customerName ); 		 // Display Name
		System.out.println("Your ID is " + customerId );		// Display ID
		System.out.println("\n");
		
		
		System.out.println("A. Check Balance");				// Options
		System.out.println("B. Deposit");					// Options
		System.out.println("C. Withdrawal");				// Options
		System.out.println("D. Previous Transactions");		// Options
		System.out.println("E. Exit");						// Options
		
		
		
		do {
			System.out.println("========================================================================");
			System.out.println("Enter an Option");
			System.out.println("========================================================================");
			
			option = scanner.next().charAt(0);
			
			
			switch(option)
			{
			case 'A':
				System.out.println("---------------------------------------------------------------------");
				System.out.println("Available Balance is " + balance);
				System.out.println("---------------------------------------------------------------------");
				System.out.println("\n");
				break;
			
			
			case 'B':
				System.out.println("---------------------------------------------------------------------");
				System.out.println("Enter the Amount to Deposit");
				System.out.println("---------------------------------------------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("---------------------------------------------------------------------");
				System.out.println("Enter the Amount to Withdrawal");
				System.out.println("---------------------------------------------------------------------");
				int amount2 = scanner.nextInt();
				withdrawal(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				
				System.out.println("---------------------------------------------------------------------");
				getPreviousTransaction();
				System.out.println("---------------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("************************************************************************");
				break;
				
				
		   default:
			   System.out.println("Invalid Option!..Please Enter Aagain");
			   break;
			   
			}
		}
			
		while(option != 'E');
			System.out.println("Thanks For Using Our Services❤");
		}
	
					
				
	}
