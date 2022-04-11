package control_study;
import java.util.Scanner;
public class prime_number
{
	public static void main(String[] args)
	{
		int a=1,b=2,c=3;
		System.out.println( a+" "+b+ " "+c);
		Scanner obj=new Scanner(System.in);
		+
		
		System.out.println(" Enter number: ");
		int num = obj.nextInt();

		if((num%num)==0 && (num%1)==0)
		System.out.println("number is Prime");
			else
				System.out.println("Number is not Prime");
	}

}
