package Collections;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class List01 {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(12);
        System.out.println("Value inside list is : "+list);
        list.remove(1);
        System.out.println("After removing the element : "+list );
        List<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        System.out.println("Value inside List 2 : "+list2);
        System.out.println("Adding list 2 elements inside list 1 ");
        list.addAll(list2);
        System.out.println("Value inside list 1 : "+list);
        list.removeAll(list2);
        System.out.println("Removing elements of list 2 from list 1 : "+list);
        System.out.println("Clearing value from list 2 : ");
        list2.clear();
        System.out.println(list2.size());
        java.util.Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println("Value inside list is : "+iterator.next());
        }

    }    
}
