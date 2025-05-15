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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        while(curr!= null){
            if(curr.next!= null && curr.val == curr.next.val){
                while(curr.next!= null && curr.val == curr.next.val){
                    curr = curr.next;
                }
                prev.next = curr.next;
            }
            else{
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
/*
82. Remove Duplicates from Sorted List II

Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

Example 1:
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

Example 2:
Input: head = [1,1,1,2,3]
Output: [2,3] */