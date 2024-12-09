package Arrays;

public class TwoDArrayIntDemo {

    public static void main(String[] args) {
        int[][] a = new int[4][3];

        a[0][0] = 23;
        a[0][1] = 24;
        a[0][2] = 25;

        a[1][0]= 33;
        a[1][1]= 43;
        a[1][2]= 53;

        a[2][0] = 44;
        a[2][1] = 45;
        a[2][2] = 46;

        a[3][0] = 66;
        a[3][1] = 76;
        a[3][2] = 86;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for(int i=0 ; i<row; i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
}
