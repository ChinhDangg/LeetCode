package src;

public class IntersectionOfTwoLinkedLists160 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node12 = new ListNode(1);
        ListNode shared = new ListNode(8);
        ListNode shared1 = new ListNode(4);
        ListNode shared2 = new ListNode(5);
        ListNode node2 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node23 = new ListNode(1);
        node1.next = node12;
        node12.next = shared;
        shared.next = shared1;
        shared1.next = shared2;
        node2.next = node22;
        node22.next = node23;
        node23.next = shared;

        ListNode result = getIntersectionNode(node1, node2);
        System.out.println(result.val);
    }

}
