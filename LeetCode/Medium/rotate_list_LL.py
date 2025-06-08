# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def rotateRight(self, head, k):
        if not head:
            return head
        
        curr = head
        length = 1
        while curr.next:
            curr = curr.next
            length += 1
        curr.next = head

        k = length - (k % length)
        while k > 0:
            curr = curr.next
            k -= 1
        
        res = curr.next
        curr.next = None
        return res
'''
61. Rotate List

Given the head of a linked list, rotate the list to the right by k places.

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Example 2:
Input: head = [0,1,2], k = 4
Output: [2,0,1]'''