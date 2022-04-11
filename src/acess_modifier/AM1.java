package acess_modifier;

public class AM1 extends tara
{
	static int a=12;
	static int b=30;
	String colour="blue";
	double num=38.55d;
	float idnum=4f;
	
	
	

	public static void main(String[] args) 
	{
		AM1 m1=new AM1();
		m1.test1();
		m1.test2();
		AM1 s1=new AM1();
		s1.test1();
		s1.test2();
		System.out.println();
		s1.ms1();
		

	}

	public void ms1()
	{
		int a=90;
		int b=50;
		int c= this.a+this.b+a;
		System.out.println(c);
		
		
	}
}
