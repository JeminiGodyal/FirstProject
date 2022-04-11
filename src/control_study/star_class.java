package control_study;
import java.util.Scanner;
public class star_class
{

	public static void main(String[] args) 
	{
		
		for(int i=1;i<=6;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);		
				
			}
			System.out.println();
		}
	
		System.out.println();
		
		int k=1;
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter matrix size");
		
		System.out.println(" Enter 9 numbers now:");
		int temp;
		while(k<=3) 
		{
		//	System.out.print("[");	
			for(int j=1;j<=3;j++)
			{ 
				int m = sc.nextInt();
				temp=m;
				//System.out.print(" "+temp);
			
			}
		
			//System.out.print("]");
			System.out.println();
			k++;
		}
	}
	
	
	
}
