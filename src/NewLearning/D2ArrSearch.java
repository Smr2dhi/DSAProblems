package NewLearning;

import java.util.ArrayList;
import java.util.Arrays;

public class D2ArrSearch {
    public static int[] twoDArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target)
                    return new int[]{row, col
                    };
            }

        } return new int[]{ -1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {3, 6, 7, 8},
                {4, 0, 9},
                {1, 2, 3, 4, 5, 67, 54},
        };
        int target = 54;
        int[] ans=twoDArray(arr,target);
        System.out.println(Arrays.toString(ans));

    }
}
