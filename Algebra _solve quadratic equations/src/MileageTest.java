

import java.util.Scanner;

public class MileageTest {

	public static void main(String[] args) {
		//Mileage object = new Mileage();
		Scanner input = new Scanner(System.in);
		
		double milesPerGallon = 0;
		int milesGallonCounter = 0;
			
		System.out.print("Enter Miles Driven: ");
			int miles = input.nextInt();
				
		System.out.print("Enter Gallons Used: ");
			int gallons = input.nextInt();
		
		milesPerGallon = (miles / gallons);
			double totalMG = milesPerGallon;
			
		while (gallons != -1 && miles != -1) {
			
			milesGallonCounter = milesGallonCounter + 1;
				
			System.out.print("Enter Miles Driven: ");
			miles = input.nextInt();
				
			System.out.print("Enter Gallons Used: ");
			gallons = input.nextInt();
					
			milesPerGallon = (miles / gallons);
			totalMG = totalMG + milesPerGallon;
		}
			
			
		if (milesGallonCounter != 0) {
			System.out.printf("%nMiles per Gallon of %d trip(s) = %.2f", milesGallonCounter, totalMG);
		}
		else {
			System.out.println("No Miles And Gallons were entered");
		}			
		input.close();
	}

}
