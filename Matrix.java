/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author harde
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Feel free to change the numbers in the matrix to check the secondary
        diagonal. Remember that the matrix must have the same amount of rows as
        columns in order for the program to check the secondary matrix and 
        produce a calculated output.
        */
        int [][] matrix={
            {10,12,11},
            {9,8,31},
            {2,16,24}
        };
        int secondaryDiagonal =0;
        int numberOfRows=matrix.length;
        int numberOfColumns=matrix[0].length;
        int size=matrix.length-1;
        for(int i=0;i<matrix.length;i++){
            secondaryDiagonal+=matrix[i][size-i];
            if(numberOfRows!=numberOfColumns){
                System.out.println("Matrix is not a square.");
            }else{
                System.out.println("The secondary diagonal is: "+ secondaryDiagonal);
                
            }
        }
        
    }
    
}
