package com.wys.practice.tree;

import com.wys.practice.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * 二叉树层级遍历(广度优先遍历，BFS)
 *
 * @author wangyushuai2@jd.com
 * @date 2020/11/27
 */
public class LeetCode102_BinaryTreeLevelOrder {


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (! queue.isEmpty()) {
            int n = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < n; i ++) {
                TreeNode cur = queue.poll();
                level.add(cur.val);
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            result.add(level);
        }
        return result;
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,new TreeNode(4,null,null),new TreeNode(5,null,null)),
                new TreeNode(3,null,new TreeNode(6,null,null)));

        List<List<Integer>> excepted = new ArrayList<>();
        excepted.add(Arrays.asList(1));
        excepted.add(Arrays.asList(2,3));
        excepted.add(Arrays.asList(4,5,6));
        Assert.assertEquals("二叉树层级遍历",excepted,levelOrder(root));
    }
}
