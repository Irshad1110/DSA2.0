package sorting.countSort;

import java.util.ArrayList;

public class FrequencySort {

    public int[] frequencySort(int[] nums) {
        int max = 100, min = -100;
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

        int[] res = new int[nums.length];
        int k=0;
        for(int i=1;i<buckets.length;i++){
            for(int j = buckets[i].size()-1;j>=0;j--){
                for(int p=1;p<=i;p++) {
                    res[k++] = buckets[i].get(j);
                }

            }
        }
        return res;

    }
}
