package recursion;

public class AllIndices {

    public static int[] allIndices(int[] arr, int x) {
        return allIndices(arr, x, 0, 0);
    }
    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if(idx == arr.length) {
            return new int[fsf];
        }

        if(arr[idx] == x) {
            int[] ans = allIndices(arr, x, idx+1, fsf+1);
            ans[fsf] = idx;
            return ans;
        }else {
            int[] ans = allIndices(arr, x, idx+1, fsf);
            return ans;
        }
    }
}
