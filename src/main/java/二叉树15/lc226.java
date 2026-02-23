package 二叉树15;

public class lc226 {

    public TreeNode invertTree(TreeNode root) {
        // 基本情况：空树直接返回
        if (root == null) {
            return null;
        }

        // 递归翻转左右子树
        TreeNode leftInverted = invertTree(root.left);
        TreeNode rightInverted = invertTree(root.right);

        // 交换左右子树
        root.left = rightInverted;
        root.right = leftInverted;

        return root;
    }

}
