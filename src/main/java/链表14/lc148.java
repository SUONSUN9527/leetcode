package 链表14;

public class lc148 {

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }


        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode start = dummy;

        while(head != null){
            ListNode cur = head.next;
            if(cur.val<head.val){
                head.next = head.next.next;
                start.next = cur;
                cur.next = head;
            }
        }
        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode c1 = new ListNode(4);
        c1.next = new ListNode(2);
        c1.next.next = new ListNode(3);
        c1.next.next.next = new ListNode(-1);

        ListNode listNode = sortList(c1);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

}
