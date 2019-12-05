package listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistConcept {

	public static void main(String[] args) {

		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("Qtp");
		ll.add("RR");
		ll.add("Selenium");
		
		//System.out.printf("Content of linkedlist--ll %s",ll);
		
		System.out.println("Content of linkedlist" +ll);
		
		//addfirst() method---to add an element at the first position
		
		ll.addFirst("test");
		System.out.println("Content of linkedlist" +ll);
		
		//addlast() method--to add an element at the last position
		
		ll.addLast("RFT");
		System.out.println("Content of linkedlist" +ll);
		
		//get() --to get an element at particular index
		
		ll.get(0);
		System.out.println(ll.get(2));
		
		//set()--to set a value at particular index
		ll.set(0, "shilpa");
		System.out.println("Content of linkedlist" +ll);
		
		//removefirst()
		
		ll.removeFirst();
		System.out.println("Content of linkedlist" +ll);

		//removelast()
		
		ll.removeLast();
		System.out.println("Content of linkedlist" +ll);

		//remove()--on the basis of index
		ll.remove(1);
		System.out.println("Content of linkedlist" +ll);

		//how to print all the values of linkedlist using
		
		//for loop--
		for(int n=0;n<ll.size();n++)
		{
			System.out.println(ll.get(n));
		}
		
		//advanced for loop---
		for(String str:ll)
		{
			System.out.println(str);
		} 
		//Iterator---
		
		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//while loop--
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num=num+1;
		}
		
		
		
		


	}

}
