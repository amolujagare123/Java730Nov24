package CollectionsDemo.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        System.out.println("Size="+v.size());// 0
        System.out.println("Capacity="+v.capacity());//10

        v.add("John");
        v.add("Sophia");
        v.add("David");
        v.add("Emma");
        v.add("Liam");
        v.add("John");
        v.add("Sophia");
        v.add("David");
        v.add("Emma");
        v.add("Liam");
        v.add("Liam");
        v.add("David");
        v.add("Emma");
        v.add("Liam");
        v.add("John");
        v.add("Sophia");
        v.add("David");
        v.add("Emma");
        v.add("Liam");
        v.add("Liam");
        v.add("Liam");

        System.out.println(v);
        System.out.println("Size="+v.size()); // 21
        System.out.println("Capacity="+v.capacity());//10




    }
}
