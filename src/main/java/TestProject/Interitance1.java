package TestProject;

public class Interitance1 {
	
	public void P1()
	{
		System.out.println("Parent method-1 with public identifier");
	}
	
	public static void P2()
	{
		System.out.println("Parent method-2 with public & static identifier");
	}
	
	static
	{
		System.out.println("inside static method");
	}
	
	public Interitance1()
	{
		System.out.println("Inside Constructor method");
	}

	public static void main(String[] args) 
	{
		Interitance1 I1= new Interitance1();
		Interitance1.P2();
		I1.P1();
	}

}
