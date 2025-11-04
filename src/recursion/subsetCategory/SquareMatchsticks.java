package recursion.subsetCategory;

import java.util.Arrays;

public class SquareMatchsticks {

    public boolean makesquare(int[] matchsticks) {
        if(matchsticks == null || matchsticks.length == 0) return false;
        int peri = 0;
        for(int elem : matchsticks){
            peri+=elem;
        }
        if(peri%4!=0) return false;
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        int[] sides = new int[4];
        return makesquare(matchsticks, 0, sides, peri/4);
    }

    public boolean makesquare(int[] matchsticks, int idx, int[] sides, int peri) {
        if(idx == matchsticks.length) return true;

        for(int i=0;i<4;i++){
            //pruning
            if(matchsticks[idx] + sides[i] <= peri) {
                sides[i]+= matchsticks[idx];
                boolean smallAns = makesquare(matchsticks, idx+1, sides, peri);
                if(smallAns) return true;
                //backtracking
                sides[i]-= matchsticks[idx];
            }
        }
        return false;
    }

    public void reverse(int[] arr) {
        int lo = 0;
        int hi = arr.length-1;
        while(lo<hi){
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }
}
