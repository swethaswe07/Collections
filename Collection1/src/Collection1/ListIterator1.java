package Collection1;


import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1 {

		public static void main(String args[]) {

		LinkedList al1=new LinkedList();
		al1.add(30);
		al1.add(20);
		al1.add(8);
		al1.add("hello");
		ListIterator l=al1.listIterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		
		}

}
}