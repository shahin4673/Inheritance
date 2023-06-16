package Code1;

public class Student extends Person{
	private int id=4980;
	private double cgpa=3.84;
	
	public void display()
	{
		System.out.println("Name : "+ name);
		System.out.println("Age : "+age);
		System.out.println("id : "+id);
		System.out.println("CGPA: "+ cgpa);
		
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		
		
		
			
			
		}
		

	}

