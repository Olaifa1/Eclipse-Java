	import java.util.Scanner;
	public class AverageScore {
			
			
			public double average() {
				int counter = 0;
				double score = 0.0;
				double total = 0.0;
				double average = 0.0;
				int student = 0;
				Scanner input = new Scanner(System.in);
				System.out.print("Enter number of Students: ");
				counter = input.nextInt();
				while(counter > 0) {
					System.out.print("Enter Score: ");
					score = input.nextDouble();
					total = total + score;
//					counter decreasing.  
					counter--;
//					student increasing.
					student++;
				}
				average = total / student;
				return average;		
			}
		public double sentinelAverage() {
			int score = 0;
			double average = 0.0;
			int total = 0;
			int student = 0;
			
			System.out.print("Enter score or -2 to terminate: ");
			Scanner input = new Scanner(System.in);
			score = input.nextInt();
			
			while(score != -2) {
				total = total + score;
				System.out.print("Enter score or -2 to terminate: ");
				score = input.nextInt();
				
				total = total + score;
				average = total / student;
				
				if(student != 0) {
					average = total + score;
				}
				else {
					average = 0.0;
				}
				
			}
			return average;
		}
}
