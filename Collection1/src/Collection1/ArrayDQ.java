package Collection1;
import java.util.ArrayDeque;
public class ArrayDQ {
public static void main(String args[]) {
	ArrayDeque ad=new ArrayDeque();
	ad.add(10);
	ad.add(10);
	ad.addFirst(30);
	ad.addLast(70);
	System.out.println(ad);
	System.out.println(ad.contains(10));
	System.out.println(ad);
     //ad.Index(10);
     //ad.get(3);
     System.out.println(ad.isEmpty());
     System.out.println(ad.containsAll(ad));
     System.out.println(ad.size());
 	ad.addLast(20);
     System.out.println(ad);
    System.out.println(ad.getLast());
    System.out.println(ad.getFirst());
    //System.out.println(ad.index(3));
    
}
}
