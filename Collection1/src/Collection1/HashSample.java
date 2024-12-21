package Collection1;

import java.util.HashMap;

public class HashSample {
public static void main(String args[]) {
	HashMap h=new HashMap();
	h.put(10,"Sachin");
	h.put(7,"MSD");
	h.put(18, "kohli");
	System.out.println(h);
	h.put(7, "MSD");
	System.out.println(h);
	System.out.println(h.containsKey(10));
	System.out.println(h.containsValue("MSD"));
	System.out.println(h.replace(7, "Swetha"));
	System.out.println(h);
}
}
