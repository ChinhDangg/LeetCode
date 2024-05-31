package src;

public class RemoveLinkedListElements203 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode();
        ListNode current = temp;
        while (head != null) {
            if (head.val != val) {
                current.next = new ListNode(head.val);
                current = current.next;
            }
            head = head.next;
        }
        return temp.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3,
                new ListNode(4, new ListNode(5, new ListNode(6)))))));
        ListNode removed = removeElements(n1, 6);
        while (removed != null) {
            System.out.println(removed.val);
            removed = removed.next;
        }
    }
}
