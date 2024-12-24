class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        curr = dummy
        carry = 0

        while l1 or l2 or carry: # loops through the lists
            v1 = l1.val if l1 else 0
            v2 = l2.val if l2 else 0

            val = v1 + v2 + carry # creates new digit
            carry = val // 10 # collects carry
            val = val % 10 # only requires the last bit of the value
            curr.next = ListNode(val) # adds it to the new linked list

            curr = curr.next # moves current upto the next
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None

        return dummy.next # returns final linked list

'''
2. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

'''