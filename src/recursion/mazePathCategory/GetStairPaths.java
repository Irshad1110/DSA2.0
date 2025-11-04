package recursion.mazePathCategory;

import java.util.ArrayList;

public class GetStairPaths {

    //1. You are given a number n representing number of stairs in a staircase.
    //2. You are standing at the bottom of staircase. You are allowed to climb
    //1 step, 2 steps or 3 steps in one move.
    //3. Complete the body of printStairPaths function - without changing signature -
    // to print the list of all paths that can be used to climb the staircase up.
    //Use sample input and output to take idea about output.

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        ArrayList<String> smallAns;
        ArrayList<String> ans = new ArrayList<>();
        if (n > 0) {
            smallAns = getStairPaths(n - 1);
            for (String str : smallAns) {
                ans.add(str + '1');
            }
        }
        if (n > 1) {
            smallAns = getStairPaths(n - 2);
            for (String str : smallAns) {
                ans.add(str + '2');
            }
        }
        if (n > 2) {
            smallAns = getStairPaths(n - 3);
            for (String str : smallAns) {
                ans.add(str + '3');
            }
        }
        return ans;
    }


    //This is how I did it
//    public static ArrayList<String> getStairPaths(int n){
//        if(n==0){
//            ArrayList<String> ans = new ArrayList<>();
//            ans.add("");
//            return ans;
//        }
//        ArrayList<String> smallAns = new ArrayList<>();
//        smallAns = getStairPaths(n-1);
//        ArrayList<String> ans = new ArrayList<>();
//        for(String str : smallAns) {
//            ans.add(str+'1');
//        }
//        for(String str : smallAns) {
//            if(!str.isEmpty()) {
//                int i = str.charAt(str.length()-1) - '0';
//                if(i+1<=3){
//                    StringBuilder sb = new StringBuilder(str);
//                    sb.deleteCharAt(str.length()-1);
//                    sb.append(i+1);
//                    ans.add(sb.toString());
//                }
//            }
//        }
//        return ans;
//    }
}
