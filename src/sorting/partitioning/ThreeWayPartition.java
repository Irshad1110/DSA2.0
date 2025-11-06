package sorting.partitioning;

public class ThreeWayPartition {

    public void threeWayPartition(int arr[], int a, int b) {
        int left=0,right=arr.length-1, mid=0;
        while(mid<=right){
            if(arr[mid]<a){
                swap(arr, mid, left);
                mid++;left++;
            }else if(arr[mid]>b){
                swap(arr, mid, right);
                right--;
            }else{
                mid++;
            }
        }

    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
