package arrayQuestions;

public class Subtract2Arrays {


//    1. You are given a number n1, representing the size of array a1.
//    2. You are given n1 numbers, representing elements of array a1.
//    3. You are given a number n2, representing the size of array a2.
//    4. You are given n2 numbers, representing elements of array a2.
//    5. The two arrays represent digits of two numbers.
//    6. You are required to find the difference of two numbers
//    represented by two arrays and print the arrays. a2 - a1
//    Assumption - number represented by a2 is greater.

    public static int[] subtract(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] ans = new int[n1];
        int i = n1, j = n2, k = ans.length-1;
        int borrow = 0;
        while(i>0) {
            int d1 = arr1[i-1];
            int d2 = j>0 ? arr2[j-1]: 0;
            if(d1-d2  < 0) {
                ans[k] = d1-d2+borrow+10;
                borrow=-1;
            }else{
                ans[k] = d1-d2+borrow;
                borrow = 0;
            }
            i--;j--;k--;
        }
        return ans;
    }
}
