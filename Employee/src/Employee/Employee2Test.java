package Employee;

public class Employee2Test {

	public static void main(String[] args) {
		Employee2 shoprite = new Employee2("OLaifa", "Waliu", 2345.0);
		shoprite.setMonthlySalary(456.5);
		
		Employee2 walmart = new Employee2("Olaifa", "Wale", 345.0);
		walmart.setMonthlySalary(45.3);
		
		System.out.printf("Shoprite Yearly salary is %f%n", shoprite.yearlySalary());
		System.out.printf("Walmart Yearly Salary is %f%n", walmart.yearlySalary());
		
		System.out.printf("Shoprite Yearly Salary After Ten Percent Raise is %f%n", shoprite.tenPercentRaise());
		System.out.printf("Walmart Yearly Salary After Ten Percent Raise is %f%n", walmart.tenPercentRaise());
		
	}
}
