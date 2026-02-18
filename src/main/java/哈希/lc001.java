package 哈希;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lc001 {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int slow = 0;
        while(true){
            for(int fast = slow+1;fast<nums.length;fast++){
                if(nums[fast] + nums[slow] == target){
                    res[0] = slow;
                    res[1] = fast;
                    return res;
                }
            }
            if(slow == nums.length){
                break;
            }
            slow++;
        }
        return res;
    }
    public static int[] twoSum_hash_map(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[0] = map.get(target-nums[i]);
                res[1] = i;
            }
            map.put(nums[i],i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] a  = twoSum(nums,target);
        int[] b = twoSum_hash_map(nums,target);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
