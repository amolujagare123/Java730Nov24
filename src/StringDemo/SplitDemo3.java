package StringDemo;

public class SplitDemo3 {
    public static void main(String[] args) {
        String str = "it is nice to let him go to torranto as he got new office there";

        String[] stArr = str.split(" ");

        // print only the words the ends with 'y'

        for(int i=0;i<stArr.length;i++)
        {

            if(stArr[i].charAt(1)=='o')
                  System.out.println(stArr[i]);
        }

    }
}
