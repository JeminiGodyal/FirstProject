package PolymorphismStudy;
import java.lang.*;

public class poly_study
{

	public static void main(String[] args) {
		
//		poly_study t= new poly_study();
//		t.addition(11.11f,22.22f);
//		t.addition(11, 22);
//		t.addition(10, 20);
//		t.addition();
//		addition(30, 11.99f);
		String s= "Rohit";
		System.out.println(s.endsWith("it"));
		String s1 = new String("Jemini");
		System.out.println("Char at++++"+s1.charAt(4));
		
		String s2=s1.intern();
		s2=s2+" Godyal";
		System.out.println(s2);
		
		int a=15;
		String s3=String.valueOf(a);
		s3=s3+" Jem";
		System.out.println("String s3="+s3);
		String s4 = s3.replace("15", "God");
		System.out.println(s4);
		
		System.out.println("Compares "+s2.compareTo(s3));
		System.out.println(s2.concat(s4));
		System.out.println(s2.contains("Jem"));
		char[] s5= {'R','E','S','P','E','C','T'};
		s3= s3.copyValueOf(s5, 0, 7);
		System.out.println("new s3="+s3);
	
		String test ="";
		System.out.println(test.isBlank());
		
		
		
	}
	
	
//	public void addition()
//	{
//		int a=100;
//		int b=200;
//		int sum=a+b;
//		System.out.println("Addition is "+sum);
//	}
//	
//	public void addition(int a, int b)
//	{
//		int sum=a+b;
//		System.out.println("Addition is "+sum);
//	}
//	
//	public void addition(float a, float b)
//	{
//		double sum=a+b;
//		System.out.println("Addition is "+sum);
//	}
//	
//	public void addition(long a, long b)
//	{
//		long sum= a+b;
//		System.out.println("Addition is "+sum);
//	}
//	
//	public static void addition(int a,float b)
//	{
//		float sum=a+b;
//		System.out.println("Addition is "+sum);
//	}

}