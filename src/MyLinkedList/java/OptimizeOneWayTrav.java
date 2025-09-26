package MyLinkedList.java;

public class OptimizeOneWayTrav {
    public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    public static Node OptmizeDeleteFRomLast(Node head,int n){
        if(head==null || n<=0){
            return head;
        }

        Node dummy=new Node(0);
        dummy.next=head;
        Node fast=dummy;
        Node slow=dummy;

        for(int i=0;i<+n+1;i++){

        if(fast==null){
            return head;}
        fast=fast.next;}
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(23);
        Node b=new Node (65);
        Node c=new Node (5);
        Node d=new Node (21);
        Node e=new Node (85);
        Node f=new Node (2);
        Node g=new Node (19);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        Node x=OptmizeDeleteFRomLast(a,3);
        display(x);
        System.out.println();
        Node y=OptmizeDeleteFRomLast(a,6);
        display(y);
        System.out.println();
        Node w=OptmizeDeleteFRomLast(a,2);
        display(w);




    }
}
