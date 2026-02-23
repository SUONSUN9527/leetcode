package 二叉树15;

public class lc236 {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if root is null or matches one of the targets
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recursively search in left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both sides are non-null, root is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise return whichever is non-null (or null)
        return (left != null) ? left : right;
    }

}
