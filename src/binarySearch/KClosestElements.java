package binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KClosestElements {

    public int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] >= target) right = mid-1;
            else left = mid + 1;
        }
        return left;
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lb = lowerBound(arr, x);
        List<Integer> ans = new ArrayList<>();
        int i = lb-1, j = lb, p = 0;
        while(i>=0 && j <arr.length && p < k) {
            if(x - arr[i] <= arr[j] - x) {
                ans.add(arr[i--]);
                p++;
            }else{
                ans.add(arr[j++]);
                p++;
            }
        }
        while(i>=0 && p < k){
            ans.add(arr[i--]);
            p++;
        }
        while(j <arr.length && p < k){
            ans.add(arr[j++]);
            p++;
        }
        Collections.sort(ans);
        return ans;
    }
}
