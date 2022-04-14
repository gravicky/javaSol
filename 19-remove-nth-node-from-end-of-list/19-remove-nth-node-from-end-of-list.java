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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ny=head;
        if(head.next==null)
            return null;
        while(true){
            int num=n;
            ListNode nz=ny;
            while(num>=0){
                nz=nz.next;
                num--;
                if(nz==null && num>=0)
                    return head.next;
            }
            if(nz==null){
                ny.next=ny.next.next;
                break;
            }
            ny=ny.next;
            
        }
        return head;
        
    }
}