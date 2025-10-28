package recursion;

public class PrintArray {

    public static void printArray(int arr[]) {

        printArray(arr, arr.length-1);
    }

    public static void printArray(int arr[], int n) {
        if(n==-1) return;

        printArray(arr, n-1);
        System.out.print(arr[n]+ " ");
    }
}
