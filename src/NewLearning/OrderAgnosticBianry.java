package NewLearning;

public class OrderAgnosticBianry {
    public static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end]; // Determine if the array is ascending or descending

        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate mid in each iteration

            if (arr[mid] == target) {
                return mid; // Return the index if the target is found
            }

            if (isAsc) { // If the array is sorted in ascending order
                if (target < arr[mid]) {
                    end = mid - 1; // Move end to mid - 1
                } else {
                    start = mid + 1; // Move start to mid + 1
                }
            } else { // If the array is sorted in descending order
                if (target > arr[mid]) {
                    end = mid - 1; // Move end to mid - 1
                } else {
                    start = mid + 1; // Move start to mid + 1
                }
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 12, 34, 56, 78, 89}; // Example array (ascending order)
        int target = 90;
        int ans = BinarySearch(arr, target);
        System.out.println(ans); // Print the index of the target element
    }
}