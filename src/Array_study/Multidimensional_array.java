package Array_study;

public class Multidimensional_array 
{

	public static void main(String[] args) 
	{
//		//array declaration
//		char ar[][]=new char[2][2];
//		
//		 //array initialization
//		ar[0][0]='a';
//		ar[0][1]='b';
//		ar[1][1]='c';
//		ar[1][2]='d';
//		
//		//usage
//		for(int i=0;i<=ar.length-1;i++)  //for outer=row-0-1-2
//		{
//			for(int j=0;j<=ar.length-1;j++)
//			{
//				System.out.print(ar[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
	//declaration and initialization
		char ar[][]= {{'a','b','c'},{'d','e','l'},{'k','f','m'}};
		for(int i=0;i<=ar.length-1;i++)
		{
			
			for(int j=0;j<=ar.length-1;j++) 
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
			}
		}
		
		
		
	}


