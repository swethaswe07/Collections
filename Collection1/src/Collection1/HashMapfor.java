package Collection1;

import java.util.HashMap;

public class HashMapfor {

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
			for(Object obj:h.entrySet()) {
				
				System.out.println(obj);
		}
			
		}


	}


