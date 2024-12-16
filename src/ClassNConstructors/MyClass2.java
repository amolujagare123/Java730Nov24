package ClassNConstructors;

public class MyClass2 {

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

    MyClass2()
    {
        a = 55;
        d = 15.53;
        c= 'a';
        str = "amol";
    }


    public static void main(String[] args) {

        MyClass2 ob = new MyClass2();

        /*ob.a = 10;
        ob.d = 34.56;
        ob.c = 'd';
        ob.str = "text";*/

        ob.display();







    }

}
