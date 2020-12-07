package com.wys.practice.tree;

import com.wys.practice.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 二叉树最大深度
 * 两种思路：深度优先遍历和广度优先遍历都可以。
 * @author wangyushuai2@jd.com
 * @date 2020/12/1
 */
public class LeetCode104_MaxDepth {


    public int MaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = MaxDepth(root.left);
            int rightHeight = MaxDepth(root.right);
            return Math.max(leftHeight,rightHeight) + 1;
        }
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9,null,null),
                new TreeNode(20,new TreeNode(15,null,null),new TreeNode(7,null,null)));
        Assert.assertEquals("LeetCode104: 二叉树最大深度", 3, 3);
    }
}
