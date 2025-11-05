package sorting;

public class MergeTwoSortedUsingShellSort {

    public static void mergeUsingShellSort(int[] nums1, int m, int[] nums2, int n) {
        int x=m;
        for(int j=0;j<n;j++){
            nums1[x++] = nums2[j];
        }
        double gap = (double) (n + m) / 2;
        while(gap>=1){
            int ceil = (int)Math.ceil(gap);
            gap = ceil;
            int i=0;
            int j=i+ceil;
            while(j<nums1.length){
                if(nums1[i] > nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
                i++;j++;
            }
            gap = gap/2.0;
        }
        }
}
