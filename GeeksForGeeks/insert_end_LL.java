/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = head;
        Node t1 = new Node(x);
        if(temp == null){
            return t1;
        }
        while(temp.next != null){
            temp = temp.next; 
        }
        temp.next = t1;
        t1.next = null;
        return head;
    }
}

/*
Linked List Insertion At End

Given the head of a Singly Linked List and a value x, insert that value x at the end of the LinkedList and return the modified Linked List.

Examples :

Input: LinkedList: 1->2->3->4->5 , x = 6
Output: 1->2->3->4->5->6

Explanation: 
We can see that 6 is inserted at the end of the linkedlist.

Input: LinkedList: 5->4 , x = 1
Output: 5->4->1

Explanation: 
We can see that 1 is inserted at the end of the linkedlist. 
*/