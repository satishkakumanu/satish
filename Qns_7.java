package aug25;

import java.util.HashMap;

public class Qns_7 {

	public static void main(String[] args) {
		 HashMap <Integer,String> s1=new HashMap <Integer,String> ();

			s1.put(1,"satish");
			s1.put(2,"hima");
			s1.put(3,"nag");
			s1.put(4,"anay");
			
			System.out.println(s1);

if (s1.containsKey(2))	{
	System.out.println("yes");
}
else {
	System.out.println("no");
}
if (s1.containsValue("anil")) {
	System.out.println("yes");
}
else {
	System.out.println("no");
}
	}

}
