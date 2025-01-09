package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveAll {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("John");
        al.add("Sophia");
        al.add("David");
        al.add("Emma");
        al.add("Liam");

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();

        al2.add("Sophia");
        al2.add("amol");
        al2.add("Emma");
        al2.add("Shikha");
        al2.add("rachana");
        al2.add("Emma");

        System.out.println("al2="+al2);

        al2.removeAll(al);

        System.out.println("al2="+al2);


    }
}
