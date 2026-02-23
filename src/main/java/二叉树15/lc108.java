package 二叉树15;

public class lc108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        // 递归构建平衡 BST
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
        // 结束条件：子数组为空
        if (left > right) return null;

        // 取中间作为根节点
        int mid = (left + right) / 2;

        // 构造节点
        TreeNode node = new TreeNode(nums[mid]);

        // 递归构建左右子树
        node.left  = buildBST(nums, left, mid - 1);
        node.right = buildBST(nums, mid + 1, right);

        return node;
    }

}
