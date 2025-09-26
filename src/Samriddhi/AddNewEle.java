package Samriddhi;

import java.util.Arrays;

public class AddNewEle {
public static int[] addx (int arr[],int x ,int n){
    int arr2[]=new int [x+1];
    for(int i=0;i<5;i++){
        arr2[i]=arr[i];
        arr2[x]= n;

    } return arr2;
}


       public static void main (String[]args){
           int arr[]={4,5,2,8,6};
           int x=5;
           int n=78;
           addx(arr,x,n);
           System.out.println(Arrays.toString(addx(arr,x,n)));
       }


}
