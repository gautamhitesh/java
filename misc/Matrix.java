package misc;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        //input matrix    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int m=sc.nextInt();
        int[][] matrix=new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        printMatrix(matrix);
        matrix=rotateMatrix(matrix);
        printMatrix(matrix);
    }
    public static int[][] rotateMatrix(int[][] matrix){
        //reverse each row
        int length=matrix.length;
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][length-1-j];
                matrix[i][length-1-j]=temp;
            }
        }
        //transpose
        printMatrix(matrix);
        System.out.println("Transposing");
        for (int k=0;k<length;k++){
            for(int l=k;l<length;l++){
                temp=matrix[k][l];
                matrix[k][l]=matrix[l][k];
                matrix[l][k]=temp;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        return;
    }

}
