package sorting.countSort;

import java.util.List;

public class MinimumTime {

    public static int[] countSortOnDigit(int[] nums, int place) {

        //first we build frequency array like always
        //max=0, min=0; so no need to take min as its 0
        int[] freq = new int[60];
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

    public static int findMinDifference(List<String> times) {
        int[] nums = new int[times.size()];
        for (int i = 0; i < times.size(); i++) {
            int time = Integer.parseInt(times.get(i).replace(":", ""));
            nums[i] = getMinutes(time);
        }
        int i = 1;
        while(i<=1000){
            nums = countSortOnDigit(nums, i);
            i*=10;
        }
        int min = Integer.MAX_VALUE;
        for(int p=0;p<nums.length-1;p++){
            int gap = (nums[p+1]) - (nums[p]);
            if(gap<min) min = gap;
        }
        int midnightWrap = 1440 - nums[nums.length - 1] + nums[0];
        return Math.min(min, midnightWrap);
    }

    public static int getMinutes(int min){
        int minutes = min%100;
        int hours = min/100;
        return hours*60 + minutes;
    }
}
