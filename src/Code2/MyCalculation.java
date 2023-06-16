package Code2;

public class MyCalculation extends Calculation{
	
	public void multiplication(int a,int b)
	{
		z=a*b;
		System.out.println("multiplication is "+z);
	}
	public void division(int a,int b)
	{
		z=a/b;
		System.out.println("division is "+z);
	}
	
	

	public static void main(String[] args) {
		int a=10,b=5;
		MyCalculation c = new MyCalculation();
		c.addition(a, b);
		c.subtraction(a, b);
		c.multiplication(a, b);
		c.division(a, b);
		
		
		

	}

}
