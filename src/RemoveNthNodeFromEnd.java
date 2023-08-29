import java.util.*;

/*
LINK: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
NAME: Remove Nth Node From End of List
THEORY:
    1-Find the length of the list
    2-Find the indx of length - n
    3-The node after the node at the indx is the one that we have to delete
    4-Exception cases
        a) If length of node is 0/1 return null
        b) If indx is 0 => delete head => return head.next
 */


class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        if (length == 0 || length == 1) return null;
        int deleteNode = length - n;

        if (deleteNode == 0) return head.next;

        int currIndx = 1;
        curr = head;
        while (curr != null) {
            if (currIndx == deleteNode) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
            currIndx++;
        }
        return head;
    }
}
