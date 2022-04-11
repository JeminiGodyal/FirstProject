package Abstract_study;

public class test_case2 extends test_case
{
	int a=100;
	static int b=300;
	 int c=120;
	public static void main(String[] args) 
	{
		
		test_case2 obj=new test_case2();
		obj.demo1();
		obj.demo2();
		System.out.println(obj.c);
		
		obj.demo();
	}
 
		public void demo() 
		{
		 int a=20;
		 int b=30;
		 int sum=this.a+this.b+super.c;
		 System.out.println("sum is equal to "+sum);
		}
}
