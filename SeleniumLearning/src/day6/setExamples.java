package day6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExamples {

	public static void main(String[] args) {
		
		//Set s=new Set();//Set is interface, cant create object of Interface because it does not have methods
//therefore create object of classes which implement set interface
		
		
		Set s=new HashSet();//generic, consider evertyhing as object
		s.add("Gurmat");
		s.add("10");
		s.add("Rimi");
		s.add("10.97");
		s.add('g');
		s.add(false);
		

		Iterator<Object> itr=s.iterator();
		
		itr.next();//returns object
		
		
		System.out.println(s);
		
	}

}
