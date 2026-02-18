package 子串;

import java.util.HashMap;
import java.util.Map;

public class lc560 {
//    给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
//
//    子数组是数组中元素的连续非空序列。
//
//
//
//    示例 1：
//
//    输入：nums = [1,1,1], k = 2
//    输出：2

//    示例 2：
//
//    输入：nums = [1,2,3], k = 3
//    输出：2

    public static int subarraySum(int[] nums, int k) {
        int res = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            if(map.containsKey(sum - k)){
                res = res + map.get(sum-k);
            }
            if(map.containsKey(sum)){
                int curr = map.get(sum)+1;
                map.put(sum,curr);
            }else{
                map.put(sum,1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,-1,0};
        int k = 0;
        int res = subarraySum(nums,k);
        System.out.println(res);
    }

}
