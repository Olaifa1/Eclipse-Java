import java.util.Date;
public class HumanTest {

	public static void main(String[] args) {
		
		Date birthday = new Date();
		Human waliu = new Human (birthday);
		
		System.out.printf("Waliu's Date of Birth is %s%n", waliu.getDateOfBirth());
	}

}
