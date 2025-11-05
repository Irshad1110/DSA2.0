package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection2 {

    //hashmap question, but not studied yet so doing by sorting first
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0, j=0, k=0;
        List<Integer> al = new ArrayList<>();
        while(i<nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]) {
                i++;
            }else if(nums1[i] > nums2[j]) {
                j++;
            }
            else{
                al.add(nums1[i]);
                i++;j++;
            }
        }
        int[] ans = new int[al.size()];
        for(int val : al){
            ans[k++] = val;
        }
        return ans;
    }
}
