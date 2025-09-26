package MyLinkedList.java;

public class ReverseList {
    public static class Node{
        int val;
        Node next;
        Node (int val){
            this.val=val;
        }
    }
    public static void display(Node head){
        if(head==null){
            return ;
        }
        System.out.print(head.val+ " " );
        display(head.next);
    }
    public static Node displayRev(Node head){
        if(head.next==null){
            return head;
        }Node newHead=displayRev(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;

    }
    public static void main(String[] args) {
Node a=new Node(5);
        Node b=new Node(8);
        Node c=new Node(13);
        Node d=new Node(90);
        Node e=new Node(26);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        display(a);
        Node r =displayRev(a);
        System.out.println();
        display(r);
    }
}
