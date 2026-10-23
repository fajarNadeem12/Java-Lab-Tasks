public class DeliveryDesk{
	private String deskName;
	private FoodOrder[] orders;
	private DeliveryRider[] riders;
	private int orderCount ;
	private int riderCount;

public DeliveryDesk(String deskName){
	this.deskName = deskName ;
	this.orders =new FoodOrder[3];
	this.riders = new DeliveryRider[2];
	this.orderCount = 0;
	this.riderCount = 0;
}
public void addOrder(FoodOrder order){
	if(order == null){
	return;
}
if (orderCount < orders.length){
	orders[orderCount] = order;
	orderCount++;
	System.out.println ("order added successfully");
}
else{
System.out.println("cannot add order");
}
}
public void addRider(DeliveryRider rider){
if (rider==null){
	return;
}
if(riderCount< riders.length){
	riders[riderCount] = rider;
	riderCount++;
	System.out.println("Rider Added successfully");
}
else{
System.out.println("rider cannot add");
}
}
public void displayDesk(){
	System.out.println("Desk name: " + deskName);
	for (int i = 0; i< riderCount ; i++){
		riders[i].displayInfo();
}
System.out.println("\n---REgistered orders---");
for (int i = 0 ; i<orderCount ; i++){;
	orders[i].displayOrder();
}
}
}
