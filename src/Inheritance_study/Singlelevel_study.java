package Inheritance_study;

public class Singlelevel_study 
{

	public static void main(String[] args)
	{
		Mother.nature();
		Daughter.scooty();
		Daughter d=new Daughter();
		d.look();
		d.money();
		d.mobile();
		d.scooty();
		Singlelevel_study obj=new Singlelevel_study();
		obj.laptop();
		

	}
	
	public void laptop()
	{
		System.out.println("main's laptop");
	}
}
