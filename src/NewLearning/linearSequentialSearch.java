package NewLearning;
import java.util.*;
public class linearSequentialSearch {
    public static int linearSearch(int[]arr,int target){
        if(arr.length==0)
            return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
  return -1;
    }
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elments");
      int arr[] ={56,34,89,98,29,67};
      int target=23;
      int ans=linearSearch(arr,target);
      if(ans==-1){
          System.out.println("Element not found");}
          else{
              System.out.println("found at index " + " " +ans);
          }
      }



    }

