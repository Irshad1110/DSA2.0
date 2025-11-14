package sorting.countSort;

import java.util.ArrayList;

public class BucketsSort {

    //Now it becomes stable
    public int[] sortArray(int[] nums) {
        int min = -50000, max = 50000;
        ArrayList<Integer>[] buckets = new ArrayList[max - min + 1];
        for(int i=0;i<buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for(int val : nums) buckets[val - min].add(val);

        int[] res = new int[nums.length];
        int k=0;
        for(int idx = 0;idx<buckets.length;idx++){
            for(Integer val : buckets[idx]){
                res[k++] = val;
            }
        }
        return res;
    }
}
