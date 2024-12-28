package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] a = new int[5];
        try{
            a[0] = 11;
            a[1] = 11;
            a[2] = 11;
            a[3] = 11;
            a[4] = 11;
        //    a[5] = 11;
        }
        catch (Exception e)
        {
            System.out.println("inside catch");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        finally {
            System.out.println(" inside finally");
        }
        System.out.println(a.length);
        for(int x : a)
            System.out.println(x);
    }


}
