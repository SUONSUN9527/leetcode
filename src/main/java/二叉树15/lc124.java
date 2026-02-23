package 二叉树15;

public class lc124 {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        // 左右子树的最大贡献（负数直接舍弃）
        int leftGain = Math.max(dfs(node.left), 0);
        int rightGain = Math.max(dfs(node.right), 0);

        // 以当前节点为拐点的路径
        int curPath = node.val + leftGain + rightGain;

        // 更新全局最大值
        maxSum = Math.max(maxSum, curPath);

        // 返回给父节点：只能选一边
        return node.val + Math.max(leftGain, rightGain);
    }

}
