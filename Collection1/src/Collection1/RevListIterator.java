package Collection1;

import java.util.LinkedList;
import java.util.ListIterator;

public class RevListIterator {
	public static void main(String args[]) {

	LinkedList al1=new LinkedList();
	al1.add(30);
	al1.add(20);
	al1.add(8);
	al1.add("hello");
	ListIterator l=al1.listIterator(al1.size());
	while(l.hasPrevious()) {
		System.out.println(l.previous());
	
	}
}
}