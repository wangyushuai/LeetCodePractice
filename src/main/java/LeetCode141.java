import java.util.HashSet;
import java.util.Set;

/**
 * 判断是否有环
 * @author wangyushuai2@jd.com
 * @date 2020/10/15
 */
public class LeetCode141 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public boolean hasCycle(ListNode head) {
        ListNode cur = head;
        Set<ListNode> set = new HashSet<>();
        while(cur != null) {
            if(set.contains(cur)) {
                return true;
            } else {
                set.add(cur);
            }
            cur = cur.next;
        }
        return false;

    }

}
