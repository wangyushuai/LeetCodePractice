package com.wys.practice.tree;


import com.wys.practice.LinkListNode;
import com.wys.practice.TreeNode;
import com.wys.practice.link.LeetCode24;
import org.junit.Assert;
import org.junit.Test;

/**
 * 有序链表转二叉树
 *
 * 1. 找到中位数作为根节点
 * 2. 递归构建平衡二叉树
 *
 * @author wangyushuai2@jd.com
 * @date 2020/10/27
 */
public class LeetCode109_SortedListToBST {

    public TreeNode sortedListToBST(LinkListNode head) {
        return buildTree(head,null);
    }

    /**
     * 构建树
     * @param left
     * @param right
     * @return
     */
    public TreeNode buildTree(LinkListNode left,LinkListNode right) {
        if (left == right) {
            return null;
        }
        LinkListNode mid = getMedian(left,right);
        TreeNode root = new TreeNode(mid.getValue());
        root.left = buildTree(left,mid);
        root.right = buildTree(mid.next,right);
        return root;
    }
    
    
    /**
     * 获取中位数，找到Root节点
     * @param left
     * @param right
     * @return
     */
    public LinkListNode getMedian(LinkListNode left,LinkListNode right) {
        LinkListNode fast = left;
        LinkListNode slow = left;
        while (fast != right && fast.next != right) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    @Test
    public void test() {
        LinkListNode head = new LinkListNode(-10,
                new LinkListNode(-3,
                        new LinkListNode(0,
                                new LinkListNode(1,
                                        new LinkListNode(9,null)))));
        TreeNode treeNode = buildTree(head,null);
        Assert.assertEquals("109-root-value",treeNode.val,0);
        Assert.assertEquals("109-left-root-value",treeNode.left.val,-3);
        Assert.assertEquals("109-left-left-value",treeNode.left.left.val,-10);
        Assert.assertEquals("109-right-root-value",treeNode.right.val,9);
        Assert.assertEquals("109-left-left-value",treeNode.right.left.val,1);
    }


}
