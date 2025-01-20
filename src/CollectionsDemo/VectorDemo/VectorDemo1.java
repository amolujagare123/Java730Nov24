package CollectionsDemo.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.add("John");
        v.add("Sophia");
        v.add("David");
        v.add("Emma");
        v.add("Liam");

        System.out.println(v);

        System.out.println("printing elements using for loop");
        for (int i = 0 ;i<v.size();i++)
            System.out.println(v.get(i));


        System.out.println("printing elements using for each loop");
        for(String str :v)
            System.out.println(str);

        System.out.println("printing elements using iterator");

        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("printing elements using Enumeration");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());


    }
}
