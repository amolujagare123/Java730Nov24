package StringDemo;

public class SplitDemo4 {
    public static void main(String[] args) {
        String str = "it is nice to let him go to torranto as he got new office there";

        String[] stArr = str.split(" ");
        // print only the words whose length is less than or equal to 3
        for(int i=0;i<stArr.length;i++)
        {

            if(stArr[i].length()<=3)
                  System.out.println(stArr[i]);
        }

    }
}
