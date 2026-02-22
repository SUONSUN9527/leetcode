package 链表14;

public class lc19 {


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        while(n!=0 && fast.next != null){
            fast = fast.next;
            n--;
        }


        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);

        ListNode listNode = removeNthFromEnd(l1, 2);

        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}
