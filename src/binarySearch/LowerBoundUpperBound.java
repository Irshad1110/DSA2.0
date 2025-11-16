package binarySearch;

public class LowerBoundUpperBound {

    //same as first occurrence
    //lower bound is first occurrence if target is found and if not found then ceil value
    //code is effectively same as first occurrence
    public int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] >= target) right = mid-1;
            else left = mid + 1;
        }
        return left;
    }

    //same as ceil
    public int upperBound(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] <= target) left = mid+1;
            else {
                right = mid-1;
            }

        }
        return left; // right + 1;
    }
}
