package sorting.countSort;

public class RadixSort {

    public int[] sortArray(int[] nums) {

        //first we build frequency array like always
        int max = 50000, min = -50000;
        int[] freq = new int[max-min+1];
        for(int val : nums){
            freq[val-min]++;
        }

        //then we convert frequency array to suffix sum array
        for(int i=freq.length-2;i>=0;i--){
            freq[i]+= freq[i+1];
        }

        int[] res = new int[nums.length];
        //then we create resultant from suffix array
        for(int val : nums){
            int idx = nums.length - freq[val-min];
            freq[val-min]--;
            res[idx] = val;
        }
        return res;
    }
}
