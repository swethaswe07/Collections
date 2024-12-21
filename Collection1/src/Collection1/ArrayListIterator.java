package Collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	public static void main(String args[]) {

	ArrayList al1=new ArrayList();
	al1.add(30);
	al1.add(20);
	al1.add(8);
	al1.add("hello");
	

	  Iterator i=al1.iterator();
	   while(i.hasNext()) {
		   System.out.println(i.next());
		   
	   }
   
  
	}
}

