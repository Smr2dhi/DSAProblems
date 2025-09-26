package Stack;

import java.util.Stack;

public class RemoveConsecutive {
    public static int[] removeArr(int[]arr){
        int n= arr.length;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                st.push(arr[i]);
            } else if (st.peek()!=arr[i]) {
                st.push(arr[i]);
            }else{
                while(i+1<n && arr[i]==arr[i+1]){
                    i++;
                }
                st.pop();
            }
        }
        int[]res=new int[st.size()];
        int m=res.length;
        for(int i=m-1;i>=0;i--){
            res[i]=st.pop();
        }return res;

    }

    public static void main(String[] args) {
        int[]arr={ 2,2,3,10,10,10,4,4,4,5,7,7,8};
        int []result=removeArr(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
//public static int[] removeArr(int []arr){
//        int n=arr.length;
//        Stack<Integer>st=new Stack<>();
//        for (int i = 0; i < n; i++) {
//            if (st.isEmpty()) {
//                st.push(arr[i]);   // ✅ Push if empty
//            } else if (st.peek() != arr[i]) {
//                st.push(arr[i]);   // ✅ Push if not equal to top
//            } else {
//                // ✅ Handle all consecutive duplicates
//                while (i + 1 < n && arr[i] == arr[i + 1]) {
//                    i++;           // Skip all duplicates
//                }
//                st.pop();          // Pop the matching top element
//            }
//        }
//
//
//
//    int []res=new int[st.size()];
//        int m=res.length;
//        for(int i= m-1;i>=0;i--){
//            res[i]=st.pop();
//        }return res;