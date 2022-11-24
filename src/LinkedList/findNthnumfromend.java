package LinkedList;


public class findNthnumfromend {

    static Object getNthFromLast(Node head, int n) {
        Node preNum = head;// creat variable denote (data)
        Node refNum = head;//creat variable denote (next)
        int cnt = 0;// move next data ++
        if (head != null) {//if head not equal to size
            while (cnt < n) {// traverc till n greater than cnt
                if (refNum == null) {//if data equal to null
                    return 1;
                }
                refNum = refNum.next;//else next move next
                cnt++;// next.next move by using cnt++
            }
            if (refNum == null) {
                if (refNum != null)
                    return head.data;
            }
            while (refNum != null) {
                preNum = preNum.next;
                refNum = refNum.next;
            }
        }
        return preNum.data;
    }

    public static void main(String[] args) {

    }
    class Node{
        Node next;
        Node data;
       int vale;
        Node(int vale){
            this.vale=vale;
            next=null;
        }
    }
}
