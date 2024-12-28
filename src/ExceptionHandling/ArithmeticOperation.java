package ExceptionHandling;

public class ArithmeticOperation {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int c = 1;

        try {
            c = a / b;
        }
        catch (Exception e)
        {
            System.out.println("inside catch");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        System.out.println("c="+c);
        System.out.println("End of the program");
    }
}
