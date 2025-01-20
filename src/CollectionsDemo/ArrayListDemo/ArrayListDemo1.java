package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add(12);
        al.add(22);
        al.add(13);
        al.add(42);
        al.add(15);
        al.add(1.5);
        al.add('a');
        al.add("amol1");
        al.add("amol2");
        al.add("amol3");
        al.add("amol4");
        al.add("amol5");

        System.out.println(al);

        System.out.println("size="+al.size());

        System.out.println("printing elements using for loop");
        for (int i=0;i<al.size();i++)
            System.out.println(al.get(i));

        System.out.println("printing elements using for each loop");
        for(Object o:al)
            System.out.println(o);

        System.out.println("printing elements using iterator");

        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
