package NewLearning;
import java.util.Arrays;

public class bianrySearch {

    static int BinarySearching(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Move mid calculation inside the loop

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {67, 8, 9, 3, 2, 5, 32, 52, 90};
        int target = 52;

        // Sort the array before performing binary search
        Arrays.sort(arr);

        int ans = BinarySearching(arr, target);
        System.out.println("Index of target: " + ans);

        // For debugging: print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}