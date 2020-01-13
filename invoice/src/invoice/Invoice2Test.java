package invoice;

public class Invoice2Test {

	public static void main(String[] args) {
	Invoice2 shoprite = new Invoice2("Were", "Say", -675, 505.0);
	shoprite.getPartNumber();
	shoprite.getPartDescription();
	shoprite.setQtyOfItem(675);
	shoprite.getQtyOfItem();
	shoprite.setItemPrice(505.0);
	shoprite.getItemPrice();
	shoprite.getInvoiceAmount2();
	
	System.out.printf("Invoice Amount for Shoprite is #%.0f", shoprite.getInvoiceAmount2());
	}

}
