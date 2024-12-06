package Arrays;

public class ArrayAnotherDemo1 {

    public static void main(String[] args) {

        int[] a = {12,45,67,89,1,256,22,56,89};

        System.out.println("length = " + a.length );

    //    System.out.println(a[3]);

        System.out.println("printing using for loop");
        for(int i= 0 ; i<a.length ;i++)
            System.out.println(a[i]);

        System.out.println("printing using for each loop");

        for(int x : a)
        {
            System.out.println(x);
        }


    }
}
