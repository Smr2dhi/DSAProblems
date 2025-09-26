package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CopyStacks {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);

        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
//        System.out.println("Enter the no of element");
//        int n=sc.nextInt();
//        for(int i=0;i<=n;i++){
//            int x=sc.nextInt();
//          st.push(x);
//
//        }System.out.println(st);
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println(gt);
        Stack<Integer>rt=new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println("Reverde stack:");
        System.out.println(rt);

    }
}
