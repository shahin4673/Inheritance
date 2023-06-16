package Code4;

public class Student extends Person {
    private int id;
    private double cgpa;
	
	public Student(String n,int id, double cgpa) {
		super("Toufique Ahamed",22);
		this.id =id;
		this.cgpa =cgpa;
	}
	public void display() {
		super.display();
		System.out.println(" ID :"+id);
		System.out.println(" CGPA :"+cgpa);
   
	}
		 

	public static void main(String[] args) {
		Student s1 = new Student("Toufique Ahamed",4980,3.84);
		s1.display();
		

	}

}
