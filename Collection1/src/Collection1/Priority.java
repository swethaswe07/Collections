package Collection1;
import java.util.PriorityQueue;
public class Priority {
	public static void main(String args[]) {
PriorityQueue pq=new PriorityQueue();
pq.add(25);
pq.add(50);
pq.add(125);
pq.add(100);
pq.add(75);
pq.add(125);
pq.add(175);
System.out.println(pq);
System.out.println(pq.peek());
System.out.println(pq.poll());
System.out.println(pq);
System.out.println(pq.add(30));
System.out.println(pq);
System.out.println(pq.toString());
	}
}
