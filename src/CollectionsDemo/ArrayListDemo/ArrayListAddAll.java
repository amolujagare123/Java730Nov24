package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListAddAll {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("John");
        al.add("Sophia");
        al.add("David");
        al.add("Emma");
        al.add("Liam");

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();
        System.out.println("al2="+al2);

        al2.addAll(al);

        System.out.println("al2="+al2);

    }
}
