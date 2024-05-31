package src;

public class RemoveDuplicatesFromSortedList83 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.val == temp.next.val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        //ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode head = new ListNode();
        ListNode noDup = deleteDuplicates(head);
        while (noDup != null) {
            System.out.println(noDup.val);
            noDup = noDup.next;
        }
    }
}
