package sorting.countSort;

public class MaximumGap {

    //Leetcode 164
    public int[] countSortOnDigit(int[] nums, int place) {

        //first we build frequency array like always
        //max=0, min=0; so no need to take min as its 0
        int[] freq = new int[10];
        for(int val : nums){
            int digit = (val/place)%10;
            freq[digit]++;
        }

        //then we convert frequency array to suffix sum array
        for(int i=freq.length-2;i>=0;i--){
            freq[i]+= freq[i+1];
        }

        int[] res = new int[nums.length];
        //then we create resultant from suffix array
        for(int val : nums){
            int digit = (val/place)%10;
            int idx = nums.length - freq[digit];
            freq[digit]--;
            res[idx] = val;
        }
        return res;
    }

    public int maximumGap(int[] nums) {
        int i = 1;
        while(i<=1000000000){
            nums = countSortOnDigit(nums, i);
            i*=10;
        }
        int max = 0;
        for(int p=0;p<nums.length-1;p++){
            int gap = nums[p+1] - nums[p];
            if(gap>max) max = gap;
        }
        return max;

    }
}
