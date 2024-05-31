package src;

import java.util.List;

public class MergeTwoSortedLists21 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode();
        ListNode current = temp;

        while (list1 != null || list2 != null) {
            Integer num1 = (list1 == null) ? null : list1.val;
            Integer num2 = (list2 == null) ? null : list2.val;

            if (num1 == null) {
                current.next = new ListNode(num2);
                current = current.next;
                list2 = list2.next;
                continue;
            }
            if (num2 == null) {
                current.next = new ListNode(num1);
                current = current.next;
                list1 = list1.next;
                continue;
            }
            if (num1 < num2) {
                current.next = new ListNode(num1);
                current = current.next;
                list1 = list1.next;
            }
            else if (num1.equals(num2)) {
                current.next = new ListNode(num1);
                current = current.next;
                list1 = list1.next;
                current.next = new ListNode(num2);
                current = current.next;
                list2 = list2.next;
            }
            else {
                current.next = new ListNode(num2);
                current = current.next;
                list2 = list2.next;
            }
        }
        return temp.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(-2, new ListNode(5));
        ListNode list2 = new ListNode(-9, new ListNode(-6, new ListNode(-3, new ListNode(-1, new ListNode(1, new ListNode(6))))));
        ListNode l = mergeTwoLists(list1, list2);
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }

}
