package MyLinkedList.java;

public class DoublyLinkedList {
    public static class  Node{
        int data;
        Node next;
        Node prev;
        Node(int  data){
            this.data=data;
        }
    }
    public static void displayReverse(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.prev;
        }
    }
    public static void DisplayRandom(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
    }public static Node InsertAtBeg(Node head){
        Node temp=new Node(78);
         temp.next=head;
         head.prev=temp;
         head=temp;
         return head;
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void insertAtIndx(Node head,int idx,int x){
        Node temp=head;
        for(int i=0;i<=idx;i++){
            temp=temp.next;
        }Node t=new Node(x);
        temp.next.prev=t;
        t.prev=temp;
        t.next=temp.next;
        temp.next=t;

    }
    public static void insertAtIndex2(Node head,int idx,int y){
        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        } Node s=temp;
        Node r=s.next;

        Node t=new Node(y);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;

    }
    public static void InsertAtTail(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=new Node(780);
        temp.next=t;
        t.prev=temp;

    }
    public static void main(String[]args){
        Node a=new Node(3);
        Node b=new Node (8);
        Node c=new Node (5);
        Node d=new Node (31);
        Node e=new Node (6);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display(a);
        System.out.println(" ");
        displayReverse(e);
        System.out.println(" ");
        DisplayRandom(c);
        System.out.println(" ");// to print starting to ending given random node.
     Node newHead=  InsertAtBeg(a);
        display(newHead);
        System.out.println(" ");
     InsertAtTail(a);
         display(a);
        System.out.println(" ");
         insertAtIndx(a,3,76);
         display(a);
        System.out.println(" ");
         insertAtIndex2(a,3,98);
         display(a);



    }
}
/*package MyLinkedList.java;

public class DoublyLinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayReverse(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void DisplayRandom(Node random) {
        Node temp = random;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node InsertAtBeg(Node head) {
        Node newNode = new Node(78);
        if (head == null) {
            return newNode; // Handle empty list case
        }
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void insertAtIndx(Node head, int idx, int x) {
        Node temp = head;
        for (int i = 0; i < idx && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        Node newNode = new Node(x);
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public static void InsertAtTail(Node head) {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(780);
        temp.next = newNode;
        newNode.prev = temp;
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(8);
        Node c = new Node(5);
        Node d = new Node(31);
        Node e = new Node(6);
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

        display(a); // Display the list
        insertAtIndx(a, 3, 76); // Insert 76 at index 3
        display(a); // Display the list again to verify insertion
    }
}
*/