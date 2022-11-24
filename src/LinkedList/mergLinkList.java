package LinkedList;
public class mergLinkList {
class Node{
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}

    public Node Merge(Node head1, Node head2) {
//Enter your code here
        Node head3 = new Node(-1);
        Node p1 = head1;
        Node p2 = head2;
        Node p3 = head3;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                p3.next = p1;
                p1 = p1.next;
                p3 = p3.next;
                p3.next = null;
            } else {
                p3.next = p2;
                p2 = p2.next;
                p3 = p3.next;
                p3.next = null;
            }
        }
        while (p1 != null) {
            p3.next = p1;
            p1 = p1.next;
            p3 = p3.next;
            p3.next = null;
        }
        while (p2 != null) {
            p3.next = p2;
            p2 = p2.next;
            p3 = p3.next;
            p3.next = null;
        }
        return head3.next;
    }

    public Node insert111(Node head, int val) {
        if (head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }
}
