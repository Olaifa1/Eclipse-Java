
public class Employee {


		private String firstName;
		private String lastName;
		private double monthlySalary;
		
		public Employee() {
			
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

		public Double getMonthlySalary() {
			return monthlySalary;
		}

		public void setMonthlySalary(Double monthlySalary) {
			this.monthlySalary = monthlySalary;
		}
		
	
		public Double getYearlySalary() {
			Double yearlySalary = 12 * getMonthlySalary();
			return yearlySalary;
		}
		
		public double getTenPercentSalaryRaise() {
			double tenPercentSalaryRaise = (1.1 * getYearlySalary());
			return tenPercentSalaryRaise;
		}
		
}
