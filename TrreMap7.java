package aug25;

import java.util.*;

public class TrreMap7 {

	public static void main(String[] args) {
		TreeMap<String,String> s1 = new TreeMap<String,String> ();
		  
		  s1.put("c5", "Red");
		  s1.put("c4", "Green");
		  s1.put("c3", "Black");
		  s1.put("c2", "White"); 
		  System.out.println(s1); 
		    }


class sort_key implements Comparator<String>{
		     public int compare(String str1, String str2) {
		        return str1.compareTo(str2);

	}

}

}
