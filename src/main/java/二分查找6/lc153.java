package 二分查找6;

public class lc153 {

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            // 取中间位置
            int mid = low + (high - low) / 2;

            // 若中间值大于右边值，说明最小值在 mid 右边
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                // 否则最小值包括 mid 在左半侧
                high = mid;
            }
        }
        // low == high 时即为最小值位置
        return nums[low];
    }

}
