package 矩阵;

import java.util.ArrayList;
import java.util.List;

public class lc74 {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int bottom = row-1;
        int left = 0;
        int right = col-1;
        while (top <= bottom && left <= right) {
            for(int i = left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i = right; i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }
        return list;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }


}
