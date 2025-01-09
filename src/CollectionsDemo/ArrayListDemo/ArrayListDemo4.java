package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("John");
        al.add("Sophia");
        al.add("David");
        al.add("Emma");
        al.add("Liam");

        System.out.println(al);

        al.set(3,"amol");

        System.out.println(al);



    }
}
