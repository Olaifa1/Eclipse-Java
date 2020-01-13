package invoice;
import java.util.Scanner;
public class InvoiceDriver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		Invoice walmart = new Invoice();
		Invoice shoprite = new Invoice();
	System.out.println("Enter Part Number For Walmart: ");
	String partNumber = input.nextLine();
	walmart.setPartNumber(partNumber);
	
	System.out.println("Enter Part Number For Shoprite: ");
	String partNumber1 = input.nextLine();
	shoprite.setPartNumber(partNumber1);
	
	
	System.out.println("Enter Part Description: ");
	String partDescription = input.nextLine();
	walmart.setPartDescription(partDescription);
	
	System.out.println("Enter Part Description For Shoprite: ");
	String partDescription1 = input.nextLine();
	shoprite.setPartDescription(partDescription1);
	
	System.out.println("Enter Quantity of Item For Walmart: ");
	int qtyOfItem = input.nextInt();
	walmart.setQtyOfItem(qtyOfItem);
	
	System.out.println("Enter Quantity of Item For Shoprite: ");
	int qtyOfItem1 = input.nextInt();
	shoprite.setQtyOfItem(qtyOfItem1);
	
	System.out.print("Enter Price of Item For Walmart: #");
	Double itemPrice = input.nextDouble();
	walmart.setItemPrice(itemPrice);
	
	System.out.print("Enter Price of Item For Shoprite: #");
	Double itemPrice1 = input.nextDouble();
	shoprite.setItemPrice(itemPrice1);
	
	System.out.printf("Walmart's Invoice Amount for the month is:#%f %n", walmart.InvoiceAmount());
	System.out.printf("Shoprite's Invoice Amount for the month is:#%f %n", shoprite.InvoiceAmount());
	}

}
