# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def sortList(self, head):
        curr = head
        li = []
        while curr:
            li.append(curr.val)
            curr = curr.next
        li.sort()
        curr = head
        for val in li:
            curr.val = val
            curr = curr.next
        return head
'''148. Sort List

Given the head of a linked list, return the list after sorting it in ascending order.

Example 1:
Input: head = [4,2,1,3]
Output: [1,2,3,4]

Example 2:
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]

Example 3:
Input: head = []
Output: []'''