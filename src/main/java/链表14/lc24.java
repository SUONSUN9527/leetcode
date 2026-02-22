package 链表14;

public class lc24 {

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode res = dummy;

        while(dummy.next != null && dummy.next.next != null){
            ListNode a = dummy.next;
            ListNode b = dummy.next.next;

            a.next = b.next;
            b.next = a;
            dummy.next = b;

            dummy = dummy.next.next;
        }


        return res.next;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);

        ListNode x = swapPairs(l1);

        while (x != null) {
            System.out.println(x.val);
            x = x.next;
        }
    }
}
