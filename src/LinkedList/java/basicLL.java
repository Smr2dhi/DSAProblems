package LinkedList.java;

public class basicLL {
    public static int lllength(Node head){
        int count=0;
       while(head!= null){
           count++;
           head=head.next;

       }
       return count;
    }
    public static void revPrint(Node head){
        if(head==null){
            return;
        }revPrint(head.next);
        System.out.print(head.data+" ->");
    }
    public static void recCall(Node head){
      if (head==null) {
          return;
      }

        System.out.print(head.data+"->");
        display(head.next);
    }

    public static void display(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(8);
        Node c=new Node(12);
        Node d=new Node(82);
        a.next=b;
        b.next=c;
        c.next=d;
        display(a);
        System.out.println(" ");
        recCall(a); 
        System.out.println(" ");
        revPrint(a);
        System.out.println(" ");

        System.out.println(lllength(a));
        }
    }

