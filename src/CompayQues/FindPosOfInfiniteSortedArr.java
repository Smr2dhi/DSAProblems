package CompayQues;

public class FindPosOfInfiniteSortedArr {
    static int FindTarget(int[]arr,int target,int start,int end){
start=0;
end=arr.length-1;
while(start<=end){
    int mid=start+(end-start)/2;
    if(target>arr[mid]){
        start=mid+1;}
        if(target<arr[mid]){
            end=mid-1;
        }
        else if(target==arr[mid]){
            return mid;

        }


}
        return -1;
    }
    static int FindPosition(int[] arr,int target) {
        int start = 0;
        int end = 1;
        while (target > end) {
         int   newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start=newStart;
        }
        return FindTarget(arr, target, start, end);
    }

    public static void main(String[] args) {
int[]arr={3,7,8,9,34,56,67,89,98,123,234,345,566,678,765,876,986};
int target=678;
int ans=FindPosition(arr,target);
        System.out.println(ans);
    }
}
