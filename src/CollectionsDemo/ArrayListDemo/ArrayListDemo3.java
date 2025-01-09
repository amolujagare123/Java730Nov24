package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty()); //

        al.add("John");
        al.add("Sophia");
        al.add("David");
        al.add("Emma");
        al.add("Liam");

        System.out.println(al.isEmpty()); //

        System.out.println(al);

        al.clear();
        System.out.println(al);


    }
}
