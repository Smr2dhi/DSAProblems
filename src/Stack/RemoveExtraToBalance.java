package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveExtraToBalance {
    public static void isRemBalance(String str,Stack<Character>st){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else if(ch==')'&& !st.isEmpty() && st.peek()=='('){
                st.pop();

                }else if(ch==')')count++;
            }
        count+=st.size();
        if(count>0){
            System.out.println("Unbalanced "+" "+count);
        }else System.out.println("balanced");


    }

    public static void main(String[] args) {
        Stack<Character>st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Char");
        String str=sc.nextLine();
        isRemBalance(str,st);
    }
}
