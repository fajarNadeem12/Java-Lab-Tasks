public class Activity5 {
    public static void main(String[] args) {

        
        Student s1 = new Student(1, "Ali", 20);
        Student s2 = new Student(2, "Sara", 30);

        s1.rename("Hira");
        s1.addCredits(5);

        s1.printSummary();
        System.out.println();

        s2.printSummary();

	public void printSummary() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Completed Credits: " + completedCredits);
    }
}