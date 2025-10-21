package arrayQuestions;

public class BarChart {

//    1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing elements of array a.
//3. You are required to print a bar chart representing value of arr a.
//            Input Format
//    A number n n1
//    n2
//            .. n number of elements
//    Output Format
//    A bar chart of asteriks representing value of array a


    //we can only go from top to bottom and left to right in the code output. so this is the solution.
    public static void printBarChart(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max) max = arr[i];
        }
        int x = max;
        for(int i=0;i<max;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j] >= x) {
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
            }System.out.println();
            x--;
        }
    }
}
