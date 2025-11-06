package sorting;

public class GlobalLocalCount {

    public static int merge(int[] arr, int l, int mid, int r){
        int i = l;
        int j = mid+1;
        int[] ans = new int[r-l+1];
        int k=0;
        int count = 0;
        while(i<=mid && j<=r){
            if(arr[i] <= arr[j]){
                ans[k++] = arr[i++];
            }else{
                ans[k++] = arr[j++];
                count = count+(mid-i+1);
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

    public static int mergeSort(int[] nums, int l, int r){
        if(l==r) {
            return 0;
        }
        int mid = (l+r)/2;
        int left = mergeSort(nums, l, mid);
        int right = mergeSort(nums, mid+1 ,r);
        int merge = merge(nums, l, mid, r);
        return left+right+merge;
    }

    public static int getLocal(int[] arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) count++;
        }
        return count;
    }

    public static boolean isIdealPermutation(int[] nums) {
        int localInversions = getLocal(nums);
        int globalInversions = mergeSort(nums, 0, nums.length-1);
        return globalInversions == localInversions;
    }
}
