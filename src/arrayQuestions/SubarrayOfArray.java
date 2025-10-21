package arrayQuestions;

public class SubarrayOfArray {

    //1. You are given an array of size 'n' and n elements of the same array.
    //2. You are required to find and print all the subarrays of the given array.
    //3. Each subarray should be space seperated and on a seperate lines.
    //Refer to sample input and output
    //3
    //10
    //20
    //30
    //Sample Output
    //10
    //10 20
    //10 20 30
    //20
    //20 30
    //30

    public static void printSubarrays(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + "\t");
                }System.out.println();
            }
        }
    }

}
