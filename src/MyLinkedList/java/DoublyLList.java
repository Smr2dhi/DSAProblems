package MyLinkedList.java;

public class DoublyLList {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
}
  public static Node deletionAtHead(Node head){
        head=head.next;
        head.prev=null;
        return head;

  }
  public static boolean palindrome(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }Node tail=temp;
        Node h=head;
        Node t=tail;
        while(h!=t){
            if(h.data!=t.data){
              return false;
            }h=h.next;
            t=t.prev;
        }
      return true;
  }
  public static void TwoSum(Node head,int target){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }Node tail=temp;
        Node h=head;
        Node t=tail;
        while(h.data<t.data){
            if((h.data+t.data)==target){
                System.out.println("Value is "+h.data+"and"+t.data);
                break;
            }if(h.data+t.data> target){
                t=t.prev;

            }else{
              h=  h.next;
            }


        }
  }
        public static void main (String[]args){
            Node a = new Node(3);
            Node b = new Node(5);
            Node c = new Node(8);
            Node d = new Node(13);
            Node e = new Node(100);
            a.prev = null;
            a.next = b;
            b.prev = a;
            b.next = c;
            c.prev = b;
            c.next = d;
            d.prev = c;
            d.next = e;
            e.prev = d;
            e.next = null;
            display(a);
            System.out.println(" ");
//            a=deletionAtHead(a);
//            display(a);
             boolean g=palindrome(a);
            System.out.println(g);
            TwoSum(a,16);
        }

}
