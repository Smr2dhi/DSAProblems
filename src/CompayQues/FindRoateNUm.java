package CompayQues;

public class FindRoateNUm {
    static int search(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }else if(nums[mid]>nums[mid+1]){
                return mid;
            }
        }
        return -1;}
    public static void main(String[] args) {
        int []nums={6,7,0,1,2,4,5};
       int result= search(nums);
        System.out.println("the pivot number is"+result);
    }

}
