package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemove2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(22);
        al.add(13);
        al.add(42);
        al.add(15);

        System.out.println(al);

       // al.remove(2);

        Integer value = 13;
        al.remove(value);

        System.out.println(al);



    }
}
