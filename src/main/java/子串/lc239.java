package 子串;

import java.util.*;

public class lc239 {


    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length<k || nums.length == 0){
            return null;
        }
        int[] res = new int[nums.length-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < nums.length; i++){
            while(!deque.isEmpty() && deque.peekFirst()<i-k+1){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
            if(i>=k-1){
                res[i-k+1] = nums[deque.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] res = maxSlidingWindow(nums,k);
        System.out.println(Arrays.toString(res));
    }

}
