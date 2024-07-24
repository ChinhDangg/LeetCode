package src;

public class PalindromeLinkedList234 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode skip = head;
        ListNode half = head;
        while (skip.next != null && skip.next.next != null) {
            skip = skip.next.next;
            half = half.next;
        }

        ListNode secondHalf = half.next;
        ListNode reversed = null;
        while (secondHalf != null) {
            ListNode tempSaved = secondHalf.next;
            secondHalf.next = reversed;
            reversed = secondHalf;
            secondHalf = tempSaved;
        }

        ListNode n1 = head;
        ListNode n2 = reversed;
        while (n2 != null) {
            if (n1.val != n2.val)
                return false;
            n1 = n1.next;
            n2 = n2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.println(isPalindrome(head1));
        System.out.println(isPalindrome(head2));
    }
}
