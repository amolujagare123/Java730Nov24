package Methods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsArguments {

    void myMethod1()
    {
        System.out.println("method with no arguments");
    }

    void myMethod2(int a)
    {
        System.out.println("method with 1 arguments");
        System.out.println("a="+a);
    }
    void myMethod3(int a,int b,int c)
    {
        System.out.println("method with 3 arguments");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }

    void myMethod4(int a,double d,char c)
    {
        System.out.println("method with different types of arguments");
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
    }

    void convertStringToDate(String dateStr) throws ParseException // dd-MM-yyyy
    {
        Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateStr);
        System.out.println(date);
    }

    void convertCurrentDateToString(String pattern)
    {
        String dateStr = new SimpleDateFormat(pattern).format(new Date());
        System.out.println("Converted Date="+dateStr);
    }

    void printMyArray(int[] arr)
    {
        System.out.println("Below is the array");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    void printMyTwoDArray(String[][] stArr)
    {
        System.out.println("Below is the Two D Array");
        for (int i=0;i<stArr.length;i++)
        {
           for (int j=0;j<stArr[0].length;j++)
           {
               System.out.print(stArr[i][j]+"\t");
           }
            System.out.println();
        }
    }

    public static void main(String[] args) throws ParseException {

        MethodsArguments ob = new MethodsArguments();
        ob.myMethod1();
        ob.myMethod2(23);
        ob.myMethod3(12,12,12);
        ob.myMethod4(12,12.45,'s');
        ob.convertStringToDate("12-07-2024");
        ob.convertCurrentDateToString("dd-MMMM-yyyy EEEE hh:mm:ss aa");

        int[] myArray = {12,34,56,78,90,11,22,33};

        ob.printMyArray(myArray);

        String[][] cities = {
                {"Mumbai", "Delhi", "Bengaluru"},
                {"Kolkata", "Chennai", "Hyderabad"},
                {"Pune", "Ahmedabad", "Jaipur"},
                {"Lucknow", "Surat", "Indore"}
        };

        ob.printMyTwoDArray(cities);

    }
}
