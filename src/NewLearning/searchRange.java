package NewLearning;
// to search element within the range.
public class searchRange {
    public static boolean RangeSearch(int []arr,int target,int start,int end){
        if(arr.length==0)
            return false;
        for (int num:arr
             ) {
            if(num==target)
                return true;

        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr={56,89,98,65,43,23};
        int target=98;
        System.out.println(RangeSearch(arr,target,1,3));
    }
}
