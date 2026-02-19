package 链表;

import java.util.List;

public class lc160 {


      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode pA = headA, pB = headB;
          while (pA != pB) {
              pA = pA == null ? headB : pA.next;
              pB = pB == null ? headA : pB.next;
          }
          return pA;
    }



    public static void main(String[] args) {
        int intersectVal = 8;
        ListNode c1 = new ListNode(8);
        c1.next = new ListNode(4);
        c1.next.next = new ListNode(5);

        // A: 4 -> 1 -> 8 -> 4 -> 5
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = c1;

        // B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = c1;

        ListNode res = getIntersectionNode(headA, headB);
        System.out.println(res == null ? "null" : res.val); // 8
    }
}
