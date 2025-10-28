package recursion;

public class ReverseArray {

    public void reverseArray(int[] arr, int lo, int hi) {
        if(lo>=hi) return;

        reverseArray(arr, lo+1, hi-1);
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;

    }

    public void reverseArray(int arr[]) {
        reverseArray(arr, 0,  arr.length-1);

    }
}
