package ZohoMatrix;

import java.util.Scanner;

public class Transpose {
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
        ///logic
        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}