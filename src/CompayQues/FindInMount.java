package CompayQues;
//leetcode ques 1095.
public class FindInMount {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int ans = FindTarget(arr, target);
        System.out.println("The index of the element is");
        System.out.println(ans);
    }

    static int FindTarget(int[] arr, int target) {
        int peak = FindTargetPeak(arr);
        int result = BinaryElement(arr, target, 0, peak, true);
        if (result != -1) {
            return result;
        } else {
            return BinaryElement(arr, target, peak + 1, arr.length - 1, false);
        }
    }

    static int FindTargetPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int BinaryElement(int[] arr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
