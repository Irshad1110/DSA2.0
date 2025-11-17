package binarySearch;

public class IsPerfectSquare {

    public boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while(left<=right){
            long mid = left + (right-left)/2;
            if(mid*mid == num) return true;
            else if(mid*mid < num) left = (int)mid+1;
            else right = (int)mid-1;
        }
        return false;
    }
}
