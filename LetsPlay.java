package ZohoMatrix;

import java.util.Scanner;

public class LetsPlay {
    public static int isSuperSimilar(int n, int m, int mat[][], int x)
    {
        // code here

        int[][] dupMat=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dupMat[i][j]=mat[i][j];
            }
        }

        for(int i=0;i<n;i++){

            //left rotation
            if(i%2==0){
                int r=0;
                while(r<x){
                    int a=dupMat[i][0];

                    for(int j=0;j<m-1;j++){
                        dupMat[i][j]=dupMat[i][j+1];

                    }
                    dupMat[i][m-1]=a;


                    r++;
                }
            }
            //right rotation
            else{
                int v=0;
                while(v<x){
                    int a=dupMat[i][m-1];

                    for(int j=m-1;j>0;j--){
                        dupMat[i][j]=dupMat[i][j-1];

                    }
                    dupMat[i][0]=a;


                    v++;
                }




            }

        }


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=dupMat[i][j]){
                    return 0;
                }
            }
        }





        return 1;

    }

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
        System.out.println("enter the number of rotation");
        int x=sc.nextInt();
        System.out.println(isSuperSimilar(row,col,arr,x));

    }
}
