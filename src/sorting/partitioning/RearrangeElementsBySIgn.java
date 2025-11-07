package sorting.partitioning;

public class RearrangeElementsBySIgn {
   //LC 2149

    public void reverse(int[] nums, int l , int r){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;r--;
        }
    }
    public void merge(int[] nums, int l, int mid, int r){
        int i=l;
        int j=mid+1;
        int p1=mid;
        int p2=mid+1;
        while(p1>=l && nums[p1] < 0){
            p1--;
        }
        while(p2<=r && nums[p2] >=0) {
            p2++;
        }
        reverse(nums, p1+1, mid);
        reverse(nums, mid+1, p2-1);
        reverse(nums, p1+1, p2-1);

    }

    public void segregateUsingMergeSort(int[] nums, int l, int r){
        if(l==r){
            return;
        }
        int mid = (l+r)/2;
        segregateUsingMergeSort(nums, l, mid);
        segregateUsingMergeSort(nums, mid+1, r);
        merge(nums, l, mid, r);
    }

    public int[] rearrangeArray(int[] nums) {
        segregateUsingMergeSort(nums, 0, nums.length-1);
        int[] ans = new int[nums.length];
        int pos = 0, neg = 0;
        while(neg<nums.length && nums[neg] >=0){
            neg++;
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i] = nums[pos++];
            }else{
                ans[i] = nums[neg++];
            }
        }
        return ans;
    }
}
