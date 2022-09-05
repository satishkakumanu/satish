package aug25;

import java.util.TreeMap;

public class TreeMap13 {

	public static void main(String[] args) {
		TreeMap <Integer,String> s1=new TreeMap<Integer,String>();
		s1.put(1, "satish");
		s1.put(6, "nag");
		s1.put(5, "anay");
		s1.put(4, "anil");
		s1.put(4, "hima");

		 System.out.println(s1);
		  System.out.println("Key(s): " + s1.headMap(1));
		  System.out.println("Key(s): " + s1.headMap(3));
		  System.out.println("Key(s): " + s1.headMap(5));
		  System.out.println("Key(s): " + s1.headMap(7));

	}

}
