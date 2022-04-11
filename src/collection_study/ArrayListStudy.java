package collection_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args)
	{
	ArrayList al=new ArrayList<>(); //created array list
	al.add("India");
	al.add('J');
	al.add(8);
	al.add(null);
	al.add("Pune");
	al.add(null);
	al.add(3.88);
	al.add(456);
	al.add(null);
	
	System.out.println(al);
	System.out.println(al.get(5));
	System.out.println(al.size());
	 
	al.add(3,"Jemini");
	System.out.println(al);
	al.remove(null);
	System.out.println(al);
	System.out.println(al.isEmpty());
	System.out.println(al.contains(123));
	System.out.println(al.get(5));
	
	System.out.println("=========by using for loop========");
	for (int i = 0; i < al.size()-1; i++)
	{
	    System.out.println(al.get(i));
		
	}
	
	System.out.println("=========By Using Iterator=========");
	
	Iterator it = al.iterator();  //created iterator
	while (it.hasNext())
	{
	  System.out.println(it.next());
	}
	
	System.out.println("============By Using For each==========");
	
	for (Object o : al)
	{
	 System.out.println(o);
		
	}
	
	System.out.println("=====================================================================================");
	
	ArrayList<string>als=new ArrayList<>();
	
	als.add("one");
	als.add("two");
	als.add("three");
	als.add("four");
	
	System.out.println("============By using For each==========");
	for (string s: als)
	{
		System.out.println(s);
	}
	
	System.out.println("=============By Using list iterator===========");
	ListIterator<string>i= als.listIterator();
	
	while (i.hasNext()) 
	{
		System.out.println(i.next());
		
	}
	
	}

}
