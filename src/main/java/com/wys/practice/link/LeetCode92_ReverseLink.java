package com.wys.practice.link;

import com.wys.practice.LinkListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 反转链表
 * @author wangyushuai2@jd.com
 * @date 2020/11/13
 */
public class LeetCode92_ReverseLink {


    public LinkListNode reverseLink(LinkListNode head) {
        LinkListNode cur = head;
        LinkListNode prev = null;
        while (cur != null) {
            LinkListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    @Test
    public void test() {
        LinkListNode listNode = new LinkListNode(1,new LinkListNode(2,new LinkListNode(3,null)));
        LinkListNode excepted = new LinkListNode(3,new LinkListNode(2,new LinkListNode(1,null)));
        Assert.assertEquals("反转列表",excepted,reverseLink(listNode));

    }
}
