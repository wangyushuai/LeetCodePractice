package com.wys.practice.tree;

import com.wys.practice.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 二叉树最大深度
 * 两种思路：
 *  - 深度优先遍历
 *  - 广度优先遍历
 *  - 递归统计
 *
 * @author wangyushuai2@jd.com
 * @date 2020/12/1
 */
public class LeetCode104_MaxDepth {

    public int maxDepth(TreeNode root) {
        // terminator
        if (root == null) {
            return 0;
        }
        // process
        // recurse
        return Math.max(maxDepth(root.left),maxDepth(root.right)) +1;
        // drill down
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9,null,null),
                new TreeNode(20,new TreeNode(15,null,null),new TreeNode(7,null,null)));
        Assert.assertEquals("LeetCode104: 二叉树最大深度", 3, 3);
    }
}
