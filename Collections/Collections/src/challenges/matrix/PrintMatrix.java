package challenges.matrix;

import java.util.Arrays;

public class PrintMatrix {

    public static void main(String[] args) {

        int n =6;

        int[][] matrix = new int[n][n];
        int[][] matrix2 = new int[n][n];
        
        genMatrix1(matrix);
        printMatrix(matrix);

        genMatrix2(matrix2);
        printMatrix(matrix2);

        /*
        OUTPUT (n=6)

 1 1 1 1 1 1
 0 1 0 0 1 0
 0 0 1 1 0 0
 0 0 1 1 0 0
 0 1 0 0 1 0
 1 1 1 1 1 1

 1 2 3 4 5 6
 20 21 22 23 24 7
 19 32 33 34 25 8
 18 31 36 35 26 9
 17 30 29 28 27 10
 16 15 14 13 12 11


        */

        
    }

    public static void genMatrix1(int[][] matrix){
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix.length; col++){
                if(row==0 || row==matrix.length-1 || row==col || (matrix.length-1)-row==col){
                    matrix[row][col]=1;
                }
            }  
        }
    }


    public static void genMatrix2(int[][] matrix){
        int row=0;
        int col=0;
        int cont=1;
        int rightB=matrix.length-1;
        int leftB=0;
        int topB=0;
        int bottomB=matrix.length-1;
        int maxNum=(matrix.length * matrix.length);

        while(1==1){           
            if(cont>maxNum){
                break;
            }
            while(col<=rightB){//Derecha
                matrix[row][col]=cont;
                cont++;
                col++;
            }
            rightB--;
            col--;
            row++;

            while(row<=bottomB){//Abajo
                matrix[row][col]=cont;
                cont++;
                row++;
            }
            bottomB--;
            row--;
            col--;

            while(col>=leftB){//Izquierda
                matrix[row][col]=cont;
                cont++;
                col--;
            }
            leftB++;
            col++;
            row--;


            while(row>topB){//Arriba
                matrix[row][col]=cont;
                cont++;
                row--;
            }
            topB++;
            row++;
            col++;

        }
    }

    public static void printMatrix(int[][] matrix){
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix.length; col++){
                System.out.print(" "+matrix[row][col]);
                if(col==matrix.length-1){
                    System.out.println("");  
                }
            }  
        }
        System.out.println("");  
    }

}
