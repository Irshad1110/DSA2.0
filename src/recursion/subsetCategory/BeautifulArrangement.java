package recursion.subsetCategory;

import java.util.ArrayList;

public class BeautifulArrangement {

    //We are creating all possible permutations of the numbers
    //and then checking for each of those if they follow that condition
    //We use pruning also to check that current element should follow that rule before adding it

    int ans;

//    public int countArrangement(int n) {
//        ans = 0;
//        countArrangement(n, new ArrayList<>(), new boolean[n+1]);
//        return ans;
//    }
//
//    public void countArrangement(int n, ArrayList<Integer> asf, boolean[] visited) {
//        if(asf.size() == n){
//            //if we reach here then that means its a beautiful arrangement only
//            ans++;
//            return;
//        }
//
//        for(int i=1;i<=n;i++){
//            //the second condition in this if is Pruning and checking the condition
//            if(!visited[i] && (i%(asf.size()+1) == 0 || (asf.size() +1)%i == 0)) {
//                asf.add(i);
//                visited[i] = true;
//                countArrangement(n,asf, visited);
//                //backtracking
//                asf.remove(asf.size()-1);
//                visited[i] = false;
//
//            }
//        }
//    }

    //better space solution
    public int countArrangement(int n) {
        ans = 0;
        countArrangement(n, 1, new boolean[n+1]);
        return ans;
    }

    public void countArrangement(int n, int idx, boolean[] visited) {
        if(idx == n+1){
            ans++;
            return;
        }

        for(int i=1;i<=n;i++){
            if(!visited[i] && (i%idx == 0 || idx%i == 0)) {
                visited[i] = true;
                countArrangement(n,idx+1, visited);
                visited[i] = false;

            }
        }
    }

}
