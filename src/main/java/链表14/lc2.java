package 链表14;

public class lc2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res =  new ListNode(0);
        ListNode dummy = res;
        int n = 0;
        while(l1!=null || l2!=null || n != 0) {
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;

            int sum = n1+n2+n;

            if(sum>=10) {
                n = 1;
                sum = sum-10;
            }else{
                n = 0;
            }

            dummy.next = new ListNode(sum%10);
            dummy = dummy.next;

            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;

        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
