package Abstraction;

public interface AnotherInterface {
     void contactSupport();
     void viewHistory();

     static void display1()
     {
         System.out.println("display1");
     }

    default void display2()
    {
        System.out.println("display2");
    }

    private void display3()
    {
        System.out.println("display3");
    }

}

class ChildInterface implements AnotherInterface {

    @Override
    public void contactSupport() {
        System.out.println("Contact Support");
    }

    @Override
    public void viewHistory() {
        System.out.println("viewHistory");
    }


    public static void main(String[] args) {

        AnotherInterface ob = new ChildInterface();
        ob.contactSupport();
        ob.viewHistory();
        ob.display2();
        AnotherInterface.display1();
    }
}
