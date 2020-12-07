package com.wys.practice.tree;

import com.wys.practice.TreeNode;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * 二叉树前序遍历
 * 递归思路
 * @author wangyushuai2@jd.com
 * @date 2020/10/27
 */
public class LeetCode144_PreOrderTraversal {
    /**
     * 前序遍历
     * @param root
     * @return
     */
    public List<Integer> preOrderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.add(root.val);
        if (root.left != null) {
            result.addAll(preOrderTraversal(root.left));
        }
        if (root.right != null) {
            result.addAll(preOrderTraversal(root.right));
        }
        return result;
    }

    @Test
    public void test() {
        TreeNode treeNode = new TreeNode(1, null,
                new TreeNode(2,
                        new TreeNode(3,null,null),
                        null));
        List<Integer> result = preOrderTraversal(treeNode);
        String excepted = StringUtils.join(Arrays.asList(1,2,3),",");
        Assert.assertEquals("二叉树先序遍历",excepted,StringUtils.join(result,","));

        TreeNode treeNode5 = new TreeNode(1,
                new TreeNode(2, null, null),null);
        List<Integer> result5 = preOrderTraversal(treeNode5);
        Assert.assertEquals("二叉树先序遍历","1,2",StringUtils.join(result5,","));
    }

}
