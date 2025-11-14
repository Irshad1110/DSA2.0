package sorting.countSort;

import java.util.ArrayList;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int p) {
        int max = 10000, min = -10000;
        int[] freq = new int[max-min+1];
        //filling the frequency array
        for(int val : nums) freq[val-min]++;

        ArrayList<Integer>[] buckets = new ArrayList[nums.length+1];

        for(int i = 0;i<buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }
        //filling the buckets
        for(int idx = 0; idx < freq.length;idx++){
            int count = freq[idx];
            buckets[count].add(idx+min);
        }

        int[] res = new int[p];
        int k=0;
        for(int i=buckets.length-1;i>=0;i--){
            for(int j = buckets[i].size()-1;j>=0;j--){
                res[k++] = buckets[i].get(j);
                if(k==p) return res;
            }
        }
        return res;
    }
}
