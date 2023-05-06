//BankAccount.java
class  BankAccount{
	//static fields
	static String BankName;
	static String BranchName;
	static String ifsc;
	//instance fields
	long accNum;
	String accHName;
	double balance;

	//instance methods to perform bussiness operations of an account

	//Deposit operation
	void deposit(double amt){
		balance = balance+amt;
		alert("Credited ",amt);
	}

	//Withdraw Operation

	void withdraw(double amt){
		balance = balance - amt;
		alert("Debited ",amt);
	}

	//CurrentBalance operation

	void currentBalance(){
		System.out.println(balance);
	}
	private void alert(String operation,double amt){
		System.out.println("Your account "+accNum+"is "+operation+"with "+amt);
		System.out.println("The total balance is "+balance);
	}
	
	//static methods for printing static fields

	static void BankName(){
		System.out.println(BankName);
	}
	static void BranchName(){
		System.out.println(BranchName);
	}
	static void ifsc(){
		System.out.println(ifsc);
	}

	//instance method for display all values of an account

	void display(){
		System.out.println("   BankName\t: "   +BankName  );
		System.out.println("   BranchName\t: " +BranchName);
		System.out.println("   ifsc\t\t: "     +ifsc      );
		System.out.println("   accNum\t: "     +accNum    );
		System.out.println("   accHName\t: "   +accHName  );
		System.out.println("   Balance\t: "    +balance   );
	}
}
