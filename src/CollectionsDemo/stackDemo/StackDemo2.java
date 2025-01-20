package CollectionsDemo.stackDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();


        s.push("amol");
        s.push("rachana");
        s.push("asif");
        s.push("jueeli");

        System.out.println(s);

        System.out.println(s.search("amol"));



    }
}
