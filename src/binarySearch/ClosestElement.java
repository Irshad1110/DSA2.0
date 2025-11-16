package binarySearch;

public class ClosestElement {

    //the closest element would either be floor or ceil value or exact match
    //lower bound means exact match or ceil
    //lower bound - 1 index would be floor
    public static int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] >= target) right = mid-1;
            else left = mid + 1;
        }
        return left;
    }

    public static int findClosest(int[] arr, int k) {
        int lb = lowerBound(arr, k);
        if(lb == 0) return arr[lb];//floor does not exist
        if(lb == arr.length) return arr[lb-1]; // ceil does not exist
        if(arr[lb]-k <= k - arr[lb-1]) return arr[lb];
        return arr[lb-1];
    }
}
