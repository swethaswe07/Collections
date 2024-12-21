package Collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(30);
        al1.add(20);
        System.out.println(al1);

        ArrayList<Object> al2 = new ArrayList<>();
        al2.add("Swetha");
        al2.add(24577543);
        al2.addAll(0, al1);
        System.out.println(al1);

        ArrayList<Object> al3 = new ArrayList<>();
        al3.add(al2);
        System.out.println(al3);
        al3.add(0, 3);
        try {
            al3.add(2, 8);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cannot add at index 2: " + e.getMessage());
        }
        al3.clear();
        System.out.println(al3);
        al3.add(al2);
        al3.add(al1);
        System.out.println(al3);
        al3.add(0, 2);
        System.out.println(al3);
        al3.remove(0);
        System.out.println(al3);

        if (al3.contains(1)) {
            System.out.println("al3 contains 1");
        } else {
            System.out.println("al3 does not contain 1");
        }

        Iterator<Integer> i = al1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
