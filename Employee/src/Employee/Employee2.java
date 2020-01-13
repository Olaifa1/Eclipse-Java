package Employee;

public class Employee2 {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee2(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary < 0) {
			monthlySalary = 0.0;
			this.monthlySalary = monthlySalary;
		}
		
		
	}
	
	public double yearlySalary() {
		double yearlySalary = (12 * getMonthlySalary());
		return yearlySalary;
		}
	
	public double tenPercentRaise() {
		double tenPercentRaise = (1.1 * yearlySalary());
		return tenPercentRaise;
	}
}
