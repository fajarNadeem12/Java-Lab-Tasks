public class Main{

	public static void main (String[] args){
	MyBook b1 = new MyBook("B001" , "Java OOP" , "BC101" , "S1" , "Dr.Bhatti");
	MyBook b2 = new MyBook("B002" , "Data Structures", "BC102", "S1", "Mark");
	Magazine m1 = new Magazine ("M001", "Tech Today", "BC201", "S2", 101);
	
	LibrarySection section = new LibrarySection("Computing Section");

	section.addItem(b1);
	section.addItem(b2);
	section.addItem(m1);
	
	section.displayItems();


	MyBook b3 = new MyBook("B003", "Algorithms", "BC103", "S3", "Cormen");
        Magazine m2 = new Magazine("M002", "AI News", "BC202", "S4", 12);

        section.addItem(b3); 
        section.addItem(m2); 

        
        section.displayItems();
    }
}