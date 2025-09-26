package MyLinkedList.java;

public class nthNodeFRomEndOneTrav {
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node deleteFromNth(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
            if(fast==null){
                head=head.next;
                return head;
            }
        }while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
       return slow.next=slow.next.next;
    }

    public static Node OneTravLastNthVal(Node head,int ind){
        Node fast=head;
        Node slow =head;
        for(int i=1;i<=ind;i++){
            fast=fast.next;
        }while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;

    }
    public static class Node{
        int data;
        Node next;
        Node(int data){

            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(67);
        Node b=new Node(90);
        Node c=new Node(54);
        Node d=new Node(7);
        Node e=new Node(32);
        Node f=new Node(78);
        Node g=new Node(79);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        Node q=OneTravLastNthVal(a,3);
        Node q1=OneTravLastNthVal(a,4);
        System.out.println(q.data);
        System.out.println(q1.data);
        display(a);
        System.out.println();
      a= deleteFromNth(a,4);
       display(a);



    }
}
