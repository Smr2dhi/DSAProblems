package Samriddhi;

public class AddMatrix {
    public static void main (String[]args) {
        int A[][] = {{2, 5}, {1, 2}};
        int B[][] = {{4, 2}, {6, 1}};
        int rows = A.length;
        int cols = A[0].length;
        int sum[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j]=A[i][j]+B[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
