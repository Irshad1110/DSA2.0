package binarySearch;

public class BinarySearch {

    //can be applied on sorted arrays (will study more later about other uses)
    public int search(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2; // to avoid overflow
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) {
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }return -1;
    }
}
