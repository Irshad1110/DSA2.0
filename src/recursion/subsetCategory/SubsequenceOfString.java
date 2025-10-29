package recursion.subsetCategory;

import java.util.ArrayList;

public class SubsequenceOfString {

    //Get and Print methods

    //Get recursion method
    //for get recursion methods least work happens at base case.
    public static ArrayList<String> subsequence(String str) {
        return subsequence(str, str.length()-1);
    }

    public static ArrayList<String> subsequence(String str, int n) {
        if(n==-1){
            ArrayList<String> smallAns = new ArrayList<>();
            smallAns.add("");
            return smallAns;
        }
        ArrayList<String> smallAns = subsequence(str, n-1);
        ArrayList<String> ans = new ArrayList<>();

        //no case
        for(String s : smallAns) {
            ans.add(s);
        }

        //yes case
        for(String s : smallAns) {
            s = s + str.charAt(n);
            ans.add(s);
        }

        return ans;

    }


    //Print recursion method
    //in print recursion methods, most work happens at base case
    //answer basically forms when we reach base case
    //as we go on forming the answer and it completes at base case for all choices
    public static void printSubsequence(String str) {
        printSubsequence(str, str.length()-1, "");
    }

    public static void printSubsequence(String str, int n, String asf) {
        if(n==-1){
            System.out.println(asf);
            return;
        }
        printSubsequence(str, n-1, asf);
        printSubsequence(str, n-1, str.charAt(n) + asf);

    }
}
