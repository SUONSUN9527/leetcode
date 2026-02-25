package 二分查找6;

public class lc35 {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;              // 找到直接返回
            } else if (nums[mid] < target) {
                left = mid + 1;          // target 在右边
            } else {
                right = mid - 1;         // target 在左边
            }
        }

        // 没找到，left 就是插入位置
        return left;
    }

}
