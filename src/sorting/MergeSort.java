package sorting;

public class MergeSort {

    public int[] merge(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n+m];
        int i=0, j=0, k=0;
        while(i<n && j<m){
            if(arr1[i] <= arr2[j]){
                ans[k++] = arr1[i++];
            }else {
                ans[k++] = arr2[j++];
            }
        }
        while(i<n){
            ans[k++] = arr1[i++];
        }
        while(j<m){
            ans[k++] = arr2[j++];
        }
        return ans;
    }
    public int[] mergeSort(int arr[], int l, int r) {
        if(l==r){
            return new int[]{arr[l]};
        }
        int mid = (l+r)/2;
        int[] arr1 = mergeSort(arr, l, mid);
        int[] arr2 = mergeSort(arr, mid+1, r);
        return merge(arr1, arr2);

    }
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
}
