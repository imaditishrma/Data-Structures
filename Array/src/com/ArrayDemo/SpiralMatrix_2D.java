//Problem: Return the elements in spiral order
package com.ArrayDemo;
/*Concept
           [1,2,3],
  matrix = [4,5,6],
           [7,8,9]

  list = [1,2,3,6,9,8,7,4,5]

          [1, 2, 3,  4],
  matrix= [5, 6, 7,  8],
          [9, 10,11,12],
          [13,14,15,16]

  list = [1,2,3,4,8,12,16,15,14,13,9,5,6,7,22,10]
  */
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_2D {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List list = new ArrayList();
        if (matrix.length == 0)
            return list;
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) list.add(matrix[r1][c]);
            for (int r = r1 + 1; r <= r2; r++) list.add(matrix[r][c2]);
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) list.add(matrix[r2][c]);
                for (int r = r2; r > r1; r--) list.add(matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        List list = new ArrayList();
        list = spiralOrder(matrix);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
