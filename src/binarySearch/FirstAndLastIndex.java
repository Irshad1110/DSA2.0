package binarySearch;

public class FirstAndLastIndex {

    //Leetcode 34
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int[] ans = new int[2];
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target) right = mid-1;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid-1;
        }
        ans[0] = left;
        left = 0;
        right = nums.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target) left = mid+1;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid-1;
        }
        ans[1] = right;
        //corner case, if elements are not present, if first index is greater than last index
        //then they are not present
        if(ans[0] > ans[1]){
            ans[0] = -1;
            ans[1] = -1;
        }
        return ans;
    }
}
