package ZohoMatrix;

import java.util.Scanner;

public class UniqueRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the row size");
        int row = sc.nextInt();
        System.out.println("enter the column size");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("enter the elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < row; i++)
        {
            int flag = 0;

            // Check if there is similar column
            // is already printed, i.e if i and
            // jth column match.
            for(int j = 0; j < i; j++)
            {
                flag = 1;

                for(int k = 0; k < col; k++)
                    if (arr[i][k] !=arr[j][k])
                        flag = 0;

                if (flag == 1)
                    break;
            }

            // If no row is similar
            if (flag == 0)
            {

                // Print the row
                for(int j = 0; j < col; j++)
                    System.out.print(arr[i][j] + " ");

                System.out.println();
            }
        }

    }
}
