/*
LINK: https://leetcode.com/problems/reverse-linked-list/
THEORY:
    1-Create 2 nodes prev and next initialised as null
    2-Create a node for storing the current node initialised as head
    3-Iterate through the while loop till it is not null
    4-Inside the while loop, next will store the value of node after curr
    5-And now curr.next will point to prev
    6-Now prev = curr so that in next iteration it can be used to point to previous element
    7-And then curr = next
    8-After while loop ends, the new head = prev
    9-Return the head
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}
