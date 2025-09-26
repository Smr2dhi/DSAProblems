package LinkedList.java;

import org.w3c.dom.ls.LSOutput;

public class ImplementationOfLL {
    public static class Node{
     int data;
     Node next;
     Node (int data){
         this.data=data;
     }

    }
    public static class Link{
        Node head=null;
        Node tail= null;
        // Insert at the end of the linked list
        void insertAtEnd(int val){
            Node temp=new Node (val);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
        }

        // Insert at the beginning of the linked list
        void insertAtBeg(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;

            }else{
                temp.next=head;
                head=temp;
            }

        }      // Insert at a specific index
        void insertAt(int index,int val){
            Node t=new Node(val);
           Node temp=head;
           if(index==size()){ //to overcome the tail show second last
               insertAtEnd(val);
               return;
           }else if(index==0){ // To insert at the tail
               insertAtBeg(val);
               return;
           } else if (index>size() || index<0) {
               System.out.println("Wrong index");
               return ;
               
           }
            // Traverse the list to find the node at index-1
           for(int i = 1; i <= (index - 1); i++){
temp=temp.next;

           }// Insert the new node
           t.next=temp.next;
           temp.next=t;

        }
        // Display the linked list
        void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
        // Calculate the size of the linked list
int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
}
    }
    public static void main(String[] args) {
        Link ll=new Link();
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        ll.insertAtEnd(88);

        ll.insertAtEnd(28);
        ll.insertAtEnd(48);


        ll.insertAtBeg(2);
        ll.insertAt(6,78);
        ll.insertAt(2, 98);// last index implment but tail is second last.
        ll.display();
        System.out.println(" ");
        System.out.println(ll.tail.data);
        ;// Print the tail node's data

    }
}
