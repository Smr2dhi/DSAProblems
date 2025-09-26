package Stack;

import java.util.Stack;

public class NextGreElem {
    public static int[] NextGreaterElement(int[]num){
        int n= num.length;
        int res[]=new int[n];
        Stack<Integer>st=new Stack<>();
        st.push(n-1);
        num[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            while( st.size()>0 && st.peek()<num[i]){
                st.pop();
            }if(st.size()==0){
                res[i]=-1;

            }else{res[i]=st.peek();
                st.push(num[i]);

            }

        }return res;

    }
    public static void main(String[] args) {
        int arr[]={1,5,3,2,1,6,3,4};
        int [] res=NextGreaterElement(arr);
        System.out.print(res+" ");

    }
}
