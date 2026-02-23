package 二叉树15;

public class lc230 {

    private int count = 0;
    private int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null) return;

        // 左
        inorder(node.left, k);

        // 中：处理当前节点
        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        // 右
        inorder(node.right, k);
    }

}
