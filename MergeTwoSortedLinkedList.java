package com.vikastadge.algo;
/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

 */

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

public class MergeTwoSortedLinkedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(-1);
        ListNode head = l3;
        ListNode remainL1;
        ListNode remainL2;

        while(l1 != null && l2 != null){
            if (l1.val < l2.val){
                remainL1 = l1.next;
                l1.next = null;
                l3.next = l1;
                l1 = remainL1;

            }else{
                remainL2 = l2.next;
                l2.next = null;
                l3.next = l2;
                l2 = remainL2;
            }
            l3 = l3.next;
        }

        if (l1 != null){
            l3.next = l1;
        }
        if (l2 != null){
            l3.next = l2;
        }

        return head.next;
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
        int[] firstList = {2,5};
        int[] secondList = {1,3};
        ListNode l1 = createLinkedListFromArray(firstList);
        ListNode l2 = createLinkedListFromArray(secondList);
        printLinkedList(mergeTwoLists(l1, l2));
        //printLinkedList(l1);
        //printLinkedList(l2);
    }
}
