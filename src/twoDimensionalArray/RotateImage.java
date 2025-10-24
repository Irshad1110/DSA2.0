package twoDimensionalArray;

public class RotateImage {
    //Leetcode 48


    //take transpose of matrix first and then reverse each array
    public void rotate(int[][] arr) {
        int n = arr.length;

        //transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //To traverse only upper triangular half
                if (j >= i) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }

            }
        }

        //reverse each row
        for (int i = 0; i < n; i++) {
            int lo = 0;
            int hi = n - 1;
            while (lo < hi) {
                int temp = arr[i][lo];
                arr[i][lo] = arr[i][hi];
                arr[i][hi] = temp;
                lo++;
                hi--;
            }
        }

    }
}
