package MyLinkedList.java;

public class CriticalPoiontDoublLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }

    }public static void CriticalPoint(Node head){ // first and last node cannot be critical point.
        Node prev=head;
        Node curr=head.next;

        int pos=1;
        int first=-1;
        int last=-1;
        int minDist=Integer.MAX_VALUE;
        int lastCritical=-1;
        while(curr!=null && curr.next!=null){
            if((curr.data>prev.data && curr.data>curr.next.data)||(curr.data< prev.data && curr.data<curr.next.data)){
                if(first == -1) first = pos;
                else{
                    minDist=Math.min(minDist,pos-lastCritical);
                }last=pos;
                lastCritical=pos;

            }prev=curr;
            curr=curr.next;
            pos++;
        }if(first==-1 || first == last){
            System.out.println("Not enough critical points");
        }else{
            System.out.println("Min dis ="+minDist);
            System.out.println("max dis ="+(last-first));
        }
    }
    public static void main(String[] args) {
        Node a =new Node(1);
        Node b=new Node(2);
        Node c=new Node (5);
        Node d=new Node (3);
        Node e=new Node(2);
        Node f=new Node(7);
        Node g=new Node (8);
        Node h= new Node(9);
        Node i=new Node(1);
        Node j=new Node (10);
        a.prev=null;
         a.next=b;

         b.prev=a;
         b.next=c;

        c.prev = b;
        c.next = d;

        d.prev = c;
        d.next = e;

        e.prev = d;
        e.next=f;

         f.prev=e;
         f.next=g;

         g.prev=f;
         g.next=h;

         h.prev=g;
         h.next=i;

         i.prev=h;
         i.next=j;

         j.prev=i;
         j.next=null;


        CriticalPoint(a);

    }
}
