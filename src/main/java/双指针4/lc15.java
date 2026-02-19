package 双指针4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc15 {
//    给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]]
//    满足 i != j、i != k 且 j != k
//    同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int num1 = nums[i];
            if(num1>0){
                break;
            }
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int num2 = nums[j];
                int num3 = nums[k];
                List<Integer> curr = new ArrayList<>();
                if(num1 + num2 + num3 == 0){
                    curr.add(num1);
                    curr.add(num2);
                    curr.add(num3);
                    res.add(curr);
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }else if(num1 + num2 + num3 < 0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = threeSum(nums);
        System.out.println(res);
    }

}
