package Methods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsRetuningValue {

    int myMethod()
    {
        System.out.println("inside my method");
        int a = 89;

        return a;
    }

    String reverseString(String str)
    {
        String reverse = "";

        for (int i = str.length()-1 ;i>=0 ; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }

    Date convertStringToDate(String dateStr,String patten) throws ParseException {

        /*Date date = new SimpleDateFormat(patten).parse(dateStr);
        return date;*/

        return  new SimpleDateFormat(patten).parse(dateStr);
    }


    int[] getMyArray()
    {
        int[] myArray = {12,34,56,78,90,11,22,33};
        return myArray;
    }


    String[][] getMyTwoDArray()
    {
        String[][] cities = {
                {"Varanasi", "Amritsar", "Shimla"},
                {"Nagpur", "Coimbatore", "Thiruvananthapuram"},
                {"Guwahati", "Chandigarh", "Patna"},
                {"Bhopal", "Mysuru", "Ranchi"}
        };

        return cities;
    }




    public static void main(String[] args) throws ParseException {

        int i ;
        i = 11 ;
        System.out.println(i);
        int b = i;

        MethodsRetuningValue ob = new MethodsRetuningValue();

        System.out.println(ob.myMethod());

        int z = ob.myMethod();

        System.out.println("z="+z);

        String newString = ob.reverseString("Selenium with Java");

        System.out.println("newString="+newString);

        System.out.println(ob.convertStringToDate("31 Dec 2024","dd MMM yyyy"));


        int[] aa = ob.getMyArray();
        System.out.println("my array aa :");
        for (int x:aa)
            System.out.println(x);

        String[][] myStArr = ob.getMyTwoDArray();

        System.out.println("Below is the Two D Array");
        for (int i1=0;i1<myStArr.length;i1++)
        {
            for (int j=0;j<myStArr[0].length;j++)
            {
                System.out.print(myStArr[i1][j]+"\t");
            }
            System.out.println();
        }
    }
}
