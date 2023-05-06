//Bank.java

import java.util.Scanner;

class  Bank{
	public static void main(String[] args){

		//initializing bank details in BankAccount class
		
		BankAccount.BankName    = "kotak";
		BankAccount.BranchName  = "Ameerpet";
		BankAccount.ifsc        = "KKBK0007453";

		// Create Scanner
		Scanner scanner = new Scanner(System.in);

		//Creating instances of BankAccount for multiple customer details
		
		var acc1 = new BankAccount();

		var acc2 = new BankAccount();

		System.out.println("acc1 details");
		acc1.display();
		System.out.println("acc2 details");
		acc2.display();

		//initializing acc1 instance properties with HK values
		acc1.accNum = 876543210001L;
		acc1.accHName = "HK";
		acc1.balance = 565966;

		//initializing acc1 instance properties with BK values
		acc2.accNum = 876543210002L;
		acc2.accHName = "BK";
		acc2.balance = 789966;
		
		System.out.println("acc1 details");
		acc1.display();
		System.out.println("acc2 details");
		acc2.display();
		//performing bussiness operations

		acc1.deposit(132);
		System.out.println();
		acc1.withdraw(10000);
		System.out.println();
		System.out.println("acc1 balance: ");
		acc1.currentBalance();
		System.out.println("acc2 details: ");
		acc2.currentBalance();
	}	
}
