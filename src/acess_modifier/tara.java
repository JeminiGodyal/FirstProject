package acess_modifier;

public class tara
{
	int a=10; //visibility-->default-->within package only
	private int b=20; //visibility-->private-->within class
	protected int c=30; //visibility-->protected-->within package+inheritance for outside package
	public int d=40; //visibility-->public-->within package only
	
	
	public static void main(String[] args)
	{
		tara obj=new tara();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);

	}

	public void test1()
	{
		System.out.println("visibility-->public-->within package only");
		
	}
	
	protected void test2()
	{
		System.out.println("visibility-->protected-->within package+inheritance for outside package");
		
	}
	
	private void test3()
	{
		System.out.println("visibility-->private-->within class");
		
	}
	
	void test()
	{
		System.out.println("visibility-->default-->within package only");
	}
}
