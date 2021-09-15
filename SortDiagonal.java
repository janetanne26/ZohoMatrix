package ZohoMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class SortDiagonal {
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
        int[] diag=new int[row];
        int k=0;
        for (int i = 0; i < row; i++) {
             diag[k++]=arr[i][i];
        }
        Arrays.sort(diag);
        int m=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    arr[i][j]=diag[m++];

                }
            }
           // System.out.println();
        }
//print
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
