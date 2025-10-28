package recursion;

public class SortedArray {

    public boolean isSorted(int[] arr) {
        // code here
        return isSorted(arr, arr.length-1);
    }

    public boolean isSorted(int[] arr, int n) {
        if(n==0){
            return true;
        }
        return (arr[n] >= arr[n-1]) && isSorted(arr, n-1);
    }
}

