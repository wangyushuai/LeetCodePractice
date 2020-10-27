package com.wys.practice;

/**
 * 树
 * @author wangyushuai2@jd.com
 * @date 2020/10/27
 */
public class TreeNode {
    public int val;

    public TreeNode left;

    public TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
