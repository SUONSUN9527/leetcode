package 链表;


public class lc142 {
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode left = slow;
                ListNode right = head;
                while (left != right) {
                    left = left.next;
                    right = right.next;
                }
                return right; // 或 return left
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;;
        ListNode res = detectCycle(head);
        System.out.println(res.val);
    }
}
