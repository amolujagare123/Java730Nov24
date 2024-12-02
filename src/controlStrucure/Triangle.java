package controlStrucure;

public class Triangle {

    public static void main(String[] args) {

        int a = 50;
        int b = 50;
        int c = 80;

        if( a+ b + c == 180 && a>0 && b> 0 && c>0) {
            if (a == b && b == c)
                System.out.println("equilateral triangle");

            if (a != b && b != c && c != a)
                System.out.println("Scalene triangle");

            if (a == 90 || b == 90 || c == 90)
                System.out.println("Right angled triangle");

            if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a))
                System.out.println("Isosceles triangle");
        }
        else
            System.out.println("This is not a triangle");
    }
}
