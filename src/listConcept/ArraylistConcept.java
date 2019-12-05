package listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistConcept {

	public static void main(String[] args) {

		int p[] =new int [3]; //static array--size is fixed
		
		p[0]=10;
		p[1]=20;
		System.out.println(p.length);
		
		System.out.println("/********************/");
		
		ArrayList ar =new ArrayList(); //Dynamic array--nongeneric arraylist i.e we can store any type of data in it.
		ar.add(100);
		ar.add(200);
		ar.add("test");
		ar.add('a');
		
				
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(2));
		System.out.println(ar.get(3));
	
	ArrayList<Integer>ar1=new ArrayList<Integer>(); //generic arraylist--only interger values can be stored in ar1
		
		ar1.add(110);
		ar1.add(120);
		ar1.add(130);
	
		
		//Create employee objects
		
		Employee e1=new Employee("abc",25,"HR");
		Employee e2=new Employee("xyz",28,"dev");
		Employee e3=new Employee("pqr",30,"admin");
		
		//create array of type employee---
		
		ArrayList <Employee> ar2=new ArrayList<Employee>();
		
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		
		//Create Iterator to traverse the employee values---
		
        Iterator<Employee> it =ar2.iterator();		
		while(it.hasNext())
		{
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		System.out.println("/********************/");
	
      //addall() method---to add 2 arraylists
		
		ArrayList<String> ar3=new ArrayList<String>();
		ar3.add("test");
		ar3.add("java");
		ar3.add("javascript");
		
		ArrayList<String> ar4=new ArrayList<String>();
		
		ar4.add("Dev");
		ar4.add("QA");
		ar4.add("admin");
		
		ar3.addAll(ar4);
		
		for(int i=0;i<ar3.size();i++)
		{
			System.out.println(ar3.get(i));
		}
		
		System.out.println("/********************/");

		//removeall() method---to remove one arraylist from the other
		
		ar3.removeAll(ar4);
		for(int i=0;i<ar3.size();i++)
		{
			System.out.println(ar3.get(i));
		}
		
		System.out.println("/********************/");

		//retainall() method---to obtain common values in the 2 arraylists.
	
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("aaa");
		ar5.add("bbb");
		ar5.add("ccc");
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("aaa");
		ar6.add("bbb");
		ar6.add("ggg");
		
		ar5.retainAll(ar6);
	    for(int i=0;i<ar5.size();i++)
	    {
		   System.out.println(ar5.get(i));
	     }
	
	System.out.println("/********************/");

	}

}
