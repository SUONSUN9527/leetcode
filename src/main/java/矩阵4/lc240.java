package 矩阵4;

public class lc240 {


    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean flag = false;
        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                flag = true;
                break;
            }else if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return flag;
    }



    public static void main(String[] args) {
        int target = 5;
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

        boolean res = searchMatrix(matrix, target);
        System.out.println(res);
    }

}
