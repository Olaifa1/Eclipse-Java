		import java.util.Scanner;

		public class QuadraticEquationTest {

			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				QuadraticEquation root = new QuadraticEquation();
				
				System.out.print("input a: ");
				double a = input.nextDouble();
				
				System.out.print("input b: ");
				double b = input.nextDouble();
				
				System.out.print("input c: ");
				double c = input.nextDouble();
				
				double discriminant = ((b * b) - (4 * a * c));
				
				if(discriminant < 0) {
					System.out.print("The equation has no real root.");
			}
			
			double r1 = ((-b) + (Math.pow(discriminant, 0.5))) / (2 * a);
			
				if(discriminant == 0) {
					System.out.printf("The equation has one root. %f%n", r1);
			}
			
			double r2 = ((-b) - (Math.pow(discriminant, 0.5))) / (2 * a);
			
				if(discriminant > 0) {
					System.out.printf("The equation has two roots %f and %f%n", r1, r2);
				}
				input.close();
			}

		}

