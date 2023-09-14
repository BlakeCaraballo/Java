package Banking;
import java.util.Scanner;
public class account {
	
		//Variables
		int balance;
		int previousTransaction;
		String customerName;
		String customerID;
		
		//Class constructor
		 account(String cname, String cid) {
			 customerName = cname;
			 customerID = cid;
		}
		//Deposit
		 void deposit(int amount){
			if(amount >= 0) {
				balance = balance+amount;
				previousTransaction = amount;
			}
		}
		//Withdraw
		void withdraw(int amount) {
			if(amount!=0) {
				balance = balance-amount;
				previousTransaction = -amount;
				
			}
		}
		//Previous Transaction
		void getPreviousTransaction() {
			if(previousTransaction>0) {
				System.out.println("Deposited: "+previousTransaction);
			}else if(previousTransaction<0) {
				System.out.println("withdrawn: "+Math.abs(previousTransaction));
			}else {
				System.out.println("No transactions occured");
			}
		}
		void calcInterest(int years) {
			double interestRate= .0185;
			double newBalance = (balance*interestRate*years)+balance;
			System.out.println("the current interest rate is "+(100*interestRate)+"%");
			System.out.println("After "+ years+"years, your balance will be "+newBalance);
		}
		//Main menu
		void showMenu() {
			char option = '\0';
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to BlickTrust, "+customerName+"!");
			System.out.println("Your ID is: "+customerID);
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("A. Check your balance");
			System.out.println("B. Make a deposit");
			System.out.println("C. Make a withdrawl");
			System.out.println("D. View previous transaction");
			System.out.println("E. Calculate interest");
			System.out.println("F. Exit");
			
			do {
				
				System.out.println();
				System.out.println("Enter an option: ");
				char option1 = scan.next().charAt(0);
				option = Character.toUpperCase(option1);
				System.out.println();
				
				switch(option) {
				//Case A = Check 
				case 'A':
					System.out.println("====================================");
					System.out.println("Balance = $"+ balance);
					System.out.println("====================================");
					System.out.println();
					break;
				//Case B = deposit
				case 'B':
					System.out.println("Enter an amount to deposit");
					int amount = scan.nextInt();
					deposit(amount);
					System.out.println();
					break;
				//Case C = withdraw
				case 'C':
					System.out.println("Enter an amount to withdraw");
					int amount2 = scan.nextInt();
					withdraw(amount2);
					System.out.println();
					break;
				//Case D = view transaction
				case 'D':
					System.out.println("====================================");
					getPreviousTransaction();
					System.out.println("====================================");
					System.out.println();
					break;
				//Case E = accrued interest
				case 'E':
					System.out.println("Enter years of accrued interest");
					int years = scan.nextInt();
					System.out.println("Balance = $"+ balance);
					calcInterest(years);
					break;
				//Case F = exit
				case 'F':
					System.out.println("====================================");
					break;
				//default = error
					default:
						System.out.println("Please enter a valid option");
						break;
						}
			}while(option!='F');
		
			System.out.println("Thank you for banking with us!");
		
		
		
}

}

