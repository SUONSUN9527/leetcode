package 二叉树15;

import java.util.HashMap;
import java.util.Map;

public class lc105 {

    private int preIndex = 0;
    private Map<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 记录 inorder 每个值的位置
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int inLeft, int inRight) {
        if (inLeft > inRight) return null;

        // 1. 前序遍历当前的根
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        // 2. 在中序遍历中找到根的位置
        int index = indexMap.get(rootVal);

        // 3. 构造左子树
        root.left = build(preorder, inLeft, index - 1);
        // 4. 构造右子树
        root.right = build(preorder, index + 1, inRight);

        return root;
    }

}
