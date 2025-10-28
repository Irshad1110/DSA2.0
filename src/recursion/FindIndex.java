package recursion;

public class FindIndex {

    static int[] findIndex(int arr[], int key) {
        return findIndex(arr, key, arr.length-1);
    }


    static int[] findIndex(int arr[], int key, int n) {
        if(n==-1){
            return new int[]{-1, -1};
        }

        int[] smallAns = findIndex(arr, key, n-1);
        if(arr[n] == key) {
            if(n < smallAns[0] || smallAns[0]==-1) {
                smallAns[0] = n;
            }
            if(n>smallAns[1]) {
                smallAns[1] = n;
            }
        }
        return smallAns;
    }
}
