/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
public Node copyRandomList(Node head) {
	//<original, clone>
    HashMap<Node, Node> maps = new HashMap<>();
    Node cursor = head;
    while(null != cursor){
        maps.put(cursor, new Node(cursor.val));
        cursor = cursor.next; 
    }
    cursor = head;
    while(null != cursor){
    	maps.get(cursor).random = maps.get(cursor.random);
    	cursor = cursor.next;
    }
    cursor = head;
    while(null != cursor){
    	maps.get(cursor).next = maps.get(cursor.next);
        cursor = cursor.next;
    }
    return maps.get(head);
}
}