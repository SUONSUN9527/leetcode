package 链表14;

public class lc21 {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur = new ListNode(0);
        ListNode head = cur;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                head.next = list1;
                list1 = list1.next;
            }else{
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        if(list1 == null && list2 != null){
            while(list2 != null){
                head.next = list2;
                head = head.next;
                list2 = list2.next;
            }
        }
        if(list1 != null){
            while(list1 != null){
                head.next = list1;
                head = head.next;
                list1 = list1.next;
            }
        }
        return cur.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode res = mergeTwoLists(l1, l2);
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
