package sorting.partitioning;

public class ThreeWayRelativeOrder {

    public int[] pivotArray(int[] nums, int pivot) {
        int ans[] = new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) ans[k++] = nums[i];
        }

        int j = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>pivot) ans[j--] = nums[i];
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot) ans[k++] = nums[i];
        }
        return ans;

    }
}
