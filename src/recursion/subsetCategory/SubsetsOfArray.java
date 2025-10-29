package recursion.subsetCategory;

import java.util.ArrayList;

public class SubsetsOfArray {

    //Iterative solution
    //represent number of subsets (i.e 2 ki power n) by binary numbers and
    // consider 1 as number being included and 0 as not included
    //As we know subsets basically means each element has two choices either
    //to be included in result subset or not
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        int n = arr.length;
        int num = (int)(Math.pow(2, n));
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<num;i++){
            ArrayList<Integer> smallAns = new ArrayList<>();
            int x = i;
            //starting from n to 0 because when converting to binary,
            //number is made in reverse order of remainders
            for(int j = n-1;j>=0;j--){
                int rem = x%2;
                x=x/2;
                if(rem == 1) {
                    smallAns.add(arr[j]);
                }
            }ans.add(smallAns);
        }return ans;
    }

    //recursive solution
    public static ArrayList<ArrayList<Integer>> subsetsRecursive(int arr[]) {
        return subsets(arr, arr.length-1);
    }

    public static ArrayList<ArrayList<Integer>> subsets(int arr[], int n) {
        if(n==-1) {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<Integer>());
            return ans;
        }
        ArrayList<ArrayList<Integer>> smallAns = subsets(arr, n-1);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(ArrayList<Integer> sub : smallAns) {
            // Add the subset as it is
            ans.add(new ArrayList<>(sub));

            // Create a new subset including arr[n]
            ArrayList<Integer> newSub = new ArrayList<>(sub);
            newSub.add(arr[n]);
            ans.add(newSub);
        }
        return ans;


    }
}
