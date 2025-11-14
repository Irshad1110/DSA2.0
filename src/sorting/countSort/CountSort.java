package sorting.countSort;

public class CountSort {

    //Non stable version of count sort
    //Time complexity is O(N + K) where k is the range of max and min value of the array
    //Space complexity is O(N+K), so not in place
    public static int[] sortArray(int[] nums) {
        int min = -2, max = 6;
        int[] freq = new int[max - min + 1];
        for(int val : nums) {
            freq[val - min]++;
        }

        int[] res = new int[nums.length];
        int k =0;
        for(int i = 0;i<freq.length;i++){
            int val = i+min;
            for(int idx=0;idx<freq[i];idx++){
                res[k++] = val;
            }
        }
        return res;
    }
}
