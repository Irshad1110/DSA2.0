package binarySearch;

public class GuessNumber {

    //leetcode 374
    public int guessNumber(int n) {
        int left = 1, right = n;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(guess(mid) == -1) right = mid-1;
            else if (guess(mid) == 1) left = mid+1;
            else return mid;
        }
        return -1;
    }

    //inbuilt leetcode method
    private int guess(int mid) {
        return -1;
    }
}
