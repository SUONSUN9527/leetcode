package 普通数组;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc56 {
    public static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int i = 0;i<intervals.length;i++){
            int[] curr = intervals[i];
            if(res.isEmpty()){
                res.add(curr);
            }
            int right = res.get(res.size() - 1)[1];
            int left = curr[0];
            if(right<left){
                res.add(curr);
            }else{
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size()-1)[1],curr[1]);
            }
        }
        int[][] result = new int[res.size()][2];
        int i = 0;
        for(int[] c : res){
            result[i] = c;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] res = merge(intervals);
        System.out.println(Arrays.deepToString(res));
    }
}
