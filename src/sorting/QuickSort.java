package sorting;

public class QuickSort {

    //This solution will give TLE for large test cases where array is almost sorted
    //and time complexity is n square in that case
    //so first optimization we can do is randomized quick sort

    public int partition(int[] arr, int l, int r){
        int left = l, right = l;
        int pivot = arr[r];
        while(right<=r){
            if(arr[right] <= pivot){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;right++;
            }else{
                right++;
            }
        }
        return left-1;
    }

    //randomized - this will reduce probability of worst case
    public int randomizedPartition(int[] arr, int l, int r) {
        int left = l, right = l;
        int randomInt = (int)(Math.random() * (r - l + 1)) + l;
        int temp1 = arr[r];
        arr[r] = arr[randomInt];
        arr[randomInt] = temp1;
        int pivot = arr[r];
        while(right<=r){
            if(arr[right] <= pivot){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;right++;
            }else{
                right++;
            }
        }
        return left-1;
    }

    public void quickSort(int[] arr, int l, int r){
        if(l>=r){
            return;
        }

        int pivot = partition(arr, l, r);
        quickSort(arr, l, pivot-1);
        quickSort(arr, pivot+1, r);

    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }
}
