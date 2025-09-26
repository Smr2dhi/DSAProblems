package Stack;
public class ArrayImpOfStack {
    public static class Stack{
        int []arr=new int[10];
        int idx=0;
       public void push(int x){
            if(idx>=arr.length){
                System.out.println("Stack is empty ");
                return;
            }arr[idx]=x;
            idx++;


        }public int pop(){
            if(idx<=0){
                System.out.println(" Stack is empty");
                return -1;
            } int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;

        }public void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
        }int size(){
            System.out.println(idx);
            return idx;

        }
        int peek(){
           if(idx<=0){
               System.out.println("Stack is empty");
               return -1;
           }
          return arr[idx-1];
        }
boolean IsEmpty(){
           if(idx<0){
               return true;
           }return false;
}

    }

    public static void main(String[]args){
    Stack st =new Stack();
    st.push(11);
    st.push(22);
    st.push(32);
    st.push(42);
    st.display();
        System.out.println(" ");
    System.out.println(st.size());
    st.pop();
    st.pop();
        st.pop();
        st.pop();
    st.display();
        System.out.println(" ");
        System.out.println( st.peek());
        System.out.println(st.IsEmpty());
    }
}
//package Stack;
//
//public class ArrayImpOfStack {
//
//    public static class Stack {
//        private int[] arr;
//        private int top;
//
//        // Constructor
//        public Stack(int capacity) {
//            arr = new int[capacity];
//            top = 0;
//        }
//
//        // Push operation
//        public void push(int x) {
//            if (top >= arr.length) {
//                System.out.println("Stack overflow");
//                return;
//            }
//            arr[top++] = x;
//        }
//
//        // Pop operation
//        public int pop() {
//            if (isEmpty()) {
//                System.out.println("Stack underflow");
//                return -1;
//            }
//            return arr[--top];
//        }
//
//        // Peek operation
//        public int peek() {
//            if (isEmpty()) {
//                System.out.println("Stack is empty");
//                return -1;
//            }
//            return arr[top - 1];
//        }
//
//        // Size of stack
//        public int size() {
//            return top;
//        }
//
//        // Check if empty
//        public boolean isEmpty() {
//            return top == 0;
//        }
//
//        // Display elements
//        public void display() {
//            if (isEmpty()) {
//                System.out.println("Stack is empty");
//                return;
//            }
//            System.out.print("Stack elements: ");
//            for (int i = 0; i < top; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    // Main method to test
//    public static void main(String[] args) {
//        Stack st = new Stack(10);
//
//        st.push(11);
//        st.push(22);
//        st.push(32);
//        st.push(42);
//
//        st.display();                     // Stack elements: 11 22 32 42
//        System.out.println("Size: " + st.size());   // Size: 4
//
//        st.pop(); // removes 42
//        st.pop(); // removes 32
//        st.pop(); // removes 22
//        st.pop(); // removes 11
//
//        st.display();                     // Stack is empty
//        System.out.println("Peek: " + st.peek());   // Stack is empty
//        System.out.println("IsEmpty: " + st.isEmpty()); // true
//    }
//}