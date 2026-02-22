package 链表14;

public class lc25 {

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;

        while(true){
            int a = 0;
            ListNode end = pre;
            boolean flag = false;
            while(end != null ){
                if(a == k){
                    flag = true;
                    break;
                }
                end = end.next;
                a += 1;

            }
            if(flag){
                ListNode extend = end.next;
                end.next = null;
                ListNode start = fun(pre.next);
                pre.next = start;
                while(start.next != null){
                    start = start.next;
                }
                start.next = extend;

                pre = start;
            }else{
                break;
            }
        }
        return dummy.next;

    }

    public static ListNode fun(ListNode head){
        ListNode dummy = null;
        while(head != null){
            ListNode curr = head.next;
            head.next = dummy;
            dummy = head;
            head = curr;
        }
        return dummy;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);

        ListNode x = reverseKGroup(l1,3);

        while (x != null) {
            System.out.println(x.val);
            x = x.next;
        }
    }

}
