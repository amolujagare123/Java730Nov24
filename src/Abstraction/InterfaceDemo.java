package Abstraction;

public interface InterfaceDemo {

    void contactSupport();
    void viewHistory();

    void display();

    static void display1()
    {
        System.out.println("InterfaceDemo method");
    }

    default void display2()
    {
        System.out.println("InterfaceDemo method");
    }
}

interface Interface2
{
    void display();
    static void display1()
    {
        System.out.println("Interface2 method");
    }
    private void display2()
    {
        System.out.println("InterfaceDemo method");
    }

    default void demo()
    {
        display2();
    }
}


class ChildInterface2 implements InterfaceDemo,Interface2
{

    @Override
    public void contactSupport() {
        System.out.println("Contact Support");
    }

    @Override
    public void viewHistory() {
        System.out.println("viewHistory");
    }

    @Override
    public void display() {
        System.out.println("Display");
    }

    public void display2()
    {

    }


    public static void main(String[] args) {

        InterfaceDemo ob1 = new ChildInterface2();
        ob1.display();
        InterfaceDemo.display1();

        Interface2 ob2 = new ChildInterface2();
        ob2.display();
        Interface2.display1();
    }
}
