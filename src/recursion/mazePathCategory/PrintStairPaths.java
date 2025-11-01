package recursion.mazePathCategory;

public class PrintStairPaths {

    //1. You are given a number n representing number of stairs in a staircase.
    //2. You are standing at the bottom of staircase. You are allowed to climb
    //1 step, 2 steps or 3 steps in one move.
    //3. Complete the body of printStairPaths function - without changing signature -
    // to print the list of all paths that can be used to climb the staircase up.
    //Use sample input and output to take idea about output.

    public static void printStairPaths(int n) {
        printStairPaths(n, "");
    }

    private static void printStairPaths(int n, String asf) {
        if(n==0){
            System.out.println(asf);
            return;
        }
        //Pruning - meaning cutting the branches of a tree
        //This checking of n before making the call is actually saving us from negative base case
        //otherwise we would have to do if(n<0) return;
        //so those extra calls are saved, saving us some time.
        if(n>0) printStairPaths(n-1, asf+'1');
        if(n>1) printStairPaths(n-2, asf+'2');
        if(n>2) printStairPaths(n-3, asf+'3');

    }
}
