package ClassNConstructors;

public class MyClass {

    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        int i;

        i = 10 ;


        MyClass ob = new MyClass();

        ob.a = 10;
        ob.d = 34.56;
        ob.c = 'd';
        ob.str = "text";
        ob.display();

        MyClass ob2 = new MyClass();

        ob2.a = 50;
        ob2.d = 14.56;
        ob2.c = 'c';
        ob2.str = "file";
        ob2.display();




    }

}
