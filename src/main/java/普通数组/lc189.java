package 普通数组;

import java.util.Arrays;

public class lc189 {
//    给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
//
//    示例 1:
//    输入: nums = [1,2,3,4,5,6,7], k = 3
//    输出: [5,6,7,1,2,3,4]
//    解释:
//    向右轮转 1 步: [7,1,2,3,4,5,6]
//    向右轮转 2 步: [6,7,1,2,3,4,5]
//    向右轮转 3 步: [5,6,7,1,2,3,4]
//
//    示例 2:
//    输入：nums = [-1,-100,3,99], k = 2
//    输出：[3,99,-1,-100]
//    解释:
//    向右轮转 1 步: [99,-1,-100,3]
//    向右轮转 2 步: [3,99,-1,-100]

    public static void rotate(int[] nums, int k) {
        k = k%nums.length;
        fun(nums,0,nums.length-1);
        fun(nums,0,k-1);
        fun(nums,k,nums.length-1);
    }
    public static void fun(int[] nums, int left, int right){
        int r = right;
        int l = left;
        while(l<r){
            int curr = nums[l];
            nums[l] = nums[r];
            nums[r] = curr;
            r--;
            l++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        int k = 3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }

}
