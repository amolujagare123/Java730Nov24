package Arrays;

public class ArrayDemo1 {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] =34;
        a[1] =55;
        a[2] =76;
        a[3] =89;
        a[4] =11;

        System.out.println("length = " + a.length );

    //    System.out.println(a[3]);

        System.out.println("printing using for loop");
        for(int i= 0 ; i<5 ;i++)
            System.out.println(a[i]);

        System.out.println("printing using for each loop");

        for(int x : a)
        {
            System.out.println(x);
        }


    }
}
