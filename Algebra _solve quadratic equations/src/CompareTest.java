public class CompareTest {

	public static void main(String[] args) {
		Compare object = new Compare(0, 0);
		object.setFirstNumber(100);
		object.setSecondNumber(100);
		System.out.print(object.compare(object.getFirstNumber(), object.getSecondNumber()));

		for(int i = 1; i <= 21; i++) {
			System.out.println("hello Bako");
		}
	
		System.out.println("Serial Number\tName");
		for(int i = 1; i < 41; i++) {
			System.out.printf("%d.		Waliu%n",i);	// To print  serial number 1. - 40. and Waliu, using for loop.
		}
		
		//To print "Hello Waliu" with WHILE LOOP
		int i = 0;
		while(i < 2) {
			System.out.println("hello Waliu");
			i++;
		}
		// To print  serial number 1. - 40. and Waliu, using while loop.
		System.out.println("Serial Number\tName");
		int i1 = 1;
		while(i1 < 41) {
			System.out.printf("%d.		Waliu%n",i1);
			i1++;
		}
		
		
		//To print "Hello Waliu" infinitely using DO WHILE
		int i2 = 0;
		do {
			System.out.println("hello Waliu");
			i++;
		}
		while(i2 < 2);
	}
	
}