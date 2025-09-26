package NewLearning;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int []arr={3,5,2,1,4};
CyclicSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void CyclicSorting(int[]arr){
int i=0;
while(i< arr.length){
    int corectIndex=arr[i]-1;
    if(arr[i]!=arr[corectIndex]){
swap(arr,i,corectIndex);
    }else{
        i++;
    }
}
    }
    static void swap(int[]arr,int i, int corectIndex){
        int temp=arr[i];
        arr[i]=arr[corectIndex];
       arr[corectIndex]=temp;
    }
}
