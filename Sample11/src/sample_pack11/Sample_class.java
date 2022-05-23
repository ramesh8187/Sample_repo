package sample_pack11;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Sample_class {

	public static void main(String[] args) {
		
		LinkedList<String> li= new LinkedList<String>();
		li.add("10");
		li.add("20");
		li.add("30");
		li.add("40");
		System.out.println("linked list size=="+li.size());
		System.out.println("last elemrnt in linked list=="+li.getLast());
		
		
		Set<String> hs=new LinkedHashSet<String> ();
		hs.add("alpha");
		hs.add("beta");
		hs.add("gama");
		
		
		
		System.out.println("hashset=="+hs);
             
             

	}

}
