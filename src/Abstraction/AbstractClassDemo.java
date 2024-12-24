package Abstraction;

public abstract class AbstractClassDemo {

    abstract void contactSupport();
    abstract void viewHistory();

    void display()
    {
        System.out.println("display");
    }
}

class ChildAbstract extends AbstractClassDemo
{

    @Override
    void contactSupport() {
        System.out.println("Contact Support");
    }

    @Override
    void viewHistory() {
        System.out.println("viewHistory");
    }


    public static void main(String[] args) {
        AbstractClassDemo ob = new ChildAbstract(); // upcasting
    }
}
