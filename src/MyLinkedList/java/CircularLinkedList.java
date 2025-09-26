package MyLinkedList.java;

public class CircularLinkedList {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }public static void display( Node head){
        Node temp=head;
        do{
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        while(temp!=head);
            System.out.println();

        }




    public static void main(String[] args) {
        Node a=new Node(78);
        Node b=new Node(61);
        Node c=new Node(341);
        Node d=new Node(785);
        Node e=new Node(876);
        a.prev=e;
        a.next=b;

        b.prev=a;
        b.next=c;

        c.prev=b;
        c.next=d;

        d.prev=c;
        d.next=e;

        e.prev=d;
        e.next=a;
        display(a);


    }
}
