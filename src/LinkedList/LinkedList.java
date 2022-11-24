package LinkedList;

class LinkedList
{
    Node head;  // head of list

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    public void push(int x){
        Node newNode=new Node(x);
        newNode.next=head;
        head=newNode;
    }
    public void add(int x){
        Node newNode=new Node(x);
        if(head==null){
            head=new Node(x);
            return;
        }
        newNode.next=null;
        Node last=head;
        while(last.next!=null){
            last=last.next;
            last.next=newNode;
            return;
        }
    }
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(6);
        ll.push(3);//add first
        ll.push(9);
        ll.push(10);
        ll.add(20);
        ll.printList();
    }
}
