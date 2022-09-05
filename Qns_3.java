package aug25;

import java.util.HashMap;

public class Qns_3 {

	public static void main(String[] args) {
		 HashMap <Integer,String> s1=new HashMap <Integer,String> ();
		 HashMap <Integer,String> s2=new HashMap <Integer,String> ();
				
			s1.put(1,"satish");
			s1.put(2,"hima");
			s1.put(3,"nag");
			s1.put(4,"anay");
			s2.put(5,"anil");
			s2.put(6,"bharth");
			s2.put(7,"sesi");
			
			s2.putAll(s1);
			System.out.println(s2);
		
	}

}
