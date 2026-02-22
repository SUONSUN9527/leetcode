package 链表14;

public class lc138 {

    public static Node copyRandomList(Node head) {
        if (head == null) return null;

        Node dom = head;

        // 1) 插队
        while (head != null) {
            Node newNode = new Node(head.val);
            newNode.next = head.next;
            head.next = newNode;
            head = newNode.next;
        }

        // 2) random
        head = dom;
        while (head != null) {
            head.next.random = (head.random == null) ? null : head.random.next;
            head = head.next.next;
        }

        // 3) 拆分
        Node old = dom;
        Node newCur = dom.next;
        Node res = newCur;

        while (old != null) {
            old.next = old.next.next;
            newCur.next = (newCur.next == null) ? null : newCur.next.next;

            old = old.next;
            newCur = newCur.next;
        }

        return res;
    }

    public static void main(String[] args) {

    }

}
