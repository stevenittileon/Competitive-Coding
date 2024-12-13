class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0,head) # make a dummy node for the start
        left = dummy
        right = head
        while n > 0 and right: # makes the gap between left and right
            right = right.next
            n-=1
        
        while right: # goes till right = NULL which makes left stand on the node to be deleted
            left = left.next
            right = right.next

        #deletion of the node at nth place
        left.next = left.next.next
        return dummy.next # returns everything after dummy node

'''
19. Remove Nth Node From End of List

Given the head of a linked list, remove the nth node from the end of the list and return its head.

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
'''