package FinalNStatic;

public class FinalDemo {

    final int count = 100;

    void change()
    {
      //  count = 200;
    }

    public static void main(String[] args) {

        FinalDemo ob = new FinalDemo();

        ob.change();

        System.out.println(ob.count);
    }
}
