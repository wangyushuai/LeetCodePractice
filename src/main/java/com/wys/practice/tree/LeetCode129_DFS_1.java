package com.wys.practice.tree;

import com.wys.practice.TreeNode;
import org.junit.Assert;
import org.junit.Test;


/**
 * sum-root-to-leaf-numbers
 * 根节点到叶子节点之和
 * @author wangyushuai2@jd.com
 * @date 2020/11/30
 */
public class LeetCode129_DFS_1 {

    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }

    public int dfs(TreeNode root, int preSum) {
        if (root == null) {
            return 0;
        }
        int sum = preSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        } else {
            return  dfs(root.left,sum) + dfs(root.right,sum);
        }
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(4, new TreeNode(9,new TreeNode(5,null,null),new TreeNode(1,null,null)),
                new TreeNode(0,null,null));
        Assert.assertEquals("深度优先遍历",1026,sumNumbers(root));
    }
}
