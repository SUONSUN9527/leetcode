package 二叉树15;

import java.util.HashMap;
import java.util.Map;

public class lc437 {

    private int res = 0;
    private Map<Long, Integer> map = new HashMap<>();

    public int pathSum(TreeNode root, int targetSum) {
        map.put(0L, 1); // 前缀和为 0 出现 1 次
        dfs(root, 0L, targetSum);
        return res;
    }

    private void dfs(TreeNode node, long curSum, int target) {
        if (node == null) return;

        // 1️⃣ 更新当前前缀和
        curSum += node.val;

        // 2️⃣ 统计以当前节点结尾的合法路径数量
        res += map.getOrDefault(curSum - target, 0);

        // 3️⃣ 把当前前缀和加入 map
        map.put(curSum, map.getOrDefault(curSum, 0) + 1);

        // 4️⃣ 继续 DFS
        dfs(node.left, curSum, target);
        dfs(node.right, curSum, target);

        // 5️⃣ 回溯：移除当前节点的影响
        map.put(curSum, map.get(curSum) - 1);
    }

}
