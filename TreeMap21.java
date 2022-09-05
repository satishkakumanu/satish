package aug25;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap21 {

	public static void main(String[] args) {
		TreeMap <Integer,String> s1=new TreeMap<Integer,String>();
		SortedMap < Integer, String > s2 = new TreeMap < Integer, String > ();
		s1.put(1, "satish");
		s1.put(6, "nag");
		s1.put(5, "anay");
		s1.put(3, "anil");
		s1.put(4, "hima");
		
		
		 System.out.println( s1);
		  s2 = s1.subMap(1, 5);
		  System.out.println( s2);

	}

}
