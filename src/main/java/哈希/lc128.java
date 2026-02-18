package 哈希;

import java.util.*;

public class lc128 {
//    给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
//    请你设计并实现时间复杂度为 O(n) 的算法解决此问题。

//    示例 1：
//    输入：nums = [100,4,200,1,3,2]
//    输出：4
//    解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。

//    示例 2：
//    输入：nums = [0,3,7,2,5,8,4,6,0,1]
//    输出：9

//    示例 3：
//    输入：nums = [1,0,1,2]
//    输出：3
    public static int longestConsecutive(int[] nums){
        if(nums.length == 0 || nums == null){
            return 0;
        }
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            int res = 0;
            if(!set.contains(i-1)){
                int curr = i;
                int next = curr+1;
                res++;
                while(set.contains(next)){
                    curr = next;
                    next = curr+1;
                    res++;
                }
            }
            if(result<res){
                result = res;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {1,0,1,2};
        int res = longestConsecutive(nums);
        System.out.println(res);
    }
}
