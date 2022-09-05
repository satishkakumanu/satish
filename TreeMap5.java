package aug25;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap5 {

	public static void main(String[] args) {
		TreeMap <Integer,String> s1=new TreeMap<Integer,String>();
		s1.put(1, "satish");
		s1.put(6, "nag");
		s1.put(5, "anay");
		s1.put(4, "anil");
		s1.put(4, "hima");
		
		Set<Integer> s = s1.keySet();
        for(Integer key: s){
            System.out.println(key);
        }

	}

}
