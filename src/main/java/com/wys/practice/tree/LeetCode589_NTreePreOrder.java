package com.wys.practice.tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * N叉树 先序遍历
 * 实现方式：
 * - 递归
 * - 非递归, 用栈实现
 * @author wangyushuai2@jd.com
 * @date 2020/12/22
 */
public class LeetCode589_NTreePreOrder {


    public List<Integer> preOrder(Node root) {
        List<Integer> result = new ArrayList<>();
        LinkedList<Node> stack = new LinkedList<>();
        if (root == null) {
            return new ArrayList<>();
        }
        stack.offer(root);
        while (! stack.isEmpty()) {
            Node node = stack.pollLast();
            result.add(node.val);
            // 反转压栈
            if (node.children != null &&  node.children.size() > 0) {
                Collections.reverse(node.children);
                for (Node child : node.children) {
                    stack.offer(child);
                }
            }
        }
        return result;
    }

    @Test
    public void test() {
        Node root = new Node(1, Arrays.asList(
                new Node(3,Arrays.asList(new Node(5,null),
                        new Node(6,null))),
                new Node(2,null),
                new Node(4,null))
        );
        List<Integer> result = preOrder(root);
        Assert.assertEquals("使用栈实现前序遍历", Arrays.asList(1, 3, 5, 6, 2, 4),result);
    }




    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
