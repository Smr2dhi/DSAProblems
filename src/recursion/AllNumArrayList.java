package recursion;
import java.util.ArrayList;
import java.util.Arrays;

public class AllNumArrayList
{
    private static ArrayList<Integer>findAllIndexhelper(int[]arr,int target,int index,ArrayList<Integer>indices){
    if(index>=arr.length){
        return indices;
    }if (arr[index]==target){
        indices.add(index);

    }return findAllIndexhelper(arr,target,index+1,indices);
}
  public  static ArrayList<Integer> findAllIndex(int[]arr, int target){
        return findAllIndexhelper(arr,target,0,new ArrayList<>());
    }
    public static void main(String[] args) {
        int[]arr={2,4,4,6,7,7,8};
        int target=4;
        ArrayList<Integer>indices=findAllIndex(arr,target);
        System.out.println (indices);
    }
}
