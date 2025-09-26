package Stack;
import java.util.Stack;

public class InsertAtAnyIndex {
    public static void main(String []args){
        Stack<Integer> st = new Stack<>();
        st.push(98);
        st.push(23);
        st.push(123);
        st.push(456);
        st.push(789);
        st.push(87);
        System.out.println(st);
        Stack<Integer>gt = new Stack<> ();
        while(st.size()>0){
            gt.push(st.pop());

        }gt.push(56);  //At at last index or bottom.
        System.out.println(gt);
        Stack <Integer> mt=new Stack<>();
        while(gt.size()>0){
            mt.push(gt.pop());
        }
        System.out.println(mt);
    }
}
// at any index....
// package Stack;
//import java.util.Stack;
//
//public class InsertAtAnyIndex {
//    public static void main(String []args){
//        Stack<Integer> st = new Stack<>();
//        st.push(98);  // bottom
//        st.push(23);
//        st.push(123);
//        st.push(456);
//        st.push(789);
//        st.push(87);  // top
//
//        System.out.println("Original Stack: " + st);
//
//        int insertAtIndexFromTop = 2; // 0 = top, 2 means insert below 2 elements
//        int newValue = 56;
//
//        Stack<Integer> temp = new Stack<>();
//
//        // Remove top 'k' elements
//        for(int i = 0; i < insertAtIndexFromTop; i++) {
//            temp.push(st.pop());
//        }
//
//        // Insert the new value
//        st.push(newValue);
//
//        // Push back the removed elements
//        while(!temp.isEmpty()) {
//            st.push(temp.pop());
//        }
//
//        System.out.println("After inserting " + newValue + " at index " + insertAtIndexFromTop + " from top:");
//        System.out.println(st);
//    }
//}