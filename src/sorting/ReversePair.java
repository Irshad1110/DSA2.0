package sorting;

public class ReversePair {
    //LC 493

    public int merge(int[] arr, int l, int mid, int r){
        int i = l;
        int j = mid+1;
        int[] ans = new int[r-l+1];
        int k=0;
        int count = 0;
        while(i<=mid && j<=r){
            // we use L here as while multiplying by 2, it will overflow from int value, so we compare with long value
            if(arr[i] > 2L *arr[j]){
                count+=(mid-i+1);
                j++;
            }else{
                i++;
            }
        }
        i = l;
        j = mid+1;
        while(i<=mid && j<=r){
            if(arr[i] <= arr[j]){
                ans[k++] = arr[i++];
            }else{
                ans[k++] = arr[j++];
            }
        }
        while(i<=mid){
            ans[k++] = arr[i++];
        }
        while(j<=r){
            ans[k++] = arr[j++];
        }
        for(int p=0;p<ans.length;p++){
            arr[l++] = ans[p];
        }
        return count;
    }

    public int mergeSort(int[] nums, int l, int r){
        if(l==r) {
            return 0;
        }
        int mid = (l+r)/2;
        int left = mergeSort(nums, l, mid);
        int right = mergeSort(nums, mid+1 ,r);
        int merge = merge(nums, l, mid, r);
        return left+right+merge;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
}
