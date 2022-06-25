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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1,len2,carry=0;
        ListNode l3;
        if(l1!=null && l2!=null){
            carry = (l1.val+l2.val)/10;
            l3 = new ListNode((l1.val+l2.val)%10);
            l1=l1.next;
            l2=l2.next;
        }
        else
            if(l1!=null){
                l3 = new ListNode(l1.val);
                l1=l1.next;
            }
        else
        {
            l3 = new ListNode(l2.val);
                l2=l2.next; 
        }
        ListNode l4 = l3;
        while(l1!=null && l2!=null){
            int x = l1.val+l2.val+carry;
            l3.next = new ListNode((x)%10);
            carry = x/10;
            l3 = l3.next;
            l2 = l2.next;
            l1 = l1.next;
            
            
        }
        while(l1!=null){
            int x = l1.val+carry;
            l3.next = new ListNode((x)%10);
            carry = x/10;
            l3 = l3.next;
            l1 = l1.next;
            
            
        }
        while(l2!=null){
            int x = l2.val+carry;
            l3.next = new ListNode((x)%10);
            carry = x/10;
            l3 = l3.next;
            l2 = l2.next;
            
            
        }
        if(carry!=0)
            l3.next = new ListNode(carry);
        return l4;
        
    }
}