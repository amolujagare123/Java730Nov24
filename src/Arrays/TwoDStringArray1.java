package Arrays;

public class TwoDStringArray1 {

    public static void main(String[] args) {

        String[][] stArr = new String[4][3];

        stArr[0][0] = "Mumbai";
        stArr[0][1] = "Delhi";
        stArr[0][2] = "Bangalore";

        stArr[1][0] = "Hyderabad";
        stArr[1][1] = "Ahmedabad";
        stArr[1][2] = "Chennai";

        stArr[2][0] = "Kolkata";
        stArr[2][1] = "Pune";
        stArr[2][2] = "Jaipur";

        stArr[3][0] = "Lucknow";
        stArr[3][1] = "Chandigarh";
        stArr[3][2] = "Bhopal";

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
