package loops;

public class decrementDemo {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i); // 10
        System.out.println(i--); // 10
        System.out.println(i); // 9
        System.out.println(--i); // 8
        System.out.println(i); // 8

     /*   a++ , a - - (post)
                First, the statement is executed,
                and then increment or decrement happens.

                ++a, - - a (pre )
        First, an increment or decrement happens
        and then the statement is executed,
*/

    }
}
