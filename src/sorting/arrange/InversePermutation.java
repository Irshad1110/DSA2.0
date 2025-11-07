package sorting.arrange;

public class InversePermutation {

    //Rearrange an array with O(1) extra space - GFG
    public void arrange(long[] arr) {
        long max = arr.length+1;
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] + (arr[(int)arr[i]]%max)*max;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]/max;
        }
    }
}
