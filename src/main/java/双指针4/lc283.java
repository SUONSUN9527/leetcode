package 双指针4;

import java.util.Arrays;

public class lc283 {
//    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//    请注意 ，必须在不复制数组的情况下原地对数组进行操作。
//
//    示例 1:
//    输入: nums = [0,1,0,3,12]
//    输出: [1,3,12,0,0]
//
//    示例 2:
//    输入: nums = [0]
//    输出: [0]

    public static void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int fast = 0;
        int slow = 0;
        while(fast<nums.length && slow<nums.length){
           if(nums[fast] != 0){
               nums[slow] = nums[fast];
               slow++;
           }
           fast++;
        }
        while(slow<nums.length){
            nums[slow] = 0;
            slow++;
        }
    }


    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Arrays.sort(nums);
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
