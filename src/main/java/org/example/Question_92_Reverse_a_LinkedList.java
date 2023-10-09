package org.example;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Question_92_Reverse_a_LinkedList {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left ==1)
            return reversed(head,right);

        head.next = reverseBetween(head.next,left-1,right-1);
        return head;
    }
    private ListNode reversed(ListNode head, int k){
        if(k==1)
            return head;
        ListNode newHead = reversed(head.next,k-1);
        ListNode headNext = head.next;
        head.next = headNext.next;
        headNext.next = head;
        return newHead;
    }
}