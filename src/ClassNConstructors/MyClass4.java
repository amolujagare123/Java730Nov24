package ClassNConstructors;

public class MyClass4 {

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

    MyClass4(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c= c;
        this.str = str;
    }

   /* MyClass3()
    {

    }*/




    public static void main(String[] args) {

        MyClass4 ob = new MyClass4(23,23.45,'g',"song");

        /*ob.a = 10;
        ob.d = 34.56;
        ob.c = 'd';
        ob.str = "text";*/

        ob.display();







    }

}
