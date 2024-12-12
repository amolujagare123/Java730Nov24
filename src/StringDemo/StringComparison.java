package StringDemo;

public class StringComparison {

    public static void main(String[] args) {

        int a = 10 ;
        int b = 20 ;

     //   System.out.println(a==b);

        String str1 = "amol";
        String str2 = "amol";
        String str3 = "Amol";
        String str4 = "Rahul";
        String str5 = new String("amol");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));

        System.out.println(str1==str2); // memory locations are equal

        System.out.println(str1==str4); // memory locations are not equal

        System.out.println(str1==str5);
    }
}
