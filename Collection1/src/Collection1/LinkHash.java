package Collection1;


import java.util.LinkedHashMap;

public class LinkHash {


public static void main(String args[]) {
	LinkedHashMap h=new LinkedHashMap();
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

