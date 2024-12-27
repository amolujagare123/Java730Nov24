package FinalNStatic;

public class StaticMethodDemo {
    int rno;
    String name;
    public static String college="ITC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void staticMethod1()
    {
        System.out.println("staticMethod1");

     //   System.out.println("rno="+rno); // non-static - not allowed
     //   System.out.println("name="+name);  // non-static - not allowed
        System.out.println("college="+college);  // static - allowed
        staticMethod2();  // static - allowed
     //   nonStaticMethod();  // non-static - not allowed
     //   display();  // non-static - not allowed
    }

    public static void staticMethod2()
    {
        System.out.println("staticMethod2");
    }

    void nonStaticMethod()
    {
        System.out.println("nonStaticMethod");
        System.out.println("rno="+rno); // non-static -  allowed
        System.out.println("name="+name);  // non-static -  allowed
        System.out.println("college="+college);  // static - allowed
        staticMethod2();  // static - allowed
        nonStaticMethod();  // non-static -  allowed
        display();  // non-static -  allowed
    }

    public static void main(String[] args) {

        StaticMethodDemo.staticMethod1();
        StaticMethodDemo.staticMethod2();
    }


}
