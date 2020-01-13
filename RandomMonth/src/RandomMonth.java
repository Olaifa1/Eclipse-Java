public class RandomMonth {
		private int month;
		
		public RandomMonth() {
			
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			
			int setMonth = (int) (Math.random() * 13);
			
			if(month <= 0 || month >= 13 ) {
				System.out.println("The month is null");
			}
			
			if(month == 1) {
				System.out.println("JANUARY");
			}
			
			if(month == 2) {
				System.out.println("FEBRUARY");
			}
			if(month == 3) {
				System.out.println("MARCH");
			}
			if(month == 4) {
				System.out.println("APRIL");
			}
			
			if(month == 5) {
				System.out.println("MAY");
			}
			
			if(month == 6) {
				System.out.println("JUNE");
			}
			if(month == 7) {
				System.out.println("JULY");
			}
			
			if(month == 8) {
				System.out.println("AUGUST");
			}
			
			if(month == 9) {
				System.out.println("SEPTEMBER");
			}
			if(month == 10) {
				System.out.println("OCTOBER");
			}
			
			if(month == 11) {
				System.out.println("NOVEMBER");
			}
			
			if(month == 12) {
				System.out.println("DECEMBER");
			}
			
			
			
			
			
			this.month = month;
		}
	
	
		
	
}
