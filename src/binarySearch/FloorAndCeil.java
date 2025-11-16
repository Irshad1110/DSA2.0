package binarySearch;

public class FloorAndCeil {

    public static int[] getFloorAndCeil(int[] arr, int n, int x) {
        // Write your code here.
        int left = 0, right = n-1;
        int ans[] = new int[2];
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] >= x) right = mid-1;
            else {
                left = mid+1;
            }
        }
        ans[0] = arr[left-1];//or right
        left = 0;
        right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] <= x) left = mid+1;
            else {
                right = mid-1;
            }

        }
        ans[1] = arr[right+1];//or left
        return ans;
    }
}
