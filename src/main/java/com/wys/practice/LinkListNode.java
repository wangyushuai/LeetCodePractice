package com.wys.practice;

/**
 *
 * @author wangyushuai@fang.com
 * @date 2018/11/23
 */
public class LinkListNode {
    private int value;
    private LinkListNode next;

    public LinkListNode() { }

    public LinkListNode(int value,LinkListNode next) {
        this.value = value;
        this.next = next;
    }

    public static  void main(String args[]) {
        LinkListNode listNode1,listNode2,listNode3,listNodeHead;
        listNode3 = new LinkListNode(3,null);
        listNode2 = new LinkListNode(2,listNode3);
        listNode1 = new LinkListNode(1,listNode2);
        listNodeHead = new LinkListNode(0,listNode1);

        transfer(listNodeHead);


    }

    public static void transfer (LinkListNode head) {
        output(head);
        LinkListNode pre,pnext, p;
        pre = null;
        p = head.next;
        //转置
        while (null != p) {
            pnext = p.next;
            p.next = pre;
            pre = p;
            p = pnext;
        }
        head.next = pre;
        LinkListNode listNode = new LinkListNode(0,head.next);
        //输出
        output(listNode);
    }

    public static void output(LinkListNode head) {
        LinkListNode p = head.next;
        while (null != p) {
            System.out.println(p.value);
            p = p.next;
        }
        System.out.println("------------------");
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkListNode getNext() {
        return next;
    }

    public void setNext(LinkListNode next) {
        this.next = next;
    }
}
