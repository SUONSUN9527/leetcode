package 二叉树15;

import java.util.ArrayList;
import java.util.List;

public class lc94 {

    private static List<Integer> res = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
            fun(root);
            return res;
        }

    public static void fun(TreeNode root) {
        if(root == null) return;
        fun(root.left);
        res.add(root.val);
        fun(root.right);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> integers = inorderTraversal(root);
        System.out.println(integers);
    }

}

