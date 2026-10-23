public class Main2{
  public static void main(String[] args){
	Customer C1 = new Customer("101" , "fajar" , "lhr");
	DeliveryRider R1 = new DeliveryRider("101" , "amina" , "34" );
	DeliveryRider R2 = new DeliveryRider("103" , "fatima" , "09" );

	FoodOrder F1 = new FoodOrder("87" , C1 , "b1001" ,"234" , 1234.66);
	FoodOrder F2 = new FoodOrder("099" , C1 , "c4651" , "345" , 1234.06);


	DeliveryDesk desk = new DeliveryDesk("Fast-Track Delivery Desk");
	desk.addRider(R1);
	desk.addRider(R2);

	desk.addOrder(F1);
        desk.addOrder(F2);

	desk.displayDesk();
}
}