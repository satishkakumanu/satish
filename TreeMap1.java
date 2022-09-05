package aug25;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap <Integer,String> s1=new TreeMap<Integer,String>();
		s1.put(1, "satish");
		s1.put(6, "nag");
		s1.put(5, "anay");
		s1.put(4, "anil");
		s1.put(4, "hima");
		
for(Entry<Integer, String> e :s1.entrySet() ) {
	
	System.out.println(e);
	
}

	}

}
