package LinkedList.java;

public class Basic {
    public static class Node{
        int data;
        Node next;//address of next node.
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[]args){
        Node a =new Node(46);
        System.out.println(a.next);
        Node b =new Node(89);
        Node c =new Node(41);
        Node d =new Node(89);
        Node e =new Node(78);
        a.next=b;//46--> 89 41 89 78
       b.next=c;//46 -->89 -->41 89 78
        c.next=d;//46 -->89 -->41--> 89 78
        d.next=e;//46--> 89--> 41--> 89--> 78
        //Printing all value of linked list using loop...
        Node temp=a;
      for(int i=0;i<5;i++){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("-");
        /* Printing all value of linked list using loop(unknown length)..... */
        temp=a;/* needed becuase if i donot use it once temp reach at end it no longer
        be used in second loop. used to print the linked list to print it two times.

        */

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
