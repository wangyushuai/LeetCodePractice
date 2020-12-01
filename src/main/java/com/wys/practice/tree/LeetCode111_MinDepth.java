package com.wys.practice.tree;

import com.wys.practice.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 二叉树最小深度
 *
 * BFS:
 *  发现叶子节点直接返回。
 * DFS:
 *  若 左子树与右子树有一个为空, 则返回 另一个字数高度+ 1
 *  若 左子树与右子树皆不为空给， 则返回左子树与右子树得最小值
 * @author wangyushuai2@jd.com
 * @date 2020/12/1
 */
public class LeetCode111_MinDepth {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = minDepth(root.left);
        int rightHeight = minDepth(root.right);

        return (leftHeight == 0 || rightHeight == 0)? leftHeight + rightHeight + 1 :
                Math.min(leftHeight, rightHeight) + 1;

    }


    @Test
    public void test() {
        //[2,null,3,null,4,null,5,null,6] excepted: 5
        TreeNode root = new TreeNode(2, null,
                new TreeNode(3,null,
                        new TreeNode(4,null,
                                new TreeNode(5,null,
                                        new TreeNode(6)))));
        Assert.assertEquals("Leetcode 101: 二叉树最小深度",5,minDepth(root));

    }
}
