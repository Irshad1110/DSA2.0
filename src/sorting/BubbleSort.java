package sorting;

public class BubbleSort {


    //inplace and stable sorting algorithm
    public static int[] bubbleSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int count = 0; //to make best case as linear time
            for(int j = 0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }if(count == 0) break;
        }
        return arr;
    }
}
