import java.util.Scanner;
public class AccountType {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		Account waliuAccount = new Account();
	
		
		
		System.out.println("Enter name:");
		String name = input.nextLine();
		waliuAccount.setName(name);
		System.out.printf("Waliu's account name is %s%n", waliuAccount.getName());
	
		System.out.println("Enter Account Type:");
		String accountType = input.nextLine();
		waliuAccount.setAccountType(accountType);
		System.out.printf("Waliu's Account Type  is %s%n", waliuAccount.getAccountType());
		
		System.out.println("Enter Balance:");
		double balance = input.nextDouble();
		waliuAccount.setBalance(balance);
		System.out.printf("Waliu's account balance is %s%n", waliuAccount.getBalance());
	
		System.out.println("Enter Bvn:");
		double bvn = input.nextDouble();
		waliuAccount.setBvn(bvn);
		System.out.printf("Waliu's account BVN is %s%n", waliuAccount.getBvn());
		
				
		//prompt and save credit amount as value and print
		System.out.println("Enter Credit Amount:");
		double value = input.nextDouble();
		System.out.printf("Waliu's account balance is %f%n", waliuAccount.credit(value));
	
	
	}

}
