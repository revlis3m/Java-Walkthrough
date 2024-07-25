package Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List l = new LinkedList();
        l.add(22);
        l.add("Siue");
        l.add(13.22f);

        for (int i = 0; i < l.size(); i++) {
            System.out.println("Element at index "+ (i+1) + " = " + l.get(i));
        }

        ListIterator li = l.listIterator();
        
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        ArrayList al = new ArrayList();
        al.add(12);
        al.add("Dop me");
        al.add(12.20f);
        al.add('d');

        for(int i = 0; i < al.size(); i++)
        {
        System.out.println("data at index " + i + " = " + al.get(i));
        }

        //Map
        Hashtable ht = new Hashtable();
        ht.put(1, "spring");
        ht.put(10, "summer");
        ht.put(12, "autumn");
        ht.put(45, "winter");

        Enumeration e = ht.elements();

        while(e.hasMoreElements())
        System.out.println(e.nextElement());

        HashSet hs = new HashSet();
        hs.add("toto");
        hs.add(12);
        hs.add('d');

        Iterator it = hs.iterator();
        while(it.hasNext())
        System.out.println(it.next());

        System.out.println("\nReading the object array");
        System.out.println("-----------------------------------");

        Object[] obj = hs.toArray();
        for(Object o : obj)
        System.out.println(o); 
    }
}
