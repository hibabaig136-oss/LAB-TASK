public class MultipleObjects{
	public static void main(String args[]){
	Student s1 = new Student();
	Student s2 = new Student();

	s1.id = 22;
	s1.name = "HIBA";
	s1.completedCredits = 18;

	
	s2.id = 65;
	s2.name = "SARA";
	s2.completedCredits = 15;

	s1.printSummary();
	s2.printSummary();

	s1.name = "AMNA";
	s1.completedCredits = 20;

	s1.printSummary();
	s2.printSummary();
	}

}