package com.vikastadge.datastructure.linkedlist;

public class DeleteNodeFromLinkedList {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8};
        LinkedListNode<Integer> head = LinkedListUtil.createLinkedListFromArray(input);
        head = LinkedListUtil.deleteModeFromLinkedList(head,8);
        LinkedListUtil.printLinkedList(head);
    }

    /*
    Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list,
     instead you will be given access to the node to be deleted directly.
     */
    public void deleteNode(ListNode node) {
        node.val  = node.next.val;
        node.next = node.next.next;
    }
}
