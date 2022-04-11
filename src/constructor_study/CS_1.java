package constructor_study;

public class CS_1 
{
	static int a=50;
	static int b=30;
	int c =55;
	int d=22;
	
	public static void main(String[] args) 
	{
		System.out.println("value of a is"+a);
		System.out.println("b is "+b);
		
		CS_1 c1=new CS_1();
		
		
		System.out.println(c1.c);
		System.out.println(c1.d);
		 
		

	}

	
	public CS_1()
	{
		a=10;
		c=60;
		d=100;
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		
	}
	
	public CS_1(int n,int s,int r) 
	{
	n=22;
	s=66;
	r=33;
	
	}
	
	public void addition()
	{
	 int f=600;
	 int a=90;
	 int sum=a+f;
	 int sum1=b+c;
	 int e=500;
	 
	 
	 System.out.println("value of addition is "+sum);
	 System.out.println("addition is "+sum1);
		
	}
	
	public static void subtraction()
	{
	  int e=200;
	  System.out.println("value of e is"+e);
	 
		
	}
	
	
	
}
