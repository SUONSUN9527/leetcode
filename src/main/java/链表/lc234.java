package 链表;

import java.util.ArrayList;
import java.util.List;

public class lc234 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static boolean isPalindrome(ListNode head) {
//        List<Integer> list = new ArrayList<>();
//        while(head != null) {
//            if(list.contains(head.val)) {
//                list.remove(Integer.valueOf(head.val));
//            }else{
//                list.add(head.val);
//            }
//
//            head = head.next;
//        }
//        if(list.isEmpty()) {
//            result = true;
//        }

        if (head == null || head.next == null) return true;

        // 1️⃣ 快慢指针找中点
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2️⃣ 反转后半部分
        ListNode right = reverse(slow);
        ListNode left = head;

        // 3️⃣ 对比左右
        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // 反转链表
    private static ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        boolean palindrome = isPalindrome(head);
        System.out.println(palindrome);
    }
}
