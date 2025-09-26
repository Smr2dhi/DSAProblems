package Stack;

import java.util.Stack;

public class DisplayStack {
    public static void displayRev(Stack<Integer>st){
        if(st.size()==0) return;
        int top=st.pop();
        System.out.print(top+" ");
        displayRev(st);
        st.push(top);

    }public static void pushAtBottom(int x,Stack<Integer>st) {
        if(st.size()==0){
            st.push(x);
        return;}
        int top=st.pop();
        pushAtBottom(x,st);
        st.push(top);

    }
    public static void ReverseStackRecursively(Stack<Integer>st){
        if(st.size()==1)return;
        int top=st.pop();
        ReverseStackRecursively(st);
        pushAtBottom(top,st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int n=st.size();
        int[]arr=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }for(int i=0;i<n;i++){
            int x=st.push(arr[i]);
        }
        System.out.println(st);
        displayRev(st);
        ReverseStackRecursively(st);

    }
}
