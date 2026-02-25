package 回溯8;

import java.util.ArrayList;
import java.util.List;

public class lc78 {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0);
        return res;
    }

    private void backtrack(int[] nums, int start) {
        // ⭐ 每一个状态，都是一个子集
        res.add(new ArrayList<>(path));

        // 从 start 开始，避免重复
        for (int i = start; i < nums.length; i++) {
            // 选择
            path.add(nums[i]);

            // 递归
            backtrack(nums, i + 1);

            // 撤销选择（回溯）
            path.remove(path.size() - 1);
        }
    }

}
