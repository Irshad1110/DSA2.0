package sorting.arrange;

public class WiggleSort {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void zigZag(int[] arr) {
        for(int i=0;i<arr.length;i=i+2){
            if (i - 1 >= 0 && arr[i - 1] < arr[i]) {
                swap(arr, i, i - 1);
            }
            if(i+1<arr.length && arr[i+1] < arr[i]) {
                swap(arr, i, i+1);
            }
        }

    }
}
