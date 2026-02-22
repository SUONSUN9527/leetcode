package 链表14;

public class lc206 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = head;
        ListNode curr = pre.next;
        pre.next = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode res = reverseList(head);
        while (res != null) {
            System.out.print(res.val);
            res = res.next;
        }
    }
}
