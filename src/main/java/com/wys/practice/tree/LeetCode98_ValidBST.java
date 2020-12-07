package com.wys.practice.tree;

import com.wys.practice.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 校验二叉树是搜索二叉树
 *
 * 1. 中序遍历： 产生的应该是有序的
 * 2. 递归：
 *       - 左子树产生最大值小于根节点
 *       - 右子树产生的最小值大于根节点
 *
 * @author wangyushuai2@jd.com
 * @date 2020/10/27
 */
public class LeetCode98_ValidBST {

    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);

    }

    public boolean inOrderValid(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return inOrder(root,result);
//        inOrder(root,result);
//        List<Integer> copy = new ArrayList<>(result);
//        return result.equals(copy.stream().sorted());

    }

    protected Integer inOrderPrev =  null;

    protected boolean inOrder(TreeNode root,List<Integer> result) {
        if (root == null) {
            return true;
        }
        if (! inOrder(root.left,result)) {
            return false;
        }
        if (inOrderPrev != null && root.val < inOrderPrev) {
            return false;
        }
        inOrderPrev = root.val;
        result.add(root.val);
        return  inOrder(root.right,result);
    }

    /**
     * 递归写法
     * @param root
     * @param lower
     * @param upper
     * @return
     */
    public boolean helper(TreeNode root, Integer lower, Integer upper) {
       if (root == null) {
           return true;
       }
       if (lower != null && root.val <= lower) {
           return false;
       }
       if (upper != null && root.val >= upper) {
           return false;
       }
        return helper(root.left,lower,root.val) && helper(root.left,root.val,upper);
    }





    @Test
    public void test() {
        // 递归方法
        TreeNode root = new TreeNode(5,
                new TreeNode(1,null,null),
                new TreeNode(4,
                        new TreeNode(3,null,null),
                        new TreeNode(6,null,null)));
        Assert.assertFalse(isValidBST(root));

        //中序遍历
        TreeNode treeNode = new TreeNode(2,new TreeNode(1,null,null),new TreeNode(3,null,null));
        Assert.assertTrue(inOrderValid(treeNode));
        Assert.assertFalse(inOrderValid(root));
    }

}
