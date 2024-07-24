package src;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList206 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode r = reverseList(n1);
        while (r != null) {
            System.out.println(r.val);
            r = r.next;
        }
    }
}
