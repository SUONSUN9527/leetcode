package 二叉树15;

public class lc543 {

    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxDiameter;
    }

    // 返回以 node 为根的最大高度
    private int depth(TreeNode node) {
        if (node == null) return 0;

        int left = depth(node.left);
        int right = depth(node.right);

        // 更新直径（边数）
        maxDiameter = Math.max(maxDiameter, left + right);

        // 返回高度（节点数）
        return Math.max(left, right) + 1;
    }

}
