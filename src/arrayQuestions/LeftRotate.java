package arrayQuestions;

public class LeftRotate {

    public static void reverse(int arr[] , int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
    }

    public static int[] rotateArr(int arr[], int d) {
        // add your code here
        // 1, 2, 3, 4, 5
        // 2 1 5 4 3
        //3 4 5 1 2
        d = d % arr.length; //for large d
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
        return arr;
    }
}
