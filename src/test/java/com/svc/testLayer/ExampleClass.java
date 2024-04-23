package com.svc.testLayer;



import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class ExampleClass {
	
	
	
	
	@Test
	public void DemoMethod()
	{
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Sree");
		list.add("Kanth");
		list.add("From DMM");
		list.add("Bengaluru");
		list.add("Hyderabad");
		
		
		for(int i=0;i<list.size();i++)
		{
			
			System.out.println(list.get(i));
			
		}
		
		
		
		
		
		
		
//		Iterator<String> itr=list.iterator();
//		
//		while(itr.hasNext())
//		{
//		System.out.println(itr.next());	
//		}
		
	}
	
	
	

}
