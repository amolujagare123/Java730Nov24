package Arrays;

public class TwoDArrayIntDemo2 {

    public static void main(String[] args) {
        int[][] a = {
                {23,34,56},
                {11,22,44},
                {21,32,43},
                {77,88,88}
        };

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
