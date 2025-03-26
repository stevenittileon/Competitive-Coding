/* 
class Node {
    int data;
    Node next;

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
}
*/
import java.util.*;
class Solution {
    static Node constructLL(int arr[]) {
        // code here
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1; i<arr.length; i++){
            Node newnode = new Node(arr[i]);
            temp.next = newnode;
            temp = temp.next;
        }
        return head;
    }
}
/*
Array to Linked List

Given an array of integer arr. Your task is to construct the linked list from arr & return the head of the linked list.

Examples:

Input: arr = [1, 2, 3, 4, 5]
Output: LinkedList: 1->2->3->4->5

Explanation: Linked list for the given array will be

Input: arr = [2, 4, 6, 7, 5, 1, 0]
Output: LinkedList: 2->4->6->7->5->1->0

Explanation: Linked list for the given array will be
 */