package 回溯8;

import java.util.ArrayList;
import java.util.List;

public class lc46 {

    List<List<Integer>> res = new ArrayList<>();
    boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>());
        return res;
    }

    private void backtrack(int[] nums, List<Integer> path) {
        // 1️⃣ 终止条件：路径长度等于 nums 长度
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path)); // 一定要 new
            return;
        }

        // 2️⃣ 尝试每一个数
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // 已用过，跳过

            // 3️⃣ 选择
            used[i] = true;
            path.add(nums[i]);

            // 4️⃣ 进入下一层
            backtrack(nums, path);

            // 5️⃣ 撤销选择（回溯）
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

}
