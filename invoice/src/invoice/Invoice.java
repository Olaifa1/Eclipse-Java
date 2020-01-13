package invoice;

public class Invoice {

	private String partNumber;
	private String partDescription;
	private int qtyOfItem;
	private Double itemPrice;
	
	public Invoice() {
		
	}

	
	public String getPartNumber() {
		return partNumber;
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQtyOfItem() {
		
		return qtyOfItem;
	}

	public void setQtyOfItem(int qtyOfItem) {
		if(qtyOfItem < 0) {
			qtyOfItem = 0;
		}
		this.qtyOfItem = qtyOfItem;
	}

	public Double getItemPrice() {
			return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		if(itemPrice < 0) {
			itemPrice = 0.0;
		}
		this.itemPrice = itemPrice;
	}
	
	public Double InvoiceAmount(){
			Double getInvoiceAmount = getQtyOfItem() * getItemPrice();
			return getInvoiceAmount;
			}
	


}
	