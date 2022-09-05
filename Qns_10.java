package aug25;

import java.util.HashMap;

public class Qns_10 {

	public static void main(String[] args) {
		 HashMap <Integer,String> s1=new HashMap <Integer,String> ();

			s1.put(1,"satish");
			s1.put(2,"hima");
			s1.put(3,"nag");
			s1.put(4,"anay");
		
		  String s=(String)s1.get(2); 
		   
		   System.out.println( s);

	}

}
