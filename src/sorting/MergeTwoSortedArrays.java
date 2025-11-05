package sorting;

public class MergeTwoSortedArrays {

    //stable algorithm using extra space
    public static int[] mergeArrays(int a[], int b[]) {
        // code here
        int n1 = a.length;
        int n2 = b.length;
        int[] ans = new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(a[i] <= b[j]){
                ans[k++] = a[i++];
            }else{
                ans[k++] = b[j++];
            }
        }
        while(i<n1){
            ans[k++] = a[i++];
        }
        while(j<n2){
            ans[k++] = b[j++];
        }
        return ans;
    }

    //without extra space, first array has size n+m but only m elements are filled, others are 0 ,
    //so we have used this to our advantage and filled from back
    public void mergeWithoutExtraSpace(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1, j =n-1, k = nums1.length-1;
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        while(i>=0){
            nums1[k--] = nums1[i--];
        }
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
    }
}
