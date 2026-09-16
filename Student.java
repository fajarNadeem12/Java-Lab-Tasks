public class Student{
	int id;
	String name;
	int completedCredits;
	
	void printSummary(){
	System.out.println(id + " "+ name +" "+  completedCredits);
	
	}

	public void addCredits(int amount) {
    completedCredits = completedCredits + amount;
}

s1.addCredits(5);

System.out.println(s1);
System.out.println(s2);




}