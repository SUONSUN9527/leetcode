package 二叉树15;

public class lc101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        // 1️⃣ 都为空 → 对称
        if (left == null && right == null) return true;

        // 2️⃣ 一个空一个不空 → 不对称
        if (left == null || right == null) return false;

        // 3️⃣ 值不相等 → 不对称
        if (left.val != right.val) return false;

        // 4️⃣ 递归比较（关键！）
        return isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }

}
