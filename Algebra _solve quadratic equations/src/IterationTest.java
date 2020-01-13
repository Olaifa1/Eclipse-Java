import java.util.Scanner;
public class IterationTest {

	public static void main(String[] args) {
		Iteration Walmart = new Iteration();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = input.nextInt();
		Walmart.number(number);
	
		
		input.close();
	}
	
}
