package 二叉树15;

public class lc98 {

    private long prev = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        // 1️⃣ 左
        if (!isValidBST(root.left)) return false;

        // 2️⃣ 中
        if (root.val <= prev) return false;
        prev = root.val;

        // 3️⃣ 右
        return isValidBST(root.right);
    }

}
