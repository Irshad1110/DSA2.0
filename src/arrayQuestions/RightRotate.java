package arrayQuestions;

public class RightRotate {

    public void reverse(int[] arr, int lo, int hi){
        while(lo<hi){
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;hi--;
        }
    }
    public void rotate(int[] nums, int k) {
        //1 2 3 4 5 6 7
        //7 6 5 4 3 2 1
        //5 6 7 1 2 3 4
        k = k% nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
}
