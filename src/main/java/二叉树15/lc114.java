package 二叉树15;

public class lc114 {

    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left != null) {
                // 1. 找左子树最右节点
                TreeNode p = root.left;
                while (p.right != null) {
                    p = p.right;
                }

                // 2. 接上原来的右子树
                p.right = root.right;

                // 3. 左子树挪到右边
                root.right = root.left;
                root.left = null;
            }

            // 4. 继续向右
            root = root.right;
        }
    }

}
