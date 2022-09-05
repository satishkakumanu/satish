package aug25;

import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		TreeMap <Integer,String> s1=new TreeMap<Integer,String>();
		TreeMap <Integer,String> s2=new TreeMap<Integer,String>();
	
		s1.put(6, "nag");
		s1.put(5, "anay");
		s1.put(4, "anil");
		s1.put(4, "hima");
		s2.put(1, "satish");
		s2.put(2, "sesi");
		s2.put(3, "kumar");
		
		s2.putAll(s1);
		   System.out.println(s2);   

	}

}
