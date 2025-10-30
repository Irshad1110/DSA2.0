package recursion.subsetCategory;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsetsLeetcode {

    List<List<Integer>> ans;

    public List<List<Integer>> subsets(int[] arr) {
        ans = new ArrayList<>();
        subsets(arr, arr.length-1, new ArrayList<>());
        return ans;
    }

    public void subsets(int[] arr, int n ,List<Integer> curr) {
        if(n==-1){
            //deep copy
            ans.add(new ArrayList<>(curr));
            return;
        }

        //no call
        subsets(arr, n-1, curr);

        curr.add(arr[n]);
        //yes call
        subsets(arr, n-1, curr);

        //backtracking
        curr.remove(curr.size()-1);

    }
}
