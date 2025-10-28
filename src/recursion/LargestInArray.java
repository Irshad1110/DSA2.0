package recursion;

public class LargestInArray {

    public static int largest(int[] arr) {
        return largest(arr, arr.length-1);

    }

    public static int largest(int[] arr, int n) {
        if(n==0){
            return arr[0];
        }

        return Math.max(arr[n], largest(arr, n-1));

    }
}
