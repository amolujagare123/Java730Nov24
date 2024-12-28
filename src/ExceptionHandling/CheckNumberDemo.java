package ExceptionHandling;

public class CheckNumberDemo {

    void checkNumber(int n)
    {
        if(n>=1 && n<=10)
            System.out.println("We are safe");

        else
           throw new ArithmeticException("We are in danger");
    }


    public static void main(String[] args) {

        int a = 23;

        System.out.println("a="+a);
        CheckNumberDemo ob = new CheckNumberDemo();
        ob.checkNumber(a);

        System.out.println("program executed successfully");

    }
}
