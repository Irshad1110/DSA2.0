package sorting;

public class QuickSortThreeWay {


    //chances of worst case is very less now but its still n square
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void randomize(int[] arr, int l, int r){
        int randomInt = (int)(Math.random() * (r - l + 1) + l);
        swap(arr, randomInt, r);
    }

    public int[] partition(int[] arr, int start, int end){
        int left = start, mid = start, right=end;
        randomize(arr, start, end);
        int pivot = arr[end];
        while(mid<=right){
            if(arr[mid] < pivot){
                swap(arr, mid, left);
                left++;mid++;
            }else if(arr[mid] == pivot){
                mid++;
            }else{
                swap(arr, mid, right);
                right--;
            }
        }
        return new int[]{left, right};
    }

    public void quickSort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }

        int[] pivot = partition(arr, start, end);
        quickSort(arr, start, pivot[0]-1);
        quickSort(arr, pivot[1]+1, end);

    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }
}
