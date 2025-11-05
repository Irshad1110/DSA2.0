package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferenceTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> firstDiff = new ArrayList<>();
        List<Integer> secondDiff = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (i == 0 || nums1[i - 1] != nums1[i]) {
                    firstDiff.add(nums1[i]);
                }
                i++;
            } else if (nums1[i] > nums2[j]) {
                if (j == 0 || nums2[j - 1] != nums2[j]) {
                    secondDiff.add(nums2[j]);
                }
                j++;
            } else {
                i++;
                j++;
            }
        }

        while (i < nums1.length) {
            if (i == 0 || nums1[i - 1] != nums1[i]) {
                firstDiff.add(nums1[i]);
            }
            i++;
        }
        while (j < nums2.length) {
            if (j == 0 || nums2[j - 1] != nums2[j]) {
                secondDiff.add(nums2[j]);
            }
            j++;
        }
        ans.add(firstDiff);
        ans.add(secondDiff);
        return ans;
    }
}
