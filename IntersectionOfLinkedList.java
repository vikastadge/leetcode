package com.vikastadge.datastructure.linkedlist;
/*
160. Intersection of Two Linked Lists
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
If the two linked lists have no intersection at all, return null.
 */
public class IntersectionOfLinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode headATemp = headA;
        ListNode headBTemp = headB;
        int sizeOfA = 0;
        int sizeOfB = 0;
        while(headATemp != null){
            sizeOfA++;
            headATemp = headATemp.next;
        }
        while(headBTemp != null){
            sizeOfB++;
            headBTemp = headBTemp.next;
        }
        if(sizeOfA > sizeOfB){
            int numOfIncreaments = sizeOfA - sizeOfB;
            for(int i=0;i<numOfIncreaments;i++){
                headA = headA.next;
            }
        }else{
            int numOfIncreaments = sizeOfB - sizeOfA;
            for(int i=0;i<numOfIncreaments;i++){
                headB = headB.next;
            }
        }

        while (headA != null & headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
