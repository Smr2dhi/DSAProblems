package Stack;

import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
       Stack<Integer> st =new Stack<>();
       st.push(98);
       st.push(679);
       st.push(23);
       st.push(901);
        System.out.println("Size of Stack is :"+st.size());
        st.push(45);
        st.pop();
        System.out.println("Size of Stack is :"+st.size());
        st.peek();
        st.push(654);
        st.push(34);
        st.empty();
        System.out.println(st.isEmpty());
        while(st.size()>3){
            st.pop();
        }
        System.out.println(st.peek());
    }
}
