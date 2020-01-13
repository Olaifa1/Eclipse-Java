
public class Iteration {
	private int number;
	
	public Iteration() {
		
	}

	public int number(int number) {
		
		if( number % 2 != 0) {
		System.out.println(number);
	}
		else { 
			System.out.println(number);
			
//			For loop to increase input value by 2 and displaying the results.
			for(int i = 2;  i <= number; i = i+2) {
				System.out.println(i);
			}
//			For loop to decrease input value by 2 and displaying the results on the same line.
			for(int i = number;  i > 0; i = i-2) {
				System.out.print(i + " ");
			} 
			
//			Is number greater than 10? If number is greater 10,
			System.out.print(number > 10 ? "greater than 10": "Less than 10");
		}
		
		return number;

	}
}