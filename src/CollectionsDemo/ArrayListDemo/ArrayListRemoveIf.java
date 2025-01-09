package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("John");
        al.add("Sophia");
        al.add("David");
        al.add("Emma");
        al.add("Liam");
        al.add("Arjun");
        al.add("Priya");
        al.add("Ravi");
        al.add("Ananya");
        al.add("Kabir");

      //  remove all the strings whose
        //  length is less than or equal to 5

        System.out.println("al="+al);
        // al.removeIf(variable -> condition)
            // -> predicate symbol

        // remove elements that ends with 'a'

      //  al.removeIf(str -> str.length()<=5 );
     //   al.removeIf(str -> str.charAt(str.length()-1)=='a' );
        al.removeIf(str -> str.endsWith("a") );

        System.out.println("al="+al);

    }
}
