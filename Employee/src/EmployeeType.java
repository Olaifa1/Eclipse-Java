import java.util.Scanner;
public class EmployeeType {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		Employee walmart = new Employee();
		Employee shoprite = new Employee();
	
		System.out.println("Enter First Name For Walmart: ");
		String firstName = input.nextLine();
		walmart.setFirstName(firstName);
		
		System.out.println("Enter First Name For Shoprite: ");
		String firstName1 = input.nextLine();
		shoprite.setFirstName(firstName1);
	
		System.out.println("Enter Last Number for Walmart: ");
		String lastName = input.nextLine();
		walmart.setLastName(lastName);
		
		System.out.println("Enter Last Number for Shoprite: ");
		String lastName1 = input.nextLine();
		shoprite.setLastName(lastName1);
	
		System.out.println("Enter Monthly Salary For Walmart: ");
		Double monthlySalary = input.nextDouble();
		
		if(monthlySalary < 0) {
			monthlySalary = 0.0;
		}
		walmart.setMonthlySalary(monthlySalary);
		
		System.out.println("Enter Monthly Salary For Shoprite: ");
		Double monthlySalary1 = input.nextDouble();
		
		if(monthlySalary1 < 0) {
			monthlySalary1 = 0.0;
		}
		shoprite.setMonthlySalary(monthlySalary1);

		System.out.printf("Walmart's Yearly Salary is:#%.0f %n", walmart.getYearlySalary());
		System.out.printf("Shoprite's Yearly Salary is:#%.0f %n", shoprite.getYearlySalary());
		
		
		System.out.printf("Walmart's Yearly Salary after 10 percent Raise is:#%.0f %n", walmart.getTenPercentSalaryRaise());
		System.out.printf("Shoprite's Yearly Salary after 10 percent Raise is:#%.0f %n", shoprite.getTenPercentSalaryRaise());
	}

}
