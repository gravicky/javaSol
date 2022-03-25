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
public boolean isPalindrome(ListNode head) {
if (head == null) return true;

    ListNode prev = null;
    ListNode fast = head, slow = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        ListNode prev2 = slow.next;
        slow.next = prev;
        prev = slow;
        slow = prev2;
    }
    if (fast != null) { // if it is odd, 
        slow = slow.next;
    }

    while (slow != null && prev != null) {
        if (prev.val != slow.val) {
            return false;
        }
        slow = slow.next;
        prev = prev.next;
    }

    if (slow != null || prev != null) {
        return false;
    }

    return true;

}
}