package ZohoMatrix;

import java.util.Scanner;

public class SetMatrixZero {
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
//logic
        int rowind[]=new int[row];
        int colind[]=new int[col];

        for(int i=0;i<row;i++){
            rowind[i]=1;
        }
        for(int j=0;j<col;j++){
            colind[j]=1;
        }

        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
             if(arr[i][j]==0){
                 rowind[i]=0;
                 colind[j]=0;
             }
            }
        }


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                if(rowind[i]==0||colind[j]==0){
                    arr[i][j]=0;
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
            }

    }
}