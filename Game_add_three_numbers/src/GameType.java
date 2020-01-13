import java.util.Scanner;

public class GameType {

	public static void main(String[] args) {
		
		int number1 = (int) (Math.random() * 1000);
		int number2 = (int) (Math.random() * 1000);
		int add = number1 + number2;
		System.out.printf("First integer is: %d.%n", number1);
		System.out.printf("Second integer is: %d.%n", number2);
		
		System.out.println("Add the First integer to the Second integer");
		System.out.println("Enter Your Answer: ");
		Scanner collect = new Scanner(System.in);
		Game userAnwser = new Game();
		int userAnswer = collect.nextInt();
		
		if(userAnswer == add) {
			System.out.println("Your answer is Right.");
		}
		
		if(userAnswer != add) {
			System.out.println("Your answer is Wrong.");
		}
			int integer1 = (int) (Math.random() * 10);
			int integer2 = (int) (Math.random() * 10);
			int integer3= (int) (Math.random() * 10);
			
			System.out.printf("First integer is: %d.%n", integer1);
			System.out.printf("Second integer is: %d.%n", integer2);
			System.out.printf("Third integer is: %d.%n", integer3);
			
			int addInteger = integer1 + integer2 + integer3;
	
			System.out.println("Add the First, Second and third integers together");
			System.out.println("Enter Your Answer: ");
	
			int yourAnswer = collect.nextInt();
			if(yourAnswer == addInteger) {
				System.out.println("Your answer is Right.");
			}
			
			if(yourAnswer != addInteger) {
				System.out.print("Your answer is Wrong.");
			}
	}

}
