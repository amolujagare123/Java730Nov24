package loops;

public class FizzBuzzDemo {

    public static void main(String[] args) {
        for (int i = 1 ; i <=30 ; i++)
        {

            if(i%3 == 0 && i%5 == 0)
                System.out.println(i+" fizzbuzz");

            else if(i%5 == 0)
                System.out.println(i+" buzz");
            else
                if(i%3 == 0)
                    System.out.println(i+" fizz");

            else if(i%3 != 0 && i%5 != 0)
                System.out.println(i);
        }

    }
}
