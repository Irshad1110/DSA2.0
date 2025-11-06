package sorting.partitioning;

public class MoveZerosToEnd {

    public void moveZeroes(int[] arr) {
        int left=0, right=0;
        while(right<arr.length){
            if(arr[right]!=0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }right++;
        }
    }
}
