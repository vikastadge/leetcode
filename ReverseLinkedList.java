package com.vikastadge.datastructure;
/*

Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class ReverseLinkedList {

    private static ListNode reverseLinkedList( ListNode head){
        if (head == null) return null;
        ListNode curr = head;
        ListNode next = curr.next;
        ListNode reversListHead = null;
        while(next != null){
            curr.next = reversListHead;
            reversListHead = curr;
            curr = next;
            next = next.next;
        }
        curr.next = reversListHead;
        reversListHead = curr;
        return reversListHead;
    }

    public static ListNode createLinkedListFromArray(int[] input){
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for (int i=0;i<input.length ; i++) {
            temp.next = new ListNode(input[i]) ;
            temp = temp.next;
        }
        return head.next;
    }

    public static void printLinkedList(ListNode head){
        while(head != null){
            System.out.println("data is :-"+head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] firstList = {1, 2, 3, 5, 7, 8};
        ListNode firstHead = createLinkedListFromArray(firstList);
        ListNode head = reverseLinkedList(firstHead);
        printLinkedList(head);
    }
}
