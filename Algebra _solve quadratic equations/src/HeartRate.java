
public class HeartRate {
		private String firstName;
		private String lastName;
		private int month;
		private int day;
		private int year;
		private double maxHeartRate;
		private double targetHeartRate1;
		private double targetHeartRate2;
		
		
		public HeartRate(String firstName, String lastName, int month, int day, int year, double maxHeartRate, double targetHeartRate1, double targetHeartRate2) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.month = month;
			this.day = day;
			this.year = year;
			this.maxHeartRate = maxHeartRate;
			this.targetHeartRate1 = targetHeartRate1;
			this.targetHeartRate2 = targetHeartRate2;
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

		
		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		
	//	public void dob() {
		//}
		
		public int age() {
			int age = 2019 - getYear();
			return age;
		}
		
		public double maxHeartRate() {
			double  maxHeartRate = 220 - age();	
			return maxHeartRate;
		}
		
		public double targetHeartRate1() {
			 double targetHeartRate1 = 0.5 * maxHeartRate();
			return targetHeartRate1;
		}
		public double targetHeartRate2() {
			double targetHeartRate2 = 0.85 * maxHeartRate();	
		return targetHeartRate2;
		}
}
