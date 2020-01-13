import java.util.Scanner;
public class HeartRateTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HeartRate doctor = new HeartRate(null, null, 0, 0, 0, 0, 0, 0);
		
		
		System.out.print("Enter First Name: ");
		String firstName = input.nextLine();
		doctor.setFirstName(firstName);
		System.out.printf("First Name: %s%n", doctor.getFirstName());
		
		System.out.print("Enter Last Name: ");
		String lastName = input.nextLine();
		doctor.setLastName(lastName);
		System.out.printf("Last Name: %s%n", doctor.getLastName());
		
		System.out.print("Enter Month Of Birth: ");
		int month = input.nextInt();
		doctor.setMonth(month);
		
		
		System.out.print("Enter Day Of Birth: ");
		int day = input.nextInt();
		doctor.setDay(day);
		
		
		System.out.print("Enter Year Of Birth: ");
		int year = input.nextInt();
		doctor.setYear(year);
		
		
		System.out.printf("Date of Birth: %d / %d / %d%n", doctor.getMonth(), doctor.getDay(), doctor.getYear());
		
		System.out.printf("Age: %d%n", doctor.age());
		
		System.out.printf("Maximum Heart Rate: %.0f beats per minute.%n", doctor.maxHeartRate());
		
		System.out.printf("Target Heart Rate Range: %.0f - %.0f beats per minute.", doctor.targetHeartRate1(), doctor.targetHeartRate2());
	}

}
