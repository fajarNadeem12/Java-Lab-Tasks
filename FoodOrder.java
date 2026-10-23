public class FoodOrder{
	private String orderId;
	private Customer customer;
	private Bill bill;

public FoodOrder(String orderId , Customer customer , String bill , String billNumber, double totalAmount ){
	this.orderId = orderId;
	this.customer = customer;
	this.bill = new Bill(billNumber , totalAmount);
}
public String getOrderId(){
	return orderId;
}
public Customer getCustomer(){
	return customer;
}
public Bill getBill(){
	return bill;
}
public void displayOrder(){
	System.out.println("order Id: " + orderId);
if(customer != null){
	customer.displayInfo();
}
if (bill!=null){
	bill.displayBill();
}
}
}
	

