package recursion.subsetCategory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniquerSubset {

    //trick is that along with concept of print subsets, we also need to use the trick
    //that if last call was no and this elem is same as last elem of array then we should not call
    //yes call

    List<List<Integer>> ans;

    public List<List<Integer>> subsetsWithDup(int[] arr) {
        ans = new ArrayList<>();
        Arrays.sort(arr);
        subsetsWithDup(arr, arr.length-1, new ArrayList<>(), false);
        return ans;
    }

    public void subsetsWithDup(int[] arr, int n, List<Integer> curr, boolean prev) {
        if(n==-1){
            ans.add(new ArrayList<>(curr));
            return;
        }

        //no call
        subsetsWithDup(arr, n-1, curr, false);
        //yes call (if last call was no call and this elem is same as last elem, do not
        // make yes call and return from here itself)
        if(n<arr.length-1&&arr[n]==arr[n+1] && !prev) {
            return;
        }
        curr.add(arr[n]);
        subsetsWithDup(arr, n-1, curr, true);
        //backtracking
        curr.remove(curr.size()-1);

    }
}
