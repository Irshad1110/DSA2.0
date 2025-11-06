package sorting.partitioning;

public class Sort012 {


    public void sortColors(int[] nums) {
        int left=0;
        int mid=0;
        int right=nums.length-1;
        while(mid<=right){
            if(nums[mid]==0){
                swap(nums, left, mid);
                left++;mid++;
            }else if(nums[mid] == 2){
                swap(nums, mid, right);
                right--;
            }else{
                mid++;
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
