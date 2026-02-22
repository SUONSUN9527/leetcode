package 链表14;

import java.util.PriorityQueue;

public class lc23 {

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val-b.val);

        for(ListNode node : lists){
            if(node != null){
                pq.offer(node);
            }
        }

        ListNode dummy = new ListNode(0);

        ListNode p = dummy;
        while(!pq.isEmpty()){
            ListNode m = pq.poll();
            p.next = m;
            p = p.next;
            if (m.next != null) {
                pq.offer(m.next);
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {

    }

}
