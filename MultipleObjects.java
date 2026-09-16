public class MultipleObjects{
	public static void main(String args[]){
	Student s1 = new Student();
	s1.id = 013;
	s1.name = "Noor";
	s1.completedCredits = 15;
	s1.printSummary();

	Student s2 = new Student();
	s2.id = 015;
	s2.name = "fatima";
	s2.completedCredits = 16;
	s2.printSummary();
	
	s1.name = "Khadija";
	s1.completedCredits = 18;
	s1.printSummary();
	s2.printSummary();
	


	
	}





}