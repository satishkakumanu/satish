package aug25;

import java.util.*;

public class Qns_1 {

	public static void main(String[] args) {
		HashMap <Integer,String> map=new HashMap <Integer,String> ();
		
		map.put(1,"satish");
		map.put(2,"hima");
		map.put(3,"nag");
		map.put(4,"anay");
		
		for (Map.Entry  m: map.entrySet()) {
			System.out.println(m);
			
		}

	}

}
