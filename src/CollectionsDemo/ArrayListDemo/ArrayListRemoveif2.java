package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveif2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(22);
        al.add(13);
        al.add(42);
        al.add(15);
        al.add(42);
        al.add(52);
        al.add(63);
        al.add(72);
        al.add(85);

        System.out.println(al);

        // remove all even numbers
        // remove all numbers less than 40
    //    al.removeIf(i ->   i%2==0 );
        al.removeIf(i ->   i<40 );
        System.out.println(al);



    }
}
