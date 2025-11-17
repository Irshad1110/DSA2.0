package binarySearch;

public class SquareRoot {

    //Leetcode 69
    public int mySqrt(int x) {
        int left = 0, right = x;
        while(left<=right){
            int mid = left + (right-left)/2;
            if((1l * mid * mid) == x) return mid; // so it does not overflow in int so we make it long
            else if((1l * mid * mid) < x) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }return right;
    }
}
