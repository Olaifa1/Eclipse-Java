
	public class Compare {
		private int firstNumber;
		private int secondNumber;
		
		public Compare() {
	
}
		public Compare(int x) {
			this.firstNumber = x;
		}
		
		public Compare(int x, int y) {
			this.firstNumber = x;
			this.secondNumber = y;
		
		}
		public int getFirstNumber() {
			return firstNumber;
		}
		public void setFirstNumber(int firstNumber) {
			this.firstNumber = firstNumber;
		}
		public int getSecondNumber() {
			return secondNumber;
		}
		public void setSecondNumber(int secondNumber) {
			this.secondNumber = secondNumber;
		}
		
		public int compare (int x, int y) {
			int max = 0;
			if(x > y) {
				max = x;
			}
			if(y > x) {
				max = y;
			}
			else{max = 0;
			}
			return max;
		}
	}
