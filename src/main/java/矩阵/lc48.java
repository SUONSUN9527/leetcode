package 矩阵;

import java.util.Arrays;

public class lc48 {

    public static void rotate(int[][] matrix) {
//        矩阵先转置再每行翻转就是顺时针90°
        int n = matrix.length;

        // 1️⃣ 转置矩阵
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int[] curr : matrix) {
            fun(curr);
        }

    }


    public static  void fun(int[] curr){
        int fast = 0;
        int slow = curr.length - 1;
        while(fast < slow){
            int temp = curr[fast];
            curr[fast] = curr[slow];
            curr[slow] = temp;
            fast++;
            slow--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

}
