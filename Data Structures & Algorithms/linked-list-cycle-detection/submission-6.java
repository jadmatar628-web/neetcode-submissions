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
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(slow!=null){
            slow=slow.next;
             if(fast==null || fast.next==null){
                return false;
            }
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return true;
    }
}
