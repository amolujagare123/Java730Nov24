package CollectionsDemo.stackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        System.out.println(s.empty());
        s.push("amol");
        s.push("rachana");
        s.push("asif");
        s.push("jueeli");
        System.out.println(s.empty());
        System.out.println(s);

        System.out.println( s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);

    }
}
