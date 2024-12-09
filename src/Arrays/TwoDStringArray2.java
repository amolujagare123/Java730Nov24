package Arrays;

public class TwoDStringArray2 {

    public static void main(String[] args) {

        String[][] stArr = {
                {"Mumbai", "Delhi", "Bangalore"},
                {"Hyderabad", "Ahmedabad", "Chennai"},
                {"Kolkata", "Pune", "Jaipur"},
                {"Lucknow", "Chandigarh", "Bhopal"}
        };

        for(int i=0 ; i< stArr.length; i++)
        {
            for(int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
