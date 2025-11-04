package sorting;

public class InsertionSort {

    // inplace and stable
    public void insertionSort(int arr[]) {
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int j = i+1;
            while(j>0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
