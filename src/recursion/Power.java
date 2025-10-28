package recursion;

public class Power {

    public double myPow(double x, int n) {
        if(n<0) {
            return myPowHelper(1/x, n*-1);
        }else{
            return myPowHelper(x, n);
        }


    }

    //we do n/2 because otherwise time complexity will be O(n) which is giving TLE
    //so we do n/2 and now the height of the recursion tree becomes logN and time complexity also is logN
    public double myPowHelper(double x, int n) {
        if(n==0) return 1;
        double smallAns = myPowHelper(x, n/2);
        if(n%2==0){
            return smallAns*smallAns;
        }else {
            return x*smallAns*smallAns;
        }
    }
}
