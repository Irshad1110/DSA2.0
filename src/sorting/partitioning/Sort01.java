package sorting.partitioning;

public class Sort01 {

    public void binSort(int[] arr) {
        int left = 0;
        int right = 0;
        while(right<arr.length){
            if(arr[right]==0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }right++;
        }

    }
}
