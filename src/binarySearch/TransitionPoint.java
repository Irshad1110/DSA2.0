package binarySearch;

public class TransitionPoint {

    int transitionPoint(int arr[]) {

        int left = 0, right = arr.length-1;
        while(left<=right){
            int mid = (left + right)/2;
            if(arr[mid] == 0) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        if(left<arr.length) return left;
        return -1;
    }
}
