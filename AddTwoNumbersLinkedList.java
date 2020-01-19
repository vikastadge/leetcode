package com.vikastadge.datastructure;
/*

2. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbersLinkedList {

    private static ListNode addLinkedList( ListNode l1,
                                           ListNode l2){
        ListNode head = new ListNode(-1);
        ListNode start = head;
        int extra = 0;
        while (l1 != null && l2 != null){
            int add = l1.val + l2.val + extra;
            if (add >= 10){
                extra = add / 10;
                add = add % 10;
            }else{
                extra = 0;
            }
            head.next = new ListNode(add);
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 == null && l2 != null){
            int add = l2.val + extra;
            if (add >= 10){
                extra = add / 10;
                add = add % 10;
            }else{
                extra = 0;
            }
            head.next = new ListNode(add);
            head = head.next;
            l2 = l2.next;
        }
        while (l2 == null && l1 != null){
            int add = l1.val + extra;
            if (add >= 10){
                extra = add / 10;
                add = add % 10;
            }else{
                extra = 0;
            }
            head.next = new ListNode(add);
            head = head.next;
            l1 = l1.next;
        }
        if (extra > 0){
            head.next = new ListNode(extra);
        }
        return start.next;
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
        int[] firstList = {9, 1, 6};
        int[] secondList = {0};
        ListNode firstHead = createLinkedListFromArray(firstList);
        ListNode secondHead = createLinkedListFromArray(secondList);
        ListNode head = addLinkedList(firstHead,secondHead);
        printLinkedList(head);
    }
}
