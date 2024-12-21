package Collection1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class HashMapIterator {
	public static void main(String args[]) {
		HashMap h=new HashMap();
		h.put(1,"Jk");
		h.put(2, "Alekhya");
		h.put(3, "Sandhu");
		h.put(30, "Ammu");
		h.put(4, "Lohi");
		h.put(5,"kaya");
		h.put(7,"Tekku");
		h.put(8,"Depu");
		h.put(9,"Hashi");
		
	Collection c=h.values();
	Iterator i=c.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		
	}
	
	Set c1=h.keySet();
	Iterator j=c1.iterator();
	while(j.hasNext()) {
		System.out.println(j.next());
		
	}
	
	Set c2=h.entrySet();
	Iterator k=c2.iterator();
	while(k.hasNext()) {
		System.out.println(k.next());
	}
	}


}
