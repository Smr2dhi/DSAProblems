package NewLearning;

public class printmin {
    public static int minValue(int []arr){
        int ans=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<ans)
                ans=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr={3,6,9,-1,3,0,-34};
        System.out.println(minValue(arr));
    }
}
