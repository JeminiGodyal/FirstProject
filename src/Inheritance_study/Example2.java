package Inheritance_study;

public class Example2
{
	static String shape=" round";
	protected static char quality='A';
	
	public void fan()
	{
	 String speed="45rpm ";
	 int size=10;
	 
	 System.out.println("fan speed is "+speed+"size is this "+size);

	}
	
	protected void blades()
	{
		int num=3;
		String colour="brown";
		System.out.println("number of blades are "+num);
		System.out.println(colour);
	}

}
