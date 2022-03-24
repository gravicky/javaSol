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
        Map<Node,Node> map = new HashMap<>();
        for(Node n=head;n!=null;n=n.next){
            map.put(n,new Node(n.val));
        }
        
        for(Node n=head;n!=null;n=n.next){
            map.get(n).next = map.get(n.next);
            map.get(n).random = map.get(n.random);
        }
        
        return map.get(head);
        
        
        
    }
}