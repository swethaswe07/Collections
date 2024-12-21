package Collection1;
import java.util.TreeSet;
public class Binary1 {
	public static void main(String args[])
	{
		TreeSet t=new TreeSet();
        t.add(80);
        t.add(75);
        t.add(50);
       Object a=t.ceiling(40);
       System.out.println(a);
       t.higher(40);
       t.floor(40);
        t.lower(40);
        System.out.println(t);
        t.add(90);
        System.out.println(t);
        
	}
}
