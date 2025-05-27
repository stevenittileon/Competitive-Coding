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
    public ListNode sortList(ListNode head) {
        ListNode res = head;
        ListNode ref = head;
        if(ref == null || ref.next == null){
            return head;
        }
        List<Integer> li = new ArrayList<>();
        while(ref!= null){
            li.add(ref.val);
            ref = ref.next;
        }
        Collections.sort(li);
        for(int i = 0; i<li.size(); i++){
            if(i == 0){
                res = new ListNode(li.get(0));
                ref = res;
            }
            else{
                ref.next = new ListNode(li.get(i));
                ref = ref.next;
            }
        }
        return res;
    }
}
/*148. Sort List

Given the head of a linked list, return the list after sorting it in ascending order.

Example 1:
Input: head = [4,2,1,3]
Output: [1,2,3,4]

Example 2:
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]

Example 3:
Input: head = []
Output: [] 
*/