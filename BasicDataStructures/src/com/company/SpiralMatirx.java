package com.company;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatirx {
    static ArrayList<Integer> order = new ArrayList<>();

    public static void main(String args[]){
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix).toString());
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int min_row = 0;
        int max_row = matrix.length-1;
        int min_col = 0;
        int max_col = matrix[0].length-1;
        int ne = matrix.length-1*matrix[0].length-1;

        while(order.size()<ne){
            for(int j=min_col,i=min_row;j<max_col;j++){
                order.add(matrix[i][j]);
            }
            min_row++;
            for(int i=min_row,j=max_col-1;i<max_row;i++){
                order.add(matrix[i][j]);
            }
            max_col--;
            if(max_col<min_col){
                break;
            }
            for(int j=max_col-1,i=max_row-1;j>=min_row;j--){
                order.add(matrix[i][j]);
            }
            max_row--;
            if(max_row<min_row){
                break;
            }
            for(int i=max_row-1,j=min_col;i>=min_row;i--){
                order.add(matrix[i][j]);
            }
            min_col++;
        }

        return order;
    }
}
