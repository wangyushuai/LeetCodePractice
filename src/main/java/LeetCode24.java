/**
 * 交换链表中的两个节点
 * @author wangyushuai2@jd.com
 * @date 2020/10/15
 */
public class LeetCode24 {

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode curPair = head;
        ListNode newHead = head.next;
        while(curPair != null && curPair.next != null) {
            ListNode nextPair = curPair.next ==  null? null: curPair.next.next;
            curPair.next.next = curPair;
            if(nextPair != null && nextPair.next != null) {
                curPair.next = nextPair.next;
            } else if(nextPair != null && nextPair.next == null) {
                curPair.next = nextPair;
            } else {
                curPair.next = null;
            }
            curPair = nextPair;
        }
        return newHead;
    }

     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

}
