package sorting;

public class MergeTwoSortedArrays {

    public static int[] mergeArrays(int a[], int b[]) {
        // code here
        int n1 = a.length;
        int n2 = b.length;
        int[] ans = new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(a[i] < b[j]){
                ans[k++] = a[i++];
            }else{
                ans[k++] = b[j++];
            }
        }
        while(i<n1){
            ans[k++] = a[i++];
        }
        while(j<n2){
            ans[k++] = b[j++];
        }
        return ans;
    }
}
