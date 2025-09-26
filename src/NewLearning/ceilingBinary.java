package NewLearning;

public class ceilingBinary {
    public static int floorSearch(int []arr,int target){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
else {
    start =mid+1;
            }
        }
        return end;
    }
    public static int CeilingSearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start +(end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[]arr={2,5,7,8,45,67,89};
        int target=65;
        System.out.println("Value of ceiling is:");
        int ans=CeilingSearch(arr,target);
        System.out.println(ans);
        System.out.println("Value of floor is:");
        int value=floorSearch(arr,target);
        System.out.println(value);
    }
}
