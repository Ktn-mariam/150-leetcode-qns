/*
LINK: https://leetcode.com/problems/add-two-numbers/
THEORY:
    1-Iterate through both the list until either of them have nodes left
    2-The value of the new Node is sum of both nodes and carry % 10
    3-Save the value of carry in c
    4-Create a newNode with value sum
    5-prev.next = newNode unless prev is null implying the newNode is the head
    6-Save the value of this newNode as prev
    7-Continue with next values of lists
    8-After finishing the loop,
        if there is carry => create new Node with value of carry
    9-Return the head
 */


public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode prev = null;
        ListNode head = null;
        int c =0;
        while (curr1 != null || curr2 != null){
            int a = curr1 != null ? curr1.val : 0;
            int b = curr2 != null ? curr2.val : 0;
            int sum = (a+b+c)%10;
            c = (a+b+c)/10;
            ListNode newNode = new ListNode(sum);
            if (prev == null) {
                head = newNode;
            } else {
                prev.next = newNode;
            }
            prev = newNode;
            if (curr1 != null) curr1 = curr1.next;
            if (curr2 != null) curr2 = curr2.next;
        }
        if (c!= 0) prev.next = new ListNode(c);
        return head;
    }
}
